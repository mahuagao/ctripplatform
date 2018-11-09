package com.business.product.dao;

import com.business.product.pojo.ProSpecial;
import com.business.product.pojo.ProSpecialExample;
import com.business.product.pojo.ProSpecialKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProSpecialMapper {
    long countByExample(ProSpecialExample example);

    int deleteByExample(ProSpecialExample example);

    int deleteByPrimaryKey(ProSpecialKey key);

    int insert(ProSpecial record);

    int insertSelective(ProSpecial record);

    List<ProSpecial> selectByExample(ProSpecialExample example);

    ProSpecial selectByPrimaryKey(ProSpecialKey key);

    int updateByExampleSelective(@Param("record") ProSpecial record, @Param("example") ProSpecialExample example);

    int updateByExample(@Param("record") ProSpecial record, @Param("example") ProSpecialExample example);

    int updateByPrimaryKeySelective(ProSpecial record);

    int updateByPrimaryKey(ProSpecial record);

    //*************************后加**************************
    //根据 proid 删除
    int deleteByProid(Long proid);
}