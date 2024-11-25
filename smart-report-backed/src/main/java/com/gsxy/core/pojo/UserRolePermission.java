package com.gsxy.core.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户角色权限表(UserRolePermission)实体类
 *
 * @author makejava
 * @since 2024-11-24 17:23:27
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
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

}

