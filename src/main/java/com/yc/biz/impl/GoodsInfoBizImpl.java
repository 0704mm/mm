package com.yc.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.biz.IGoodInfoBiz;
import com.yc.dao.IGoodsInfoMapper;
import com.yc.po.GoodsInfo;
import com.yc.util.StringUtil;
@Service
public class GoodsInfoBizImpl  implements IGoodInfoBiz{
	@Autowired
	private IGoodsInfoMapper mapper;

	@Override
	public int add(GoodsInfo gf) {
		 if(StringUtil.isNull(gf.getGname(),gf.getPrice()+"",gf.getPics())){
			 return -1;
		 }
		return mapper.add(gf);
	}

	@Override
	public Map<String, Object> finds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GoodsInfo> findByType(int tno, int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GoodsInfo finByGno(int gno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> findByFirst(int tno, int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

}
