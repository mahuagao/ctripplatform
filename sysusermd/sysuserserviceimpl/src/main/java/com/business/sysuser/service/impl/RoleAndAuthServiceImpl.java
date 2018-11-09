package com.business.sysuser.service.impl;

import com.business.sysuser.dao.RoleAndAuthMapper;
import com.business.sysuser.pojo.RoleAndAuthKey;
import com.business.sysuser.service.RoleAndAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleAndAuthServiceImpl implements RoleAndAuthService {

    //依赖持久层
    @Autowired
    private RoleAndAuthMapper roleAndAuthMapper;

    //根据角色id得到权限id
    @Override
    public List<Long> selectaids(Long roleid) {
        List<Long> aids = new ArrayList<>();
        aids = roleAndAuthMapper.selectaids(roleid);
        return aids;
    }

    //在角色权限表中，添加关联关系
    @Override
    public int addauth(Long roleid, Long authid) {
        RoleAndAuthKey pojo = new RoleAndAuthKey();
        pojo.setRoleid(roleid);
        pojo.setAuthid(authid);
        int i = roleAndAuthMapper.insert(pojo);
        return i;
    }

    //在角色权限表中，删除关联关系
    @Override
    public int deleteauth(Long roleid, Long authid) {
        RoleAndAuthKey pojo = new RoleAndAuthKey();
        pojo.setRoleid(roleid);
        pojo.setAuthid(authid);
        int i = roleAndAuthMapper.deleteByPrimaryKey(pojo);
        return i;
    }
}
