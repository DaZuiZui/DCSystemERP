<!--
   陈志祥
   @email: 1017850280@qq.com
-->
<template>
    <div>
        <Table :data="tableData" :columns="TABLECOLUMN">
            <template slot-scope="{row}" slot="action">
                <el-button type="primary" size="mini" @click="handleEdit(row)">编辑</el-button>
            </template>
        </Table>
        <Pagenation :total="countPage" :nowpage="userPage.page" :limit="userPage.limit" @page_change="pageChange">
        </Pagenation>
    </div>
</template>

<script>
import Table from '@/components/Table.vue';
import Pagenation from '@/components/Pagenation.vue';
import { Pagination } from '@/api/user.js';
export default {
    name: 'AuthUser',
    components: {
        Table,
        Pagenation
    },
    data() {
        return {
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
        async pageChange(pager) {
            //当前页码器的页码
            this.userPage.page = pager;
            const result = await Pagination(this.userPage)
            if (result.data.code == '0x200') {
                this.tableData = result.data.data;
                this.countPage = result.data.count;
                console.log(this.tableData, "result");
            }
        },
        //修改的按钮
        handleEdit(row) {
            console.log(row.id);
            // this.$emit('edit', row);
        },

    }
}
</script>
<style scoped></style>