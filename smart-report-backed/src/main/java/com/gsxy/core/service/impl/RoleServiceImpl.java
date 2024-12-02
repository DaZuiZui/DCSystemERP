package com.gsxy.core.service.impl;

import cn.hutool.core.lang.Console;
import com.gsxy.core.mapper.UserMapper;
import com.gsxy.core.pojo.Users;
import com.gsxy.core.pojo.bo.UserLoginBo;
import com.gsxy.core.pojo.bo.UserPageBo;
import com.gsxy.core.pojo.bo.UserRegBo;
import com.gsxy.core.pojo.enums.CodeValues;
import com.gsxy.core.pojo.enums.MessageValues;
import com.gsxy.core.pojo.vo.ResponseVo;
import com.gsxy.core.pojo.vo.UserVo;
import com.gsxy.core.service.RoleService;
import com.gsxy.core.service.UserService;
import com.gsxy.core.util.JwtUtil;
import com.gsxy.core.util.LoginUtils;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static com.gsxy.core.pojo.enums.CodeValues.SUCCESS_CODE;
import static com.gsxy.core.pojo.enums.MessageValues.SUCCESS_MESSAGE;

@Service
@Log4j
public class RoleServiceImpl implements RoleService {

    @Autowired
    private UserMapper userMapper;


}
