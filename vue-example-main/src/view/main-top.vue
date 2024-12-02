<!--
   杨易达
   @email: y51288033@outlook.com
           y51288033@gmail.com
-->
<template>
    <div class="topstyle">
        <div class="content">
            <el-link @click="loginBtn" type="primary">登录</el-link>
            <el-link @click="registerBtn" type="success">注册</el-link>
        </div>
    </div>
</template>

<script>
export default {


    name: 'main-top',

    data() {
        return {

        }
    },

    mounted() {
        console.log("用户的简历")
        this.$emit('childEvent', "你好我给我的父组件值");
    },

    methods: {
        //跳转登录页面
        loginBtn() {
            this.$router.push("/Login");
        },
        registerBtn() {
            this.$router.push("/UserReg");
        }

    }
}
</script>
<style scoped>
.topstyle {
    width: 100%;
    /* background-color: pink; */
    text-align: right;
}

.topstyle .content {
    width: 90%;
    /* background-color: skyblue; */
}

.el-divider__text,
.el-image__error,
.el-link,
.el-timeline,
.el-transfer__button i,
.el-transfer__button span {
    font-size: 20px;
    padding: 10px;

}
</style>
