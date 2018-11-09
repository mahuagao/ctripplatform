package com.business.register.dao;

import com.business.register.pojo.CommercialInfo;
import com.business.register.pojo.CommercialInfoExample;
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
}