package com.cherry.privilege.business;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cherry.privilege.api.pojo.Menus;
import com.cherry.privilege.api.service.MenuService;

public class StartTest {
	@Before
	public void setUp() throws Exception {
		System.out.println("一个测试开始。。");
	}

	@Test
	public void testStart() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "META-INF/spring/spring.xml", "META-INF/spring/spring-mybatis.xml" });
		context.start();

		MenuService ms = (MenuService) context.getBean("menuService");

		Menus m = ms.getById(2);
		System.out.println(m.getName());

		System.out.println("按任意键退出");
		// System.in.read();
	}

}
