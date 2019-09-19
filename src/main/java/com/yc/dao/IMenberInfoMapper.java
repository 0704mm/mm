package com.yc.dao;

import com.yc.po.MenberInfo;

/**
 * 商品类型
 * 源辰信息
 * @author lydia
 * @2019年8月27日
 */
public interface IMenberInfoMapper {
	/**
	 * 登录
	 * @param bf
	 * @return
	 */
	public MenberInfo login(MenberInfo mf);
	
	/**
	 * 注册
	 * @param bf
	 * @return
	 */
	public int add(MenberInfo mf);
}
