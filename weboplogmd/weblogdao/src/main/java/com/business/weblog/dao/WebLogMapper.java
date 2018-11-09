package com.business.weblog.dao;

import com.business.weblog.pojo.WebLog;
import com.business.weblog.pojo.WebLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebLogMapper {
    long countByExample(WebLogExample example);

    int deleteByExample(WebLogExample example);

    int deleteByPrimaryKey(Long logid);

    int insert(WebLog record);

    int insertSelective(WebLog record);

    List<WebLog> selectByExample(WebLogExample example);

    WebLog selectByPrimaryKey(Long logid);

    int updateByExampleSelective(@Param("record") WebLog record, @Param("example") WebLogExample example);

    int updateByExample(@Param("record") WebLog record, @Param("example") WebLogExample example);

    int updateByPrimaryKeySelective(WebLog record);

    int updateByPrimaryKey(WebLog record);
}