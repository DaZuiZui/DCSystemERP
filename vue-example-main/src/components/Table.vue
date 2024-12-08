<template>
    <!-- 表格的数据 -->
    <el-table :data="data">
        <el-table-column v-for="filed in PropsData" :key="filed.prop" v-bind="filed">
            <template v-if="filed.prop && $scopedSlots[filed.prop]" #default="scope">
                <slot :name="filed.prop" :row="scope.row" />
            </template>
        </el-table-column>
    </el-table>
</template>
<script>
export default {
    name: 'Table',
    data() {
        return {
            PropsData: this.columns
        }
    },
    props: {
        columns: {
            type: Array,
            default: () => []
        },
        data: {
            type: Array,
            default: () => []
        }
    },
    mounted() {
        console.log(this.columns, '接受到的数据父类数据')
    }

}
</script>
<style scoped></style>