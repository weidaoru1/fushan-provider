package com.fushanprovider.mapper;
import com.fushanapi.model.menu.MenuChildren;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper //把maper 变成spring容器中的bean
public interface MenuChildrenMapper{
    int count(Map<String, Object> map);
    List<MenuChildren> pagedQuery(Map<String, Object> map);
    List<MenuChildren> queryList(MenuChildren menuChildren);
    List<MenuChildren> queryListAll();
    int deleteByPrimaryKey(Integer id);
    int insertSelective(MenuChildren menuChildren);
    MenuChildren selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(MenuChildren menuChildren);
    List<MenuChildren> queryMenuByParentId(Integer parentId);
}
