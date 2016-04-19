package com.cherry.privilege.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cherry.privilege.api.pojo.Menus;
import com.cherry.privilege.dao.MenusMapper;
import com.cherry.privilege.service.MenuService;

@Service("menuService")
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenusMapper menuDao;

	public int saveMenu(Menus menu) {
		// TODO Auto-generated method stub
		menuDao.insert(menu);
		
		Menus menu1 = new Menus();
		menu1.setName("tests");
		menu1.setDescribe("descs");
		menu1.setParent(0);
		menu1.setUrl("urlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurlsurls");
		menuDao.insert(menu1);
		return 0;
	}


}
