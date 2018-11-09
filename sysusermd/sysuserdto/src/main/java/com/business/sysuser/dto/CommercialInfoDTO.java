package com.business.sysuser.dto;

public class CommercialInfoDTO {

    private Long commerid;  //商家id
    private Long sysuserid; //系统id
    private Long comgytypeid; //商家类型id
    private String comname;  //商家名称
    private String comphone;  //商家客服
    private String comaddr;  //商家地址

    public Long getCommerid() {
        return commerid;
    }

    public void setCommerid(Long commerid) {
        this.commerid = commerid;
    }

    public Long getSysuserid() {
        return sysuserid;
    }

    public void setSysuserid(Long sysuserid) {
        this.sysuserid = sysuserid;
    }

    public Long getComgytypeid() {
        return comgytypeid;
    }

    public void setComgytypeid(Long comgytypeid) {
        this.comgytypeid = comgytypeid;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getComphone() {
        return comphone;
    }

    public void setComphone(String comphone) {
        this.comphone = comphone;
    }

    public String getComaddr() {
        return comaddr;
    }

    public void setComaddr(String comaddr) {
        this.comaddr = comaddr;
    }
}
