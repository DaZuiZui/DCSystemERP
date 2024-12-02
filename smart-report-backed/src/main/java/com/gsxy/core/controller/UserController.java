package com.gsxy.core.controller;

import com.alibaba.fastjson2.JSONArray;
import com.gsxy.core.pojo.bo.UpdateUserBo;
import com.gsxy.core.pojo.bo.UserLoginBo;
import com.gsxy.core.pojo.bo.UserPageBo;
import com.gsxy.core.pojo.bo.UserRegBo;
import com.gsxy.core.pojo.vo.ResponseVo;
import com.gsxy.core.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.gsxy.core.pojo.enums.CodeValues.PARAMETER_ERROR;
import static com.gsxy.core.pojo.enums.MessageValues.PARAMETER_MESSAGE;


@CrossOrigin
@Api(value = "用户板块接口",tags = {"用户板块接口"})
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     *      用户注册
     * @param userRegBo
     * @return
     */
    @PostMapping("/userReg")
    @ApiOperation("用户注册")
    public String userReg(@RequestBody UserRegBo userRegBo){
        if(userRegBo == null){
            JSONArray.toJSONString(
                    ResponseVo.builder()
                            .code(PARAMETER_ERROR)
                            .message(PARAMETER_MESSAGE)
                            .data(null)
                            .build()
            );
        }
        ResponseVo responseVo = userService.userReg(userRegBo);
        return JSONArray.toJSONString(responseVo);
    }

    /**
     *      用户登录
     * @param userLoginBo
     * @return
     */
    @PostMapping("/login")
    @ApiOperation("用户登录")
    public String userLogin(@RequestBody UserLoginBo userLoginBo){

        if(userLoginBo == null){
            JSONArray.toJSONString(
                    ResponseVo.builder()
                            .code(PARAMETER_ERROR)
                            .message(PARAMETER_MESSAGE)
                            .data(null)
                            .build()
            );
        }

        return JSONArray.toJSONString(userService.userLogin(userLoginBo));
    }

    /**
     * @author hln 2024-8-25
     *      分页查询用户列表
     * @return
     */
    @PostMapping("/queryPageUser ")
    @ApiOperation("分页查询用户列表")
    public String queryPageUser(@RequestBody UserPageBo userPageBo){
        return JSONArray.toJSONString(userService.queryPageUser(userPageBo));
    }

    @GetMapping("/delete/{id}")
    @ApiOperation("逻辑删除")
    public String delete(@PathVariable Long id){
        return JSONArray.toJSONString(userService.delete(id));
    }

    @PostMapping("/update")
    @ApiOperation("逻辑删除")
    public String update(@RequestBody UpdateUserBo updateUserBo){
        return JSONArray.toJSONString(userService.update(updateUserBo));
    }

    /**
     *      完善用户信息
     * @return
     */
    @GetMapping("/getProfiles")
    @ApiOperation("完善用户信息")
    public String getProfiles(){
        return JSONArray.toJSONString(userService.getProfiles());
    }

}
