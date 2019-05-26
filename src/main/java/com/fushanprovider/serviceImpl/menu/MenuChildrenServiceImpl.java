package com.fushanprovider.serviceImpl.menu;
import com.alibaba.dubbo.config.annotation.Service;
import com.fushanapi.common.utils.DataGrid;
import com.fushanapi.common.utils.PageInfo;
import com.fushanapi.model.menu.MenuChildren;
import com.fushanapi.service.menu.MenuChildrenService;
import com.fushanprovider.mapper.MenuChildrenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
@Service(timeout = 10000,interfaceClass = MenuChildrenService.class)
public class MenuChildrenServiceImpl implements MenuChildrenService {
    @Autowired
    MenuChildrenMapper menuChildrenMapper;
    @Override
    public List<MenuChildren> queryMenuByParentId(Integer parentId) {
        return menuChildrenMapper.queryMenuByParentId(parentId);
    }

    @Override
    public PageInfo<MenuChildren> pagedQuery(DataGrid grid) {
        return this.pagedQueryByCondition(grid,new HashMap<>());
    }

    @Override
    public PageInfo<MenuChildren> pagedQueryByCondition(DataGrid grid, Map<String, Object> map) {
        int totalRows = menuChildrenMapper.count(map);
        int startRows = (grid.getPageNum() - 1) * grid.getPageSize();
        map.put("start",startRows);
        map.put("end",grid.getPageSize());
        List<MenuChildren> list = menuChildrenMapper.pagedQuery(map);
        return new PageInfo<>(startRows,totalRows,grid.getPageSize(),grid.getPageNum(),list);
    }

    @Override
    public List<MenuChildren> queryList(MenuChildren entity) {
        return menuChildrenMapper.queryList(entity);
    }

    @Override
    public List<MenuChildren> queryListAll() {
        return menuChildrenMapper.queryListAll();
    }

    @Override
    public int count(Map<String, Object> map) {
        return menuChildrenMapper.count(map);
    }

    @Override
    public int insertSelective(MenuChildren entity) {
        return menuChildrenMapper.insertSelective(entity);
    }

    @Override
    public int updateByPrimaryKey(MenuChildren entity) {
        return menuChildrenMapper.updateByPrimaryKeySelective(entity);
    }
}
