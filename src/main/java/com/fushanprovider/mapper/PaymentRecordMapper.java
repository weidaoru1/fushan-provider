package com.fushanprovider.mapper;
import com.fushanapi.model.cost.PaymentRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface PaymentRecordMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(PaymentRecord record);
    int insertSelective(PaymentRecord record);
    PaymentRecord selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(PaymentRecord record);
    int updateByPrimaryKey(PaymentRecord record);
    int count(Map<String, Object> map);
    List<PaymentRecord> pagedQuery(Map<String, Object> map);
    int deleteByPaymentId(Integer id);

}