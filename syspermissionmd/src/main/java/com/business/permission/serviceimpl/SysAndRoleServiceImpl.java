package com.business.permission.serviceimpl;

import com.business.permission.dao.SysAndRoleMapper;
import com.business.permission.dto.SysAndRoleKeyDTO;
import com.business.permission.pojo.SysAndRoleKey;
import com.business.permission.service.SysAndRoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class SysAndRoleServiceImpl implements SysAndRoleService {

    //服务层依赖持久层
    private SysAndRoleMapper sysAndRoleMapper;

    //将用户和角色信息对应起来
    @Override
    public int insert(SysAndRoleKeyDTO dto) {
        //定义一个pojo实体对象
        SysAndRoleKey record = new SysAndRoleKey();
        BeanUtils.copyProperties(dto,record);
        //调用持久层
        int i = sysAndRoleMapper.insertSelective(record);
        return i;
    }
}