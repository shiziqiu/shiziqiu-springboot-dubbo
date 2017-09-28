package com.shiziqiu.shop.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shiziqiu.shop.domain.GoodsDetails;
import com.shiziqiu.shop.mapper.GoodsDetailsMapper;
import com.shiziqiu.shop.service.GoodsDetailsService;
/**
 * @title : GoodsDetailsServiceImpl
 * @author : shiziqiu
 * @date : 2017年9月28日 上午11:12:20
 * @Fun :
 */
@Service("goodsDetailsService")
public class GoodsDetailsServiceImpl implements GoodsDetailsService{
	
	@Resource
	private GoodsDetailsMapper goodsDetailsMapper;

	@Override
	public int deleteByPrimaryKey(Integer goodsDetailsId) {
		return goodsDetailsMapper.deleteByPrimaryKey(goodsDetailsId);
	}

	@Override
	public int insert(GoodsDetails record) {
		return goodsDetailsMapper.insert(record);
	}

	@Override
	public int insertSelective(GoodsDetails record) {
		return goodsDetailsMapper.insertSelective(record);
	}

	@Override
	public GoodsDetails selectByPrimaryKey(Integer goodsDetailsId) {
		return goodsDetailsMapper.selectByPrimaryKey(goodsDetailsId);
	}

	@Override
	public int updateByPrimaryKeySelective(GoodsDetails record) {
		return goodsDetailsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(GoodsDetails record) {
		return goodsDetailsMapper.updateByPrimaryKey(record);
	}

}
