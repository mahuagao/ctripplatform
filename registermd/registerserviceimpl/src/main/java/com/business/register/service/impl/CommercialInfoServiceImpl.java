package com.business.register.service.impl;

import com.business.register.dao.CommercialInfoMapper;
import com.business.register.dto.CommercialInfoDTO;
import com.business.register.pojo.CommercialInfo;
import com.business.register.service.CommercialInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommercialInfoServiceImpl implements CommercialInfoService {

    //服务层依赖持久层（dao层）
    @Resource
    private CommercialInfoMapper commercialInfoMapper;

    //商户注册
    @Override
    public int comregis(CommercialInfoDTO dto) {
        //定义一个pojo实体对象
        CommercialInfo record = new CommercialInfo();
        BeanUtils.copyProperties(dto,record);
        int i =  commercialInfoMapper.insertSelective(record);
        return i;
    }

}
