package com.business.permission.service;

import com.business.permission.dto.RoleAndAuthKeyDTO;

public interface RoleAndAuthService {

    //将用户角色与相应的权限对应起来
    int insert(RoleAndAuthKeyDTO dto);

}
