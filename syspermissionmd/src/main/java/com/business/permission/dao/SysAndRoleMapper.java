package com.business.permission.dao;

import com.business.permission.pojo.SysAndRoleExample;
import com.business.permission.pojo.SysAndRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAndRoleMapper {
    long countByExample(SysAndRoleExample example);

    int deleteByExample(SysAndRoleExample example);

    int deleteByPrimaryKey(SysAndRoleKey key);

    int insert(SysAndRoleKey record);

    int insertSelective(SysAndRoleKey record);

    List<SysAndRoleKey> selectByExample(SysAndRoleExample example);

    int updateByExampleSelective(@Param("record") SysAndRoleKey record, @Param("example") SysAndRoleExample example);

    int updateByExample(@Param("record") SysAndRoleKey record, @Param("example") SysAndRoleExample example);


    //******************后加**********************

    long selectRoleId(long sysuserid);
}