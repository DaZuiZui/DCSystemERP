//package com.gsxy.core.controller;
//
//import com.alibaba.fastjson2.JSONArray;
//import com.gsxy.core.pojo.bo.UserLoginBo;
//import com.gsxy.core.pojo.bo.UserPageBo;
//import com.gsxy.core.pojo.bo.UserRegBo;
//import com.gsxy.core.pojo.vo.ResponseVo;
//import com.gsxy.core.service.RoleService;
//import com.gsxy.core.service.UserService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import static com.gsxy.core.pojo.enums.CodeValues.PARAMETER_ERROR;
//import static com.gsxy.core.pojo.enums.MessageValues.PARAMETER_MESSAGE;
//
//
//@CrossOrigin
//@Api(value = "角色板块接口",tags = {"角色板块接口"})
//@RestController
//@RequestMapping("/role")
//public class RoleController {
//
//    @Autowired
//    private RoleService roleService;
//
//    /**
//     *      用户注册
//     * @param userRegBo
//     * @return
//     */
//    @PostMapping("/userReg")
//    @ApiOperation("用户注册")
//    public String userReg(@RequestBody UserRegBo userRegBo){
//        if(userRegBo == null){
//            JSONArray.toJSONString(
//                    ResponseVo.builder()
//                            .code(PARAMETER_ERROR)
//                            .message(PARAMETER_MESSAGE)
//                            .data(null)
//                            .build()
//            );
//        }
//    }
//
//    /**
//     * @author hln 2024-8-25
//     *      分页查询用户列表
//     * @return
//     */
//    @PostMapping("/queryPageUser")
//    @ApiOperation("分页查询用户列表")
//    public String queryPageUser(@RequestBody UserPageBo userPageBo){
//    }
//
//}
