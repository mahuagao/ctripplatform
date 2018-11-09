package com.business.sysuser.service;

import com.business.sysuser.dto.ConsumerInfoDTO;
import com.business.sysuser.dto.ConsumerInfoDTO1;

import java.util.List;

public interface ConsumerInfoService {

    //获取用户列表
    List<ConsumerInfoDTO> getConList();

    //通过id查询普通用户列表
    ConsumerInfoDTO1 getSinConById(long conid);

    //修改普通用户信息
    int updateConById(ConsumerInfoDTO1 dto);
}
