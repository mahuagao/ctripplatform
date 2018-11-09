package com.business.orderin.pojo;

public class OrderProInfo extends OrderProInfoKey {
    private String proname;

    private Long proprice;

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public Long getProprice() {
        return proprice;
    }

    public void setProprice(Long proprice) {
        this.proprice = proprice;
    }
}