package com.business.permission.serviceimpl;

import com.business.permission.dao.RoleAndAuthMapper;
import com.business.permission.dto.RoleAndAuthKeyDTO;
import com.business.permission.pojo.RoleAndAuthKey;
import com.business.permission.service.RoleAndAuthService;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class RoleAndAuthServiceImpl implements RoleAndAuthService {

    //服务层依赖持久层
    private RoleAndAuthMapper roleAndAuthMapper;

    //将用户角色与相应的权限对应起来
    @Override
    public int insert(RoleAndAuthKeyDTO dto) {
        //定义一个pojo实体对象
        RoleAndAuthKey record = new RoleAndAuthKey();
        BeanUtils.copyProperties(dto,record);
        //调用持久层
        int i = roleAndAuthMapper.insertSelective(record);
        return i;
    }
}