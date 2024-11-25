package com.gsxy.core.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表(User)实体类
 *
 * @author makejava
 * @since 2024-11-24 17:23:26
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Users implements Serializable {
    private static final long serialVersionUID = -51685019396618367L;

    private Long id;
/**
     * 用户名
     */
    private String username;
/**
     * 密码
     */
    private String password;
/**
     * 学号/工号
     */
    private String studentId;
/**
     * 微信一键登录id
     */
    private String openId;
/**
     * 创建人
     */
    private Long createBy;
/**
     * 创建时间
     */
    private Date createTime;
/**
     * 修改人
     */
    private Long updateBy;
/**
     * 修改时间
     */
    private Date updateTime;
/**
     * 逻辑删除（0：存在，1删除）
     */
    private Integer delFlag;

}

