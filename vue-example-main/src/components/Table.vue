<template>
    <!-- 表格的数据 -->
    <el-table>
        <!-- <template #empty>
            <el-empty description="暂无数据" />
        </template> -->
        <el-table-column v-for="filed in columns" :key="filed.prop" v-bind="filed">
            <template v-if="filed.prop && $slots[filed.prop]" #default="scope">
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

        }
    },
    props: {
        columns: {
            type: Array,
            default: () => []
        }
    },

}
</script>
<style scoped></style>