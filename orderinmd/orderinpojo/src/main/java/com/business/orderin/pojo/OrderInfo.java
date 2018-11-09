package com.business.orderin.pojo;

import java.util.Date;

public class OrderInfo {
    private String orderid;

    private Long conid;

    private Long commerid;

    private String conname;

    private String conphone;

    private String proname;

    private String topename;

    private String topephone;

    private String ordertype;

    private Long orderstate;

    private Long isorder;

    private Date createdate;

    private String tradetype;

    private Long orderpay;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Long getConid() {
        return conid;
    }

    public void setConid(Long conid) {
        this.conid = conid;
    }

    public Long getCommerid() {
        return commerid;
    }

    public void setCommerid(Long commerid) {
        this.commerid = commerid;
    }

    public String getConname() {
        return conname;
    }

    public void setConname(String conname) {
        this.conname = conname;
    }

    public String getConphone() {
        return conphone;
    }

    public void setConphone(String conphone) {
        this.conphone = conphone;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getTopename() {
        return topename;
    }

    public void setTopename(String topename) {
        this.topename = topename;
    }

    public String getTopephone() {
        return topephone;
    }

    public void setTopephone(String topephone) {
        this.topephone = topephone;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public Long getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Long orderstate) {
        this.orderstate = orderstate;
    }

    public Long getIsorder() {
        return isorder;
    }

    public void setIsorder(Long isorder) {
        this.isorder = isorder;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getTradetype() {
        return tradetype;
    }

    public void setTradetype(String tradetype) {
        this.tradetype = tradetype;
    }

    public Long getOrderpay() {
        return orderpay;
    }

    public void setOrderpay(Long orderpay) {
        this.orderpay = orderpay;
    }
}