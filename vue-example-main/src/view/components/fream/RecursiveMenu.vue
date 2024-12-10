<template>
  <div>
    <el-row class="tac">
      <el-col :span="16">
        <!-- <h5>DCSystemERP</h5> -->
        <el-menu class="el-menu-vertical-demo" router>
          <template v-for="(route, index) in propsValue">
            <!-- 无子路由 -->
            <el-menu-item v-if="!route.children && !route.meta.hidden" :index="route.path">
              <i :class="route.meta.icon"></i>
              {{ route.meta.title }}
            </el-menu-item>

            <!-- 单个子路由 -->
            <el-menu-item v-else-if="route.children && route.children.length === 1 && !route.children[0].meta.hidden"
              :index="route.children[0].path">
              <i :class="route.children[0].meta.icon"></i>
              {{ route.children[0].meta.title }}
            </el-menu-item>

            <!-- 多个子路由 -->
            <el-submenu v-else-if="route.children && route.children.length > 1" :index="route.path">
              <template slot="title">
                <i :class="route.meta.icon"></i>
                {{ route.meta.title }}
              </template>
              <recursive-menu :routes="route.children" />
            </el-submenu>
          </template>
        </el-menu>
      </el-col>

    </el-row>

  </div>

</template>


<script>

export default {
  name: 'RecursiveMenu',
  props: {
    routes: {
      type: Array,
      required: true
    }
  },
  data() {
    return {
      propsValue: this.routes
    }
  },
  computed: {
    activeMenu() {
      return this.$route.path;
    }
  },
  components: {
    RecursiveMenu: resolve => require(['./RecursiveMenu.vue'], resolve) // 递归调用自身
  },
  mounted() {
    // console.log(this.routes, '子组件接受父传递的路由数据');
  },
  methods: {
    //点击菜单的回调
    goRoute: function (vc) {
      //路由跳转
      // $router.push(vc.index);
    }


  }
};
</script>

<style scoped>
.el-menu-vertical-demo {
  width: 200px;
}
</style>