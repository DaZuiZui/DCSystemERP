package com.gsxy.core.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表(User)实体类
 *
 * @author makejava
 * @since 2024-11-24 17:23:26
 */
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

