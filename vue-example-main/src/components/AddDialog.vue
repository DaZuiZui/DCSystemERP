<template>
    <div class="hello">
        <!-- 添加权限的按钮 -->
        <el-button @click="showBtn" type="primary" plain>{{ butName }}</el-button>
        <el-dialog :visible.sync="dialogVisible" :title="title" width="500">
            <el-form>
                <el-form-item v-for="filed in columns" v-show="$scopedSlots[filed.prop]" :key="filed.prop"
                    v-bind="filed">
                    <template v-if="filed.prop && $scopedSlots[filed.prop]">
                        <slot :name="filed.prop"></slot>
                    </template>
                </el-form-item>
            </el-form>
            <template #footer>
                <div class="dialog-footer">
                    <el-button @click="dialogVisible = false">取消</el-button>
                    <el-button type="primary" @click=" dialogVisible = false, $emit('configBtn')">
                        确认
                    </el-button>
                </div>
            </template>
        </el-dialog>
    </div>
</template>

<script>
export default {
    name: 'AddDialog',
    props: {
        // 表格列
        title: {
            type: String,
            default: ''
        },
        // configBtn: {
        //     type: Function,
        //     default: () => { }
        // },
        butName: {
            type: String,
            default: ''
        }
        ,// 表格列
        columns: {
            type: Array,
            default: ''
        }
    },
    data() {
        return {
            //控制对话框的显示与隐藏
            dialogVisible: false
        }
    },
    methods: {
        //添加按钮
        showBtn() {
            console.log('showBtn');
            this.dialogVisible = true
        }
    }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style></style>
