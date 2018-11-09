package com.business.sysuser.dto;

public class ConsumerInfoDTO {

    private Long conid; //普通用户id
    private Long sysuserid; //系统id
    private String conname; //普通用户名称
    private String conphone; //普通用户电话
    private String conaddr;  //普通用户地址

    public Long getConid() {
        return conid;
    }

    public void setConid(Long conid) {
        this.conid = conid;
    }

    public Long getSysuserid() {
        return sysuserid;
    }

    public void setSysuserid(Long sysuserid) {
        this.sysuserid = sysuserid;
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

    public String getConaddr() {
        return conaddr;
    }

    public void setConaddr(String conaddr) {
        this.conaddr = conaddr;
    }
}
