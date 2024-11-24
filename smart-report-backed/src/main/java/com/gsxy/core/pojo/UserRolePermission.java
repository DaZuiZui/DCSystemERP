package com.gsxy.core.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户角色权限表(UserRolePermission)实体类
 *
 * @author makejava
 * @since 2024-11-24 17:23:27
 */
public class UserRolePermission implements Serializable {
    private static final long serialVersionUID = 376943984509060374L;

    private Long id;
/**
     * 用户id
     */
    private Long userId;
/**
     * 社团id
     */
    private Long communityId;
/**
     * 绑定的角色id
     */
    private Long roleId;
/**
     * 附加的权限id（注意此处是拼接成了一个字符串）
     */
    private String permission;
/**
     * 创建人
     */
    private Long createdBy;
/**
     * 创建时间
     */
    private Date createdTime;
/**
     * 修改人
     */
    private Long updatedBy;
/**
     * 修改时间
     */
    private Date updatedTime;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

