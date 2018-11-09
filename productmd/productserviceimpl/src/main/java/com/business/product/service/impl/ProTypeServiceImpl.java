package com.business.product.service.impl;

import com.business.product.dao.ProTypeMapper;
import com.business.product.service.ProTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProTypeServiceImpl implements ProTypeService {

    //依赖持久层
    @Resource
    private ProTypeMapper proTypeMapper;

    //根据商品类型id得到类型名
    @Override
    public String seleTypeById(Long protypeid) {
        String protypename = proTypeMapper.seleTypeById(protypeid);
        return protypename;
    }

    //通过类型名获取类型id
    @Override
    public Long seletypeid(String protypename) {
        Long protypeid = proTypeMapper.seletypeid(protypename);
        return protypeid;
    }
}
