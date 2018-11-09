package com.business.sysuser.service.impl;

import com.business.sysuser.dao.ConsumerInfoMapper;
import com.business.sysuser.dto.ConsumerInfoDTO;
import com.business.sysuser.dto.ConsumerInfoDTO1;
import com.business.sysuser.pojo.ConsumerInfo;
import com.business.sysuser.service.ConsumerInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class ConsumerInfoServiceImpl implements ConsumerInfoService {

    //依赖持久层
    @Resource
    private ConsumerInfoMapper consumerInfoMapper;

    //获取普通用户列表
    @Override
    public List<ConsumerInfoDTO> getConList() {
        List<ConsumerInfo> pojos = new ArrayList<>();
        List<ConsumerInfoDTO> dtos = new LinkedList<>();
        //调用持久层接口
        pojos = consumerInfoMapper.selectAll();
        for (ConsumerInfo pojo : pojos){
            ConsumerInfoDTO dto = new ConsumerInfoDTO();
            BeanUtils.copyProperties(pojo,dto);
            dtos.add(dto);
        }
        return dtos;
    }

    //通过id查询普通用户
    @Override
    public ConsumerInfoDTO1 getSinConById(long conid) {
        ConsumerInfo pojo = new ConsumerInfo();
        pojo = consumerInfoMapper.selectByPrimaryKey(conid);
        ConsumerInfoDTO1 dto = new ConsumerInfoDTO1();
        BeanUtils.copyProperties(pojo,dto);
        return dto;
    }

    //修改普通用户信息
    @Override
    public int updateConById(ConsumerInfoDTO1 dto) {
        //定义一个实体类pojo
        ConsumerInfo pojo = new ConsumerInfo();
        //复制数据到pojo,前提是两个对象的字段和字段的类型都是一样的，不一样的字段复制不成功
        BeanUtils.copyProperties(dto,pojo);
        int i = consumerInfoMapper.updateByPrimaryKeySelective(pojo);
        return i;
    }
}
