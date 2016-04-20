package com.cherry.privilege.api.service;

import com.cherry.privilege.api.pojo.Menus;

public interface MenuService {

	/**
	 * 根据主键ID，获取一个menu对象
	 * 
	 * @param id
	 * @return
	 */
	public Menus getById(int id);

	/**
	 * 新增一个menu
	 * 
	 * @param menu
	 * @return
	 */
	public String saveMenu(Menus menu);

	/**
	 * 根据主键删除menu对象
	 * 
	 * @param id
	 * @return
	 */
	public String delById(int id);

	/**
	 * 更新一个menu对象
	 * 
	 * @param menu
	 * @return
	 */
	public String uptMenu(Menus menu);

}
