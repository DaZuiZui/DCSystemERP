package com.gsxy.core.pojo.vo;

import lombok.*;

import java.io.Serializable;

public class PageVo implements Serializable {

    private String createdByText;
    private String updatedByText;
    private String userText;
    private String bage1;
    private Double bage2;


    public String getBage1() {
        return bage1;
    }

    public void setBage1(String bage1) {
        this.bage1 = bage1;
    }

    public Double getBage2() {
        return bage2;
    }

    public void setBage2(Double bage2) {
        this.bage2 = bage2;
    }

    public String getCreatedByText() {
        return createdByText;
    }

    public void setCreatedByText(String createdByText) {
        this.createdByText = createdByText;
    }

    public String getUpdatedByText() {
        return updatedByText;
    }

    public void setUpdatedByText(String updatedByText) {
        this.updatedByText = updatedByText;
    }

    public String getUserText() {
        return userText;
    }

    public void setUserText(String userText) {
        this.userText = userText;
    }
}
