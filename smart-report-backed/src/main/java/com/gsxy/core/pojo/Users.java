package com.gsxy.core.pojo;

import lombok.*;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(Users)实体类
 *
 * @author makejava
 * @since 2024-11-18 17:25:21
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Users implements Serializable {
    private static final long serialVersionUID = -70255225523229042L;
/**
     * 用户ID
     */
    private Long id;
/**
     * 用户名
     */
    private String username;
/**
     * 密码
     */
    private String password;
    private Integer role; // 权限
/**
     * 邮箱
     */
    private String email;
/**
     * 手机号
     */
    private String phone;
/**
     * 收货地址
     */
    private String address;
/**
     * 注册时间
     */
    private Date createdTime;
/**
     * 创建人
     */
    private Long createdBy;
/**
     * 更新时间
     */
    private Date updatedTime;
/**
     * 修改人
     */
    private Long updatedBy;

}

