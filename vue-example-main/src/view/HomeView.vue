<template>
    <div>
        <div>
            <Top v-if="showNavigator != '' ? false : true"></Top>
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
import { GET_TOKEN } from '@/utils/cookie'
import Content from '@/view/components/main-content'
export default {
    name: 'HomeView',
    components: {
        Content,
        Top
    },
    data() {
        return {
            showNavigator: GET_TOKEN('TOKEN')
        }

    },
    mounted() {
        // console.log(this.showNavigator, 'showNavigator');
    }

}
</script>
