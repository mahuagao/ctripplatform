package com.business.product.service.impl;

import com.business.product.dao.ProSpecialMapper;
import com.business.product.dto.ProSpecialDTO;
import com.business.product.dto.ProSpecialDTO1;
import com.business.product.pojo.ProSpecial;
import com.business.product.pojo.ProSpecialKey;
import com.business.product.service.ProSpecialService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProSpecialServiceImpl implements ProSpecialService {

    //依赖持久层
    @Resource
    private ProSpecialMapper proSpecialMapper;

    //通过联合主键查找信息
    @Override
    public ProSpecialDTO seleByKey(ProSpecialKey key) {
        ProSpecial pojo = new ProSpecial();
        ProSpecialDTO dto = new ProSpecialDTO();
        //调用持久层
        pojo = proSpecialMapper.selectByPrimaryKey(key);
        BeanUtils.copyProperties(pojo,dto);
        return dto;
    }

    //插入记录
    @Override
    public int inserRec(ProSpecialDTO1 spedto) {
        ProSpecial record = new ProSpecial();
        BeanUtils.copyProperties(spedto,record);
        //调用持久层,插入记录
        int i = proSpecialMapper.insert(record);
        return i;
    }

    //根据id删除
    @Override
    public int deleProDetail(Long proid) {
        int i = proSpecialMapper.deleteByProid(proid);
        return i;
    }

    //更新详细信息
    @Override
    public int updatepro(Long proid, Long protypeid, String roomtype, String startpo, String destination, String viewpoint) {
        ProSpecial record = new ProSpecial();
        record.setProid(proid);
        record.setProtypeid(protypeid);
        record.setRoomtype(roomtype);
        record.setStartpo(startpo);
        record.setDestination(destination);
        record.setViewpoint(viewpoint);
        int i = proSpecialMapper.updateByPrimaryKeySelective(record);
        return i;
    }
}