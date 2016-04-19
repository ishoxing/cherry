package com.cherry.privilege.dao;

import com.cherry.privilege.api.pojo.Menus;

public interface MenusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menus record);

    int insertSelective(Menus record);

    Menus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menus record);

    int updateByPrimaryKey(Menus record);
}