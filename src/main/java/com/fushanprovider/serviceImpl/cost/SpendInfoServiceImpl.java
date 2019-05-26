package com.fushanprovider.serviceImpl.cost;
import com.alibaba.dubbo.config.annotation.Service;
import com.fushanapi.common.utils.DataGrid;
import com.fushanapi.common.utils.PageInfo;
import com.fushanapi.model.cost.SpendInfo;
import com.fushanapi.service.cost.SpendInfoService;
import com.fushanprovider.mapper.SpendInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
@Service(timeout = 10000,interfaceClass = SpendInfoService.class)
public class SpendInfoServiceImpl implements SpendInfoService {
    @Autowired
    SpendInfoMapper spendInfoMapper;
    @Override
    public int deleteByPrimaryKey(Integer key) {
        return spendInfoMapper.deleteByPrimaryKey(key);
    }

    @Override
    public SpendInfo selectByPrimaryKey(Integer key) {
        return spendInfoMapper.selectByPrimaryKey(key);
    }

    @Override
    public int insertSelective(SpendInfo entity) {
        return spendInfoMapper.insertSelective(entity);
    }

    @Override
    public int updateByPrimaryKey(SpendInfo entity) {
        return spendInfoMapper.updateByPrimaryKey(entity);
    }

    @Override
    public PageInfo<SpendInfo> pagedQuery(DataGrid grid) {
        return this.pagedQueryByCondition(grid,new HashMap<>());
    }

    @Override
    public PageInfo<SpendInfo> pagedQueryByCondition(DataGrid grid, Map<String, Object> map) {
        int totalRows = spendInfoMapper.count(map);
        int startRows = (grid.getPageNum() - 1) * grid.getPageSize();
        map.put("start",startRows);
        map.put("end",grid.getPageSize());
        List<SpendInfo> list = spendInfoMapper.pagedQuery(map);
        return new PageInfo<>(startRows,totalRows,grid.getPageSize(),grid.getPageNum(),list);
    }

    @Override
    public int count(Map<String, Object> map) {
        return spendInfoMapper.count(map);
    }
}
