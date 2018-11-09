package com.business.sysuser.service.impl;

import com.business.sysuser.dao.SysAndRoleMapper;
import com.business.sysuser.service.SysAndRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysAndRoleServiceImpl implements SysAndRoleService {

    //依赖持久层
    @Autowired
    private SysAndRoleMapper sysAndRoleMapper;

    //根据系统id得到角色id
    @Override
    public Long selectrid(Long sysuserid) {
        Long roleid = sysAndRoleMapper.selectrid(sysuserid);
        return roleid;
    }
}
