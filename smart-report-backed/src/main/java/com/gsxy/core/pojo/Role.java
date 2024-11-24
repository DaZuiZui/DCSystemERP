package com.gsxy.core.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色表(Role)实体类
 *
 * @author makejava
 * @since 2024-11-24 17:23:27
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 855045293205385025L;

    private Long id;
/**
     * 角色名称
     */
    private String name;
/**
     * 权限
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

