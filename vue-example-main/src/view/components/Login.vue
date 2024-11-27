<template>
  <div class="hello">

    <div class="login">
      <div class="login-box">
        <div style="flex: 1;display: flex">
          <img src="@/assets/blue.jpg" style="width: 100%">
        </div>
        <div style="flex:1">
          <el-form :model="userLoginBo">
            <div style="font-size: 20px; font-weight: bold; text-align: center;margin-bottom:18px">DCSystemERP系统</div>

            <el-form-item prop="username">
              <el-input prefix-icon="el-icon-user" size="medium" v-model="userLoginBo.username"
                placeholder="请输入账号"></el-input>
            </el-form-item>
            <el-form-item prop="password">
              <el-input prefix-icon="el-icon-lock" show-password size="medium" v-model="userLoginBo.passwd"
                placeholder="请输入密码"></el-input>
            </el-form-item>


            <el-form-item>
              <el-button @click="login()" style="margin-top:16px;width: 100%">登录</el-button>
            </el-form-item>

          </el-form>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
// import { synRequestPost, synRequestGet } from "../../../../static/request"
// import { login } from "@/api/user";
// import { setCookie } from "../../../../static/ZuiBlog/ZuiBlog";


export default {
  name: 'HelloWorld',
  // components: {
  //   Foot, Top
  // },
  data() {
    return {
      userLoginBo: {
        username: "",
        passwd: "",
      },

    }
  },
  mounted() {

  },

  methods: {
    //提交登入
    async login() {
      this.switchbutton = true;
      const object = login(this.userLoginBo)
        .then((obj) => {
          if (obj && obj.code === "0x200") {
            console.log("登录成功", obj.data);
            setCookie("token", obj.data);
            setCookie("role", obj.role);
            alert(obj.message);
            this.$router.push("/form");
            this.switchbutton = false;
            return obj
            // 处理登录成功后的操作
          } else {
            console.error("登录失败", obj.message);
            alert(obj.message);
            this.switchbutton = false;
            // return
          }
        })
        .catch((error) => {
          console.error("登录请求失败", error);
        });;

    },
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
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
  width: 50%;
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

.validCode {
  flex: 1;
  display: flex;
  justify-content: center;
  margin-top: 1px;

}

.el-button--default {
  background-color: #bdebe0 !important;
  border-color: #46eac2 !important;
}
</style>