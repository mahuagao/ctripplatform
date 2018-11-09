package com.business.product.service;

import com.business.product.dto.ProBaseDTO;

import java.util.List;

public interface ProBaseService{

    //根据商家id查商品基本表，得到该商家的商品列表
    List<ProBaseDTO> seleByComId(Long commerid);

    //插入记录，并立即得到主键
    Long inserRec(ProBaseDTO basedto);

    //根据id删除
    int deleProBase(Long proid);

    //修改商品信息
    int updatepro(Long proid,String proname,Long proprice);

    //根据商品id得到类型id
    Long selectTypeidByid(Long proid);

}