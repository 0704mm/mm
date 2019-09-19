package com.yc.biz;

import com.yc.po.MenberInfo;

public interface IMenberInfoBiz {
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
