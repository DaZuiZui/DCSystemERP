<template>
    <div class="hello">
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
    name: 'FixDiallog',
    data() {
        return {
            //控制对话框的显示与隐藏
            dialogVisible: this.showbtn
        }
    },
    props: {
        // 表格列
        title: {
            type: String,
            default: ''
        },
        configBtn: {
            type: Function,
            default: () => { }
        },
        showbtn: {
            type: Boolean,
            default: false
        },
        // 表格列
        columns: {
            type: Array,
            default: ''
        }
    },
    watch: {
        showbtn(newValue, oldValue) {
            // console.log(newValue, 'new', oldValue, 'old');
            this.dialogVisible = newValue
        }
    },
    mounted() {
        console.log(this.showbtn, 'showbtn');
    }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
