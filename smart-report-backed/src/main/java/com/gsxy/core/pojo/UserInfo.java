package com.gsxy.core.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息(UserInfo)实体类
 *
 * @author makejava
 * @since 2024-11-24 17:23:27
 */
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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCollege() {
        return college;
    }

    public void setCollege(Integer college) {
        this.college = college;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public Integer getOrg() {
        return org;
    }

    public void setOrg(Integer org) {
        this.org = org;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}

