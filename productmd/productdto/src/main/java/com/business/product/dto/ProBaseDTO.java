package com.business.product.dto;

public class ProBaseDTO {

    private Long proid;

    private Long protypeid;

    private Long commerid;  //所属商家

    private String proname;

    private Long proprice;

    public Long getProid() {
        return proid;
    }

    public void setProid(Long proid) {
        this.proid = proid;
    }

    public Long getProtypeid() {
        return protypeid;
    }

    public void setProtypeid(Long protypeid) {
        this.protypeid = protypeid;
    }

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

    public Long getCommerid() {
        return commerid;
    }

    public void setCommerid(Long commerid) {
        this.commerid = commerid;
    }
}
