<template>
  <div><el-menu :default-active="activeMenu" class="el-menu-vertical-demo" router>
      <template v-for="route in routes" :key="route.path">
        <!-- 如果有子路由，使用 el-submenu -->
        <el-submenu v-if="route.children == []" :key="route.path" :index="route.path">
          <template slot="title">
            <!-- <i v-if="route.meta.icon" :class="route.meta.icon"></i> -->
            <span>{{ route.meta.title }}</span>
          </template>
          <!-- 递归渲染子菜单 -->
          <recursive-menu :routes="route.children" />
        </el-submenu>

        <!-- 如果没有子路由，使用 el-menu-item -->
        <el-menu-item v-else :key="`submenu-${route.path}`" :index="route.path">
          <!-- <i v-if="route.meta.icon" :class="route.meta.icon"></i> -->
          <span slot="title">{{ route.meta.title }}</span>
        </el-menu-item>
      </template>
    </el-menu>
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
  }
};
</script>

<style scoped>
.el-menu-vertical-demo {
  width: 200px;
}
</style>