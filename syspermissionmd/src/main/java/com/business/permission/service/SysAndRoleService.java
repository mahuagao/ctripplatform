package com.business.permission.service;

import com.business.permission.dto.SysAndRoleKeyDTO;
import com.business.permission.pojo.SysAndRoleKey;

public interface SysAndRoleService {

    //将用户和角色信息对应起来
    int insert(SysAndRoleKeyDTO dto);

}
