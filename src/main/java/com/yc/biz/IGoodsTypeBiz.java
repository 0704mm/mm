package com.yc.biz;

import java.util.List;

import com.yc.po.GoodsType;


/**
 * 商品类型业务层接口
 * 源辰信息
 * @author lydia
 * @2019年8月27日
 */
public interface IGoodsTypeBiz {
	/**
	 * 查询所有
	 * @return
	 */
	public List<GoodsType> findAll();
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<GoodsType> finds();
}	
