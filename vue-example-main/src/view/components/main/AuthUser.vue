<!--
   陈志祥
   @email: 1017850280@qq.com
-->
<template>
    <div>
        <AddDialog :columns="TABLECOLUMN" title="请添加权限" butName="添加权限">
            <template slot="password">
                <el-input v-model="addName.password" placeholder=""></el-input>
            </template>
            <template slot="username">
                <el-input v-model="addName.username" placeholder=""></el-input>
            </template>
        </AddDialog>
        <FixDialog @configBtn="configBtn" :columns="TABLECOLUMN" title="请修改用户信息" :showbtn="fixbtn">
            <template slot="password">
                <el-input v-model="fixName.password" placeholder=""></el-input>
            </template>
            <template slot="username">
                <el-input v-model="fixName.username" placeholder=""></el-input>
            </template>
        </FixDialog>
        <Table :data="tableData" :columns="TABLECOLUMN">
            <template slot-scope="{row}" slot="action">
                <el-button type="primary" size="mini" @click="handleEdit(row)">编辑</el-button>
                <el-button type="primary" size="mini" @click="handleDelete(row)">删除</el-button>
            </template>
        </Table>
        <Pagenation :total="countPage" :nowpage="userPage.page" :limit="userPage.limit" @page_change="pageChange">
        </Pagenation>
    </div>
</template>

<script>
import FixDialog from '@/components/FixDialog.vue';
import AddDialog from '@/components/AddDialog.vue'
import Table from '@/components/Table.vue';
import Pagenation from '@/components/Pagenation.vue';
import { Pagination, FixUser, DeleteUser } from '@/api/user.js';
export default {
    name: 'AuthUser',
    components: {
        Table,
        Pagenation,
        AddDialog,
        FixDialog
    },
    data() {
        return {
            fixName: {
                id: '',
                password: '',
                username: ''
            },
            fixbtn: false,
            addName: {
                password: '',
                username: ''
            },
            countPage: 10,
            tableData: [],
            userPage: {
                page: 1,
                limit: 5
            },
            TABLECOLUMN: [
                {
                    label: '序号',
                    type: 'index',
                    width: 200
                },
                {
                    label: '创建人',
                    prop: 'password',
                    width: 200
                },
                {
                    label: '权限名字',
                    prop: 'username',
                    width: 200
                },
                {
                    label: '操作',
                    prop: 'action',
                    width: 250
                }

            ]
        }
    },

    mounted() {
        this.pageChange(1)
    },

    methods: {
        //删除的按钮
        async handleDelete(row) {
            const result = await DeleteUser(row.id)
            if (result.data.code == '0x200') {
                this.$notify({
                    title: '成功',
                    message: '删除成功',
                    type: 'success'
                });
                this.pageChange(1)
            }
        },
        //修改按钮的请求按钮
        async configBtn() {
            const result = await FixUser(this.fixName)
            if (result.data.code == '0x200') {
                this.fixName.password = '';
                this.fixName.username = '';
                this.$notify({
                    title: '成功',
                    message: '修改成功',
                    type: 'success'
                });
            }
            console.log(result, 'configBtn');
        },
        async pageChange(pager) {
            //当前页码器的页码
            this.userPage.page = pager;
            const result = await Pagination(this.userPage)
            if (result.data.code == '0x200') {
                this.tableData = result.data.data;
                this.countPage = result.data.count;
                // console.log(this.tableData, "result");
            }
        },
        //修改的按钮
        handleEdit(row) {
            // console.log(row.id);
            this.fixbtn = true;
            this.fixName.id = row.id;
            // this.$emit('edit', row);
        },

    }
}
</script>
<style scoped></style>