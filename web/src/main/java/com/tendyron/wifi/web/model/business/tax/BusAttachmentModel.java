package com.tendyron.wifi.web.model.business.tax;

/**
 * Created by Neo on 2017/6/1.
 */
public class BusAttachmentModel {
    private String busId;
    private String uri;
    private Integer sort;

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
