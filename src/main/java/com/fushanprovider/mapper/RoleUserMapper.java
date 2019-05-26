package com.fushanprovider.mapper;
import com.fushanapi.model.role.RoleUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleUserMapper {
    int insertSelective(RoleUser entity);
    int deleteByUserId(Integer id);
}
