package com.fushanprovider.serviceImpl.role;
import com.alibaba.dubbo.config.annotation.Service;
import com.fushanapi.model.role.RoleUser;
import com.fushanapi.service.role.RoleUserService;
import com.fushanprovider.mapper.RoleUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(timeout = 10000,interfaceClass = RoleUserService.class)
public class RoleUserServiceImpl implements RoleUserService {
    @Autowired
    RoleUserMapper roleUserMapper;
    @Override
    public int insertSelective(RoleUser entity) {
        return roleUserMapper.insertSelective(entity);
    }

    @Override
    public int deleteByUserId(Integer id) {
        return roleUserMapper.deleteByUserId(id);
    }
}
