<!--
   陈志祥
   @email: 1017850280@qq.com
-->
<template>
    <div>
        <Table :data="tableData" :columns="TABLECOLUMN"></Table>
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
                limit: 10
            },
            TABLECOLUMN: [
                {
                    label: '序号',
                    type: 'index',
                    width: 200
                },
                {
                    label: '创建人',
                    prop: 'createdByText',
                    width: 200
                },
                {
                    label: '权限名字',
                    prop: 'name',
                    width: 200
                },
                {
                    label: '创建时间',
                    prop: 'createdTime',
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
        this.pageChange()
    },

    methods: {
        async pageChange(pager = 1) {
            //当前页码器的页码
            this.userPage.page = pager;
            const result = await Pagination(this.userPage)
            // if (result.data.code == '0x200') {

            console.log(result, "result");
            // }
        }

    }
}
</script>
<style scoped></style>