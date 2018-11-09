package com.business.sysuser.service.impl;

import com.business.sysuser.dao.AuthorityInfoMapper;
import com.business.sysuser.service.AuthorityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityInfoServiceImpl implements AuthorityInfoService {

    //依赖持久层
    @Autowired
    private AuthorityInfoMapper authorityInfoMapper;

    //根据权限id得到权限
    @Override
    public String selectauthtype(Long authid) {
        String auth = authorityInfoMapper.getauth(authid);
        return auth;
    }
}
