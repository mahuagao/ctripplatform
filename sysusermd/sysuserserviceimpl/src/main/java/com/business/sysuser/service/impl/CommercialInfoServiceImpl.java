package com.business.sysuser.service.impl;

import com.business.sysuser.dao.CommercialInfoMapper;
import com.business.sysuser.dto.CommercialInfoDTO;
import com.business.sysuser.dto.CommercialInfoDTO1;
import com.business.sysuser.pojo.CommercialInfo;
import com.business.sysuser.service.CommercialInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CommercialInfoServiceImpl implements CommercialInfoService {

    //依赖dao层接口
    private CommercialInfoMapper commercialInfoMapper;

     //获取商家列表
    @Override
    public List<CommercialInfoDTO> getComList() {
        List<CommercialInfo> pojos = new ArrayList<>();
        List<CommercialInfoDTO> dtos = new LinkedList<>();
        //调用持久层接口
        pojos = commercialInfoMapper.selectAll();
        for (CommercialInfo pojo : pojos){
            CommercialInfoDTO dto = new CommercialInfoDTO();
            BeanUtils.copyProperties(pojo,dto);
            dtos.add(dto);
        }
        return dtos;
    }

    //通过id查询商家
    @Override
    public CommercialInfoDTO1 getSinComById(Long commerid) {
        CommercialInfo pojo = new CommercialInfo();
        CommercialInfoDTO1 dto1 = new CommercialInfoDTO1();
        //调用持久层接口
        pojo = commercialInfoMapper.selectByPrimaryKey(commerid);
        BeanUtils.copyProperties(pojo,dto1);
        return dto1;
    }

    //通过id修改商家信息
    @Override
    public int updateComById(CommercialInfoDTO1 dto) {
        CommercialInfo pojo = new CommercialInfo();
        BeanUtils.copyProperties(dto,pojo);
        int i = commercialInfoMapper.updateByPrimaryKeySelective(pojo);
        return i;
    }

    //删除商家，不再合作
    @Override
    public int deleteCom(Long commerid) {
        int i = commercialInfoMapper.deleteByPrimaryKey(commerid);
        return i;
    }
}
