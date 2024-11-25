package com.gsxy.core.pojo.bo;

import java.io.Serializable;

public class PageBo implements Serializable {

    private Long page;
    private Long limit;

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }
}
