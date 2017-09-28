package com.shiziqiu.shop.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.shiziqiu.shop.domain.Goods;
import com.shiziqiu.shop.mapper.GoodsMapper;
import com.shiziqiu.shop.service.GoodsService;

/**
 * 
 * @author : shiziqiu
 * @title : NcGoodsServiceImpl
 * @date : 2017年9月20日 下午8:06:14 
 * @FUN :
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService{
	
	@Resource
	private GoodsMapper goodsMapper;

	@Override
	public int deleteByPrimaryKey(Integer goodsId) {
		return goodsMapper.deleteByPrimaryKey(goodsId);
	}

	@Override
	public int insert(Goods record) {
		return goodsMapper.insert(record);
	}

	@Override
	public int insertSelective(Goods record) {
		return goodsMapper.insertSelective(record);
	}

	@Override
	public Goods selectByPrimaryKey(Integer goodsId) {
		return goodsMapper.selectByPrimaryKey(goodsId);
	}

	@Override
	public int updateByPrimaryKeySelective(Goods record) {
		return goodsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Goods record) {
		return goodsMapper.updateByPrimaryKey(record);
	}
	

}
