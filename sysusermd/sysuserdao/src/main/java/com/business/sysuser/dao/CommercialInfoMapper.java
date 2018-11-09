package com.business.sysuser.dao;

import com.business.sysuser.dto.CommercialInfoDTO;
import com.business.sysuser.pojo.CommercialInfo;
import com.business.sysuser.pojo.CommercialInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommercialInfoMapper {
    long countByExample(CommercialInfoExample example);

    int deleteByExample(CommercialInfoExample example);

    int deleteByPrimaryKey(Long commerid);

    int insert(CommercialInfo record);

    int insertSelective(CommercialInfo record);

    List<CommercialInfo> selectByExample(CommercialInfoExample example);

    CommercialInfo selectByPrimaryKey(Long commerid);

    int updateByExampleSelective(@Param("record") CommercialInfo record, @Param("example") CommercialInfoExample example);

    int updateByExample(@Param("record") CommercialInfo record, @Param("example") CommercialInfoExample example);

    int updateByPrimaryKeySelective(CommercialInfo record);

    int updateByPrimaryKey(CommercialInfo record);

    //********************后加*************************
      //查询商家列表
    List<CommercialInfo> selectAll();

}