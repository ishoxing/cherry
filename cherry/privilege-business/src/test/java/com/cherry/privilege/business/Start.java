package com.cherry.privilege.business;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cherry.privilege.api.pojo.Menus;
import com.cherry.privilege.service.MenuService;

public class Start {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "META-INF/spring/spring.xml", "META-INF/spring/spring-mybatis.xml" });
		context.start();

		MenuService ms = (MenuService) context.getBean("menuService");
		Menus menu = new Menus();
		menu.setName("tests4");
		menu.setDescribe("descs");
		menu.setParent(0);
		menu.setUrl("urls");
		ms.saveMenu(menu);

		System.out.println("按任意键退出");
		System.in.read();
	}
}
