package com.fushanprovider.mapper;
import com.fushanapi.model.cost.SpendRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SpendRecordMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(SpendRecord record);
    int insertSelective(SpendRecord record);
    SpendRecord selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(SpendRecord record);
    int updateByPrimaryKey(SpendRecord record);
    int count(Map<String, Object> map);
    List<SpendRecord> pagedQuery(Map<String, Object> map);
}