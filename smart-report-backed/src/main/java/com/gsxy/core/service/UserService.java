package com.gsxy.core.service;

import com.gsxy.core.pojo.bo.UpdateUserBo;
import com.gsxy.core.pojo.bo.UserLoginBo;
import com.gsxy.core.pojo.bo.UserPageBo;
import com.gsxy.core.pojo.bo.UserRegBo;
import com.gsxy.core.pojo.vo.ResponseVo;

public interface UserService {

    ResponseVo userReg(UserRegBo userRegBo);

    ResponseVo userLogin(UserLoginBo userLoginBo);

    ResponseVo queryPageUser(UserPageBo userPageBo);

    ResponseVo getProfiles();

    ResponseVo delete(Long id);

    ResponseVo update(UpdateUserBo updateUserBo);
}
