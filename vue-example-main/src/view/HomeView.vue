<template>
    <div>
        <div>
            <Top></Top>
        </div>
        <div>
            <Content></Content>
        </div>
        <!-- <div>
            <Foot></Foot>
        </div> -->
    </div>
</template>

<script>

import Top from '@/view/main-top'
// import Foot from "@/view/components/frame/Foot";

import Content from '@/view/components/main-content'
export default {
    name: 'HomeView',
    components: {
        Content,
        Top
    },

}
</script>
