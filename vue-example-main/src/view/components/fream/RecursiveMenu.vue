<template>
  <div>
    <el-row class="tac">
      <el-col :span="16">
        <h5>默认颜色</h5>
        <el-menu class="el-menu-vertical-demo" router>
          <template v-for="(route, index) in  propsValue ">
            <!-- 如果没有子路由，使用 el-menu-item -->
            <template v-if="!route.children">
              <el-menu-item v-if="!route.meta.hidden" :key="route.path" :index="route.path">
                <i :class="route.meta.icon"></i>
                <span slot="title">{{ route.meta.title }}</span>
              </el-menu-item>
            </template>
            <!-- 如果有子路由，且只有一个子路由使用，使用 el-menu-item -->
            <!-- <template v-if="!route.children && route.children.length == 1">
              <el-menu-item v-if="!route.children[0].meta.hidden" :key="route.children[0].path"
                :index="route.children[0].path">
                <i :class="route.children[0]meta.icon"></i>
                <span slot="title">{{ route.children[0].meta.title }}</span>
              </el-menu-item>
            </template> -->


            <!-- 如果有子路由，且多个子路由使用 el-submenu -->
            <!-- <el-submenu-menu v-if="!route.children && route.children.length > 1" :key="route.children[0].path"
              :index="route.path">
              <i :class="route.meta.icon"></i>
              <span slot="title">{{ route.meta.title }}</span>

              <recursive-menu :routes="route.children" />
            </el-submenu-menu> -->



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
    console.log(this.routes, '子组件接受父传递的路由数据');
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