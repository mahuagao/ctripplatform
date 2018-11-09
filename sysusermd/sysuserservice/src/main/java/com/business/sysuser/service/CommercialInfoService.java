package com.business.sysuser.service;

import com.business.sysuser.dto.CommercialInfoDTO;
import com.business.sysuser.dto.CommercialInfoDTO1;

import java.util.List;

public interface CommercialInfoService {

    //获取商家列表
    List<CommercialInfoDTO> getComList();

    //通过id查询商家
    CommercialInfoDTO1 getSinComById(Long commerid);

    //通过id修改商家信息
    int updateComById(CommercialInfoDTO1 dto);

    //删除商家，不再合作
    int deleteCom(Long commerid);
}
