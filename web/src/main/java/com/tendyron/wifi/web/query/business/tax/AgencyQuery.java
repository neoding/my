package com.tendyron.wifi.web.query.business.tax;

import com.tendyron.wifi.web.query.BaseQuery;

/**
 * Created by Neo on 2017/5/10.
 */
public class AgencyQuery extends BaseQuery {
    private String name;
    private String parentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
