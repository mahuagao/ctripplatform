package com.business.product.dao;

import com.business.product.pojo.ProType;
import com.business.product.pojo.ProTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProTypeMapper {
    long countByExample(ProTypeExample example);

    int deleteByExample(ProTypeExample example);

    int deleteByPrimaryKey(Long protypeid);

    int insert(ProType record);

    int insertSelective(ProType record);

    List<ProType> selectByExample(ProTypeExample example);

    ProType selectByPrimaryKey(Long protypeid);

    int updateByExampleSelective(@Param("record") ProType record, @Param("example") ProTypeExample example);

    int updateByExample(@Param("record") ProType record, @Param("example") ProTypeExample example);

    int updateByPrimaryKeySelective(ProType record);

    int updateByPrimaryKey(ProType record);

    //**********************后加***********************
    //根据商品类型id得到类型名
    String seleTypeById(Long protypeid);

    //通过类型名获取类型id
    Long seletypeid(String protypename);
}