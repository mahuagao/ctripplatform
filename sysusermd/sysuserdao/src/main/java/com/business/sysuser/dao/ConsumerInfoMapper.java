package com.business.sysuser.dao;

import com.business.sysuser.pojo.ConsumerInfo;
import com.business.sysuser.pojo.ConsumerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsumerInfoMapper {
    long countByExample(ConsumerInfoExample example);

    int deleteByExample(ConsumerInfoExample example);

    int deleteByPrimaryKey(Long conid);

    int insert(ConsumerInfo record);

    int insertSelective(ConsumerInfo record);

    List<ConsumerInfo> selectByExample(ConsumerInfoExample example);

    ConsumerInfo selectByPrimaryKey(Long conid);

    int updateByExampleSelective(@Param("record") ConsumerInfo record, @Param("example") ConsumerInfoExample example);

    int updateByExample(@Param("record") ConsumerInfo record, @Param("example") ConsumerInfoExample example);

    int updateByPrimaryKeySelective(ConsumerInfo record);

    int updateByPrimaryKey(ConsumerInfo record);

    //************************后加**************************
       //获取普通用户列表
    List<ConsumerInfo> selectAll();
}