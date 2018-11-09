package com.business.permission.serviceimpl;

import com.business.permission.dao.RoleInfoMapper;
import com.business.permission.pojo.RoleInfo;
import com.business.permission.service.RoleInfoService;
import org.springframework.stereotype.Service;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    //服务层依赖持久层
    private RoleInfoMapper roleInfoMapper;

    //给注册用户分配角色
    @Override
    public long insrole(String roletype) {
        //定义一个实体类pojo
        RoleInfo record = new RoleInfo();
        record.setRoletype(roletype);
        //调用持久层
        roleInfoMapper.insertSelective(record);
        //插入记录后立即得到主键（需要配置，参考我的文档）
        long roleid = record.getRoleid();
        return roleid;
    }
}
