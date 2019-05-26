package com.fushanprovider.mapper;
import com.fushanapi.model.cost.PaymentInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PaymentInfoMapper {
    int count(Map<String, Object> map);
    List<PaymentInfo> pagedQuery(Map<String, Object> map);
    List<PaymentInfo> queryList(PaymentInfo paymentInfo);
    List<PaymentInfo> queryListAll();
    int deleteByPrimaryKey(Integer id);
    int insertSelective(PaymentInfo paymentInfo);
    PaymentInfo selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(PaymentInfo paymentInfo);
    List<PaymentInfo> queryByUserId(Map<String, Object> map);
}
