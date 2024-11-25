<template>
    <div>
        <!-- <div id="app">
            <Top></Top>
        </div> -->
        <div>
            <Content></Content>
        </div>
        <!-- <div>
            <Foot></Foot>
        </div> -->
    </div>
</template>

<script>

// import Top from '@/view/components/frame/LoginTop'
// import Foot from "@/view/components/frame/Foot";

import Content from '@/view/components/main-content'
export default {
    name: 'HomeView',
    components: {
        Content
    },

}
</script>
