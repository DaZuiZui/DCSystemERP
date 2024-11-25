<!--
   陈志祥
   @email: 1017850280@qq.com
-->
<template>
    <div id="app">
        <div class="content">

            <div class="Left_content">
                <RecursiveMenu :routes="mainRouters"></RecursiveMenu>
            </div>
            <div class="Rright_content">
                <router-view />
            </div>
        </div>
    </div>
</template>

<script>
import RecursiveMenu from "@/view/components/fream/RecursiveMenu.vue";
import router, { mainRouters } from '@/router/index.js';
export default {

    name: 'App',
    components: {
        RecursiveMenu
    },
    data() {
        return {
            mainRouters
        }
    },

    mounted() {
        console.log(mainRouters,
            '父组件已从router获取路由数据');
    },

    methods: {


    }
}
</script>
<style scoped>
.content {
    display: flex;
    justify-content: center;
    width: 100%;
    height: 850px;
    background-color: aqua;

    .Left_content {
        width: 14%;
        background-color: pink;
    }

    .Rright_content {
        width: 80%;
        background-color: yellow;
    }

    /* el-card的样式 */
    .text {
        font-size: 14px;
    }

    .item {
        padding: 18px 0;
    }

    .box-card {
        width: 100%;
    }
}
</style>