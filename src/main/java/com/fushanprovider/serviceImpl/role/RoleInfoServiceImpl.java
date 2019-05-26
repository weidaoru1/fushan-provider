package com.fushanprovider.serviceImpl.role;
import com.alibaba.dubbo.config.annotation.Service;
import com.fushanapi.model.role.RoleInfo;
import com.fushanapi.service.role.RoleInfoService;
import com.fushanprovider.mapper.RoleInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Service(timeout = 10000,interfaceClass = RoleInfoService.class)
public class RoleInfoServiceImpl implements RoleInfoService {
    @Autowired
    RoleInfoMapper roleInfoMapper;
    @Override
    public List<RoleInfo> queryListAll() {
        return roleInfoMapper.queryListAll();
    }

    @Override
    public List<RoleInfo> queryByUserId(Integer id) {
        Map<String,Object> map = new HashMap<>();
        map.put("userId",id);
        return roleInfoMapper.queryByUserId(map);
    }
}
