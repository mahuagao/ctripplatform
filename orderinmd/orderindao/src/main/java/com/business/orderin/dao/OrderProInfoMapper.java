package com.business.orderin.dao;

import com.business.orderin.pojo.OrderProInfo;
import com.business.orderin.pojo.OrderProInfoExample;
import com.business.orderin.pojo.OrderProInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderProInfoMapper {
    long countByExample(OrderProInfoExample example);

    int deleteByExample(OrderProInfoExample example);

    int deleteByPrimaryKey(OrderProInfoKey key);

    int insert(OrderProInfo record);

    int insertSelective(OrderProInfo record);

    List<OrderProInfo> selectByExample(OrderProInfoExample example);

    OrderProInfo selectByPrimaryKey(OrderProInfoKey key);

    int updateByExampleSelective(@Param("record") OrderProInfo record, @Param("example") OrderProInfoExample example);

    int updateByExample(@Param("record") OrderProInfo record, @Param("example") OrderProInfoExample example);

    int updateByPrimaryKeySelective(OrderProInfo record);

    int updateByPrimaryKey(OrderProInfo record);
}