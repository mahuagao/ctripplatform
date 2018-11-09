package com.business.product.service;

public interface ProTypeService{

    //根据商品类型id得到商品类型名
    String seleTypeById(Long protypeid);

    //通过类型名获取类型id
    Long seletypeid(String protypename);
}
