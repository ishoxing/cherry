package com.cherry.privilege.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cherry.privilege.api.pojo.Menus;
import com.cherry.privilege.api.service.MenuService;
import com.cherry.privilege.dao.MenusMapper;

/**
 * menu操作
 * 
 * 1、新增一个menu 2、根据主键ID删除menu
 * 
 * @author Administrator
 * @date 2016年4月19日 下午2:12:22
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenusMapper menuDao;

	public Menus getById(int id) {
		// TODO Auto-generated method stub
		return menuDao.getById(id);
	}

	public String saveMenu(Menus menu) {
		// TODO Auto-generated method stub
		return null;
	}

	public String delById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String uptMenu(Menus menu) {
		// TODO Auto-generated method stub
		return null;
	}

}
