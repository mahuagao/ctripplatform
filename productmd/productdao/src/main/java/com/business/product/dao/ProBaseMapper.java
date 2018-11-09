package com.business.product.dao;

import com.business.product.pojo.ProBase;
import com.business.product.pojo.ProBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProBaseMapper {
    long countByExample(ProBaseExample example);

    int deleteByExample(ProBaseExample example);

    int deleteByPrimaryKey(Long proid);

    int insert(ProBase record);

    int insertSelective(ProBase record);

    List<ProBase> selectByExample(ProBaseExample example);

    ProBase selectByPrimaryKey(Long proid);

    int updateByExampleSelective(@Param("record") ProBase record, @Param("example") ProBaseExample example);

    int updateByExample(@Param("record") ProBase record, @Param("example") ProBaseExample example);

    int updateByPrimaryKeySelective(ProBase record);

    int updateByPrimaryKey(ProBase record);

    //********************后加********************
    //根据供应商的id查询商品基本信息表
    List<ProBase> seleByComId(Long commerid);

    //根据商品id得到类型id
    Long selectTypeidByid(Long proid);

}