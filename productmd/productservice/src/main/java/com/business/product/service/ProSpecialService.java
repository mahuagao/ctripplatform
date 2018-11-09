package com.business.product.service;

import com.business.product.dto.ProSpecialDTO;
import com.business.product.dto.ProSpecialDTO1;
import com.business.product.pojo.ProSpecialKey;

public interface ProSpecialService {

    //通过联合主键查找信息
    ProSpecialDTO seleByKey(ProSpecialKey key);

    //插入记录
    int inserRec(ProSpecialDTO1 spedto);

    //根据id删除
    int deleProDetail(Long proid);

    //更新详细信息
    int updatepro(Long proid,Long protypeid,String roomtype,String startpo,String destination,String viewpoint);
}
