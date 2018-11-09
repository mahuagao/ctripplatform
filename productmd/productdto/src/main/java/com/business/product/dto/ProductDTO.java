package com.business.product.dto;

public class ProductDTO {

    //拼接商品模块三张表的字段
    private Long proid;    //商品id
    private String protypename;  //商品类型
    private Long commerid;  //所属商家
    private String proname;  //商品名称
    private Long proprice;  //商品价格
    private String roomtype; //房间类型（订酒店特有字段）
    private String startpo;  //出发地（机票、火车票等特有字段）
    private String destination; //目的地（机票、火车票等特有字段）
    private String viewpoint;  //景点地址（景点特有字段）

    public Long getProid() {
        return proid;
    }

    public void setProid(Long proid) {
        this.proid = proid;
    }

    public String getProtypename() {
        return protypename;
    }

    public void setProtypename(String protypename) {
        this.protypename = protypename;
    }

    public Long getCommerid() {
        return commerid;
    }

    public void setCommerid(Long commerid) {
        this.commerid = commerid;
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

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getStartpo() {
        return startpo;
    }

    public void setStartpo(String startpo) {
        this.startpo = startpo;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getViewpoint() {
        return viewpoint;
    }

    public void setViewpoint(String viewpoint) {
        this.viewpoint = viewpoint;
    }
}
