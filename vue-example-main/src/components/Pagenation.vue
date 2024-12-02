<template>
    <div style="margin-top:20px">
        <el-pagination background @current-change="currpage" :current-page="nowpage" :page-size="limit"
            layout="total,prev, pager, next,->,jumper" :total="total" />
    </div>
</template>
<script>
export default {
    name: 'Pagenation',
    data() {
        return {

        }
    },
    props: {
        total: {
            type: Number,
            default: () => []
        },
        nowpage: {
            type: Number,
            default: () => []
        },
        limit: {
            type: Number,
            default: () => []
        },
    },
    methods: {
        currpage(val) {
            console.log(val);
            this.$emit('page_change', val)
        }
    }


}
</script>
<style scoped></style>