package com.business.register.service.impl;

import com.business.register.dao.ConsumerInfoMapper;
import com.business.register.dto.ConsumerInfoDTO;
import com.business.register.pojo.ConsumerInfo;
import com.business.register.service.ConsumerInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ConsumerInfoServiceImpl implements ConsumerInfoService {

    //服务层依赖dao层
    @Resource
    private ConsumerInfoMapper consumerInfoMapper;

    //普通用户注册
    @Override
    public int cnnregis(ConsumerInfoDTO dto) {
        //定义一个pojo实体类对象
        ConsumerInfo record = new ConsumerInfo();
        BeanUtils.copyProperties(dto,record);
        int i = consumerInfoMapper.insertSelective(record);
        return i;
    }
}
