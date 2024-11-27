<template>
    <div class="login">
        <div class="login-box">
            <div style="flex: 1;display: flex">
                <img src="@/assets/green.jpg" style="width: 100%">
            </div>
            <div style="flex:1">
                <el-form :model="user">
                    <div style="font-size: 20px; font-weight: bold; text-align: center;margin-bottom:18px">
                        欢迎注册智DCSystemERP系统账号</div>

                    <el-form-item prop="username">
                        <el-input v-model="user.username" placeholder="请输入账号"></el-input>
                    </el-form-item>
                    <el-form-item prop="password1">
                        <el-input v-model="user.password1" placeholder="请输入密码"></el-input>
                    </el-form-item>
                    <!-- <el-form-item prop="password2">
                        <el-input v-model="user.password2" placeholder="再次输入密码"></el-input>
                    </el-form-item> -->

                    <el-form-item>
                        <el-button @click="register" type="success">注册</el-button>
                    </el-form-item>
                    <div style="display: flex;">
                        <div style="flex: 1">前往<span @click="toLogin" style="color:#0f9876;cursor: pointer">登录</span>页面
                        </div>
                    </div>
                </el-form>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'HelloWorld',
    // components: {
    //   Foot, Top
    // },
    data() {
        return {
            user: {
                username: "",
                password1: "",
                // password2: "",
            },

        }
    },
    mounted() {

    },

    methods: {
        toLogin() {
            this.$router.push("/Login");
        },
        register() {

        }

    }
}
</script>
<style>
.login {
    height: 100vh;
    display: flex;
    align-items: center;
    justify-content: center;
    background-color: #edf2fa
}

.login-box {
    display: flex;
    background-color: #fff;
    width: 55%;
    border-radius: 5px;
    overflow: hidden;
}

.el-form {
    margin: 85px 15px;

}

.s-canvas {
    display: flex;
    justify-content: center;
}

.el-button--success {
    color: #FFF;
    background-color: rgba(15, 152, 220) !important;
    border-color: rgba(15, 152, 220) !important;
    cursor: pointer;
    margin-top: 16px;
    width: 100%
}
</style>
