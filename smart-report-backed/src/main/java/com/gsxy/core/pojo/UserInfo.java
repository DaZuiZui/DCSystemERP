package com.gsxy.core.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息(UserInfo)实体类
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
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -99269771139300325L;
/**
     * 关联user学号id
     */
    private Long id;
/**
     * 姓名
     */
    private String name;
/**
     * 年龄
     */
    private Integer age;
/**
     * 学院
     */
    private Integer college;
/**
     * 身份证号
     */
    private String cardCode;
/**
     * 班级
     */
    private Integer org;
/**
     * 年级
     */
    private String grade;
/**
     * 手机号
     */
    private String phone;
/**
     * 专业
     */
    private String professional;
/**
     * 生日
     */
    private Date birthday;

}

