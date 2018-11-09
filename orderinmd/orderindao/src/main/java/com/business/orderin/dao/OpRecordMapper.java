package com.business.orderin.dao;

import com.business.orderin.pojo.OpRecord;
import com.business.orderin.pojo.OpRecordExample;
import com.business.orderin.pojo.OpRecordKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpRecordMapper {
    long countByExample(OpRecordExample example);

    int deleteByExample(OpRecordExample example);

    int deleteByPrimaryKey(OpRecordKey key);

    int insert(OpRecord record);

    int insertSelective(OpRecord record);

    List<OpRecord> selectByExample(OpRecordExample example);

    OpRecord selectByPrimaryKey(OpRecordKey key);

    int updateByExampleSelective(@Param("record") OpRecord record, @Param("example") OpRecordExample example);

    int updateByExample(@Param("record") OpRecord record, @Param("example") OpRecordExample example);

    int updateByPrimaryKeySelective(OpRecord record);

    int updateByPrimaryKey(OpRecord record);
}