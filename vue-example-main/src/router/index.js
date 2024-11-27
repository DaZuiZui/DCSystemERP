/**
 * 杨易达
 * @email: y51288033@outlook.com
 *         y51288033@gmail.com
 */
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

//主入口路由
export const mainRouters =
  [//主页
    {
      path: "/",
      name: "home",
      component: resolve => (require(["@/view/HomeView"], resolve)),
      meta: {
        title: '导航栏',
        icon: 'el-icon-s-home',
        hidden: false,
      },
      redirect: "authuser",
      children: [
        {
          path: "authuser",
          name: "authuser",
          component: resolve => (require(["@/view/components/main/AuthUser"], resolve)),
          meta: {
            title: '用户模块',
            icon: 'el-icon-s-home',
            hidden: false,
          },
        },
        {
          path: "channel",
          name: "channel",
          component: resolve => (require(["@/view/components/main/channel"], resolve)),
          meta: {
            title: '通道模块',
            icon: 'el-icon-s-home',
            hidden: false,
          },
        }

      ],
    },
    {
      path: '/Login',
      name: 'Login',
      component: resolve => (require(["@/view/components/Login"], resolve)),
      //每一个加上meta用于导航栏遍历避免报错
      meta: {
        title: '登录页面',
        icon: 'el-icon-s-home',
        // false为显示,true为不显示
        hidden: true,
      },
    },
    {
      path: '/UserReg',
      name: 'UserReg',
      component: resolve => (require(["@/view/components/UserReg"], resolve)),
      //每一个加上meta用于导航栏遍历避免报错
      meta: {
        title: '注册页面',
        icon: 'el-icon-s-home',
        // false为显示,true为不显示
        hidden: true,
      },
    },
    {
      path: '/RecursiveMenu',
      name: 'RecursiveMenu',
      component: resolve => (require(["@/view/components/fream/RecursiveMenu"], resolve)),
      //每一个加上meta用于导航栏遍历避免报错
      meta: {
        title: '导航栏',
        icon: 'el-icon-s-home',
        // false为不显示,true为显示
        hidden: true,
      },
    },
    {
      path: '/HelloWorld',
      name: 'HelloWorld',
      component: resolve => (require(["@/components/HelloWorld"], resolve)),
      meta: {
        title: 'hello',
        icon: 'el-icon-s-home',
        hidden: true,
      }
    },
    {
      path: '/userindex',
      name: 'userindex',
      component: resolve => (require(["@/view/modules/user/index"], resolve)),
      meta: {
        title: 'userindex',
        icon: 'el-icon-s-home',
        hidden: true,
      }
    }
  ]

const router = new Router({
  mode: "hash",
  routes: mainRouters,
})

/**
 * 路由前置环绕
 * 可以做的事情，比如做单点登入，或者查看用户是否有权限访问此页面
 * @param to    去哪个页面来
 * @param from  从哪个页面来
 * @param next  如果放行则是next(),跳转其他的next();
 */
router.beforeEach(async (to, from, next) => {
  console.log("router前置环绕");

  next()
})

/**
 * 路由后置环绕
 * @param to    去哪个页面来
 * @param from  从哪个页面来
 */
router.afterEach(async (to, from) => {
  console.log("router后置环绕");
})


export default router