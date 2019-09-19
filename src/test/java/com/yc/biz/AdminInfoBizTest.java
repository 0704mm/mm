package com.yc.biz;

import static org.junit.Assert.*;

import org.junit.Test;
 
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.po.AdminInfo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-bean.xml"})
public class AdminInfoBizTest {
	@Autowired
	IAdminInfoBiz  adminInfoBiz;

	@Test
	public void testLogin() {
		AdminInfo af = new AdminInfo();
		af.setAname("15096098012");
		af.setPwd("098012");
		System.out.println(adminInfoBiz.login(af));
	}

	@Test
	public void testAdd() {
		AdminInfo af = new AdminInfo();
		af.setAname("lydia002");
		af.setPwd("a");
		af.setTel("17889897867");
		System.out.println(adminInfoBiz.add(af));
	}

	@Test
	public void testFindAll() {
		System.out.println(adminInfoBiz.findAll());
	}

	@Test
	public void testUpdatPwd() {
		System.out.println(adminInfoBiz.updatPwd(2));
	}

}
