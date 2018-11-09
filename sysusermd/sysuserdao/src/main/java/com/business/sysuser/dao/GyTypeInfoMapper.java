package com.business.sysuser.dao;

import com.business.sysuser.pojo.GyTypeInfo;
import com.business.sysuser.pojo.GyTypeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GyTypeInfoMapper {
    long countByExample(GyTypeInfoExample example);

    int deleteByExample(GyTypeInfoExample example);

    int deleteByPrimaryKey(Long gytypeid);

    int insert(GyTypeInfo record);

    int insertSelective(GyTypeInfo record);

    List<GyTypeInfo> selectByExample(GyTypeInfoExample example);

    GyTypeInfo selectByPrimaryKey(Long gytypeid);

    int updateByExampleSelective(@Param("record") GyTypeInfo record, @Param("example") GyTypeInfoExample example);

    int updateByExample(@Param("record") GyTypeInfo record, @Param("example") GyTypeInfoExample example);

    int updateByPrimaryKeySelective(GyTypeInfo record);

    int updateByPrimaryKey(GyTypeInfo record);
}