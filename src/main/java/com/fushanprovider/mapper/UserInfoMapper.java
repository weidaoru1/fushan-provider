package com.fushanprovider.mapper;
import com.fushanapi.model.user.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserInfoMapper {
    int count(Map<String, Object> map);
    List<UserInfo> pagedQuery(Map<String, Object> map);
    List<UserInfo> queryList(UserInfo userInfo);
    List<UserInfo> queryListAll();
    int deleteByPrimaryKey(Integer id);
    int insertSelective(UserInfo userInfo);
    UserInfo selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(UserInfo userInfo);
    UserInfo userCheck(Map<String, Object> map);
}
