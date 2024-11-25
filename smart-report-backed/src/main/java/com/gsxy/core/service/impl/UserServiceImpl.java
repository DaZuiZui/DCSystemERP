package com.gsxy.core.service.impl;

import com.gsxy.core.mapper.UserMapper;
import com.gsxy.core.pojo.Users;
import com.gsxy.core.pojo.bo.UserLoginBo;
import com.gsxy.core.pojo.bo.UserRegBo;
import com.gsxy.core.pojo.enums.CodeValues;
import com.gsxy.core.pojo.enums.MessageValues;
import com.gsxy.core.pojo.vo.ResponseVo;
import com.gsxy.core.pojo.vo.UserVo;
import com.gsxy.core.service.UserService;
import com.gsxy.core.util.JwtUtil;
import com.gsxy.core.util.LoginUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static com.gsxy.core.pojo.enums.CodeValues.SUCCESS_CODE;
import static com.gsxy.core.pojo.enums.MessageValues.SUCCESS_MESSAGE;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public ResponseVo userReg(UserRegBo userRegBo) {
        log.info("注册信息:{}", userRegBo);

        Users user = userMapper.selectByUsername(userRegBo.getUsername());
        if (user != null) {
            return ResponseVo.builder()
                    .code(CodeValues.ERROR_CODE)
                    .message("用户名已存在")
                    .build();
        }

        userMapper.insert(Users.builder()
                .password(userRegBo.getPassword())
                .username(userRegBo.getUsername())
                .createTime(new Date())
                .updateTime(new Date())
                .build());

        return ResponseVo.builder()
                .code(CodeValues.SUCCESS_CODE)
                .message(MessageValues.SUCCESS_MESSAGE)
                .build();
    }


    @Override
    public ResponseVo userLogin(UserLoginBo userLoginBo) {
        log.info("登录信息:{}", userLoginBo);
        Users user = userMapper.selectByUsername(userLoginBo.getUsername());
        if (user == null) {
            return ResponseVo.builder()
                    .code(CodeValues.ERROR_CODE)
                    .message("用户名不存在")
                    .build();
        }
        if (userLoginBo.getPasswd().equals(user.getPassword())) {
            String jwt = JwtUtil.createJWT(user);
            return ResponseVo.builder()
                    .code(CodeValues.SUCCESS_CODE)
                    .message(MessageValues.SUCCESS_MESSAGE)
                    .user(user)
                    .data(jwt)
                    .build();
        }
        return ResponseVo.builder()
                .code(CodeValues.ERROR_CODE)
                .message("密码错误")
                .build();
    }

    @Override
    public ResponseVo getProfiles() {
        return ResponseVo.builder()
                .data(userMapper.queryById(LoginUtils.getLoginUserId()))
                .code(CodeValues.SUCCESS_CODE)
                .message(MessageValues.SUCCESS_MESSAGE)
                .build();
    }

    @Override
    public ResponseVo queryPageUser(Long page, Long limit) {

        page = (page - 1) * limit;
        List<UserVo> userVoList = userMapper.queryPageUser(page,limit);
        Long count = userMapper.queryPageUserCount(page,limit);

        return ResponseVo.builder()
                .message(SUCCESS_MESSAGE)
                .code(SUCCESS_CODE)
                .data(userVoList)
                .count(count)
                .build();
    }


}
