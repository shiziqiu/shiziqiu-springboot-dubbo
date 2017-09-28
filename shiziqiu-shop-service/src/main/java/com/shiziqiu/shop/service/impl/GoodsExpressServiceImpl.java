package com.shiziqiu.shop.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shiziqiu.shop.domain.GoodsExpress;
import com.shiziqiu.shop.mapper.GoodsExpressMapper;
import com.shiziqiu.shop.service.GoodsExpressService;
/**
 * @title : GoodsExpressServiceImpl
 * @author : shiziqiu
 * @date : 2017年9月28日 上午11:05:25
 * @Fun :
 */
@Service("goodsExpressService")
public class GoodsExpressServiceImpl implements GoodsExpressService{
	
	@Resource
	private GoodsExpressMapper goodsExpressMapper;

	@Override
	public int deleteByPrimaryKey(Integer goodsExpressId) {
		return goodsExpressMapper.deleteByPrimaryKey(goodsExpressId);
	}

	@Override
	public int insert(GoodsExpress record) {
		return goodsExpressMapper.insert(record);
	}

	@Override
	public int insertSelective(GoodsExpress record) {
		return goodsExpressMapper.insertSelective(record);
	}

	@Override
	public GoodsExpress selectByPrimaryKey(Integer goodsExpressId) {
		return goodsExpressMapper.selectByPrimaryKey(goodsExpressId);
	}

	@Override
	public int updateByPrimaryKeySelective(GoodsExpress record) {
		return goodsExpressMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(GoodsExpress record) {
		return goodsExpressMapper.updateByPrimaryKeySelective(record);
	}

}
