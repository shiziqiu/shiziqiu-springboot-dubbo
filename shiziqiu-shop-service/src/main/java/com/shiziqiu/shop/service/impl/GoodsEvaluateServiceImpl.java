package com.shiziqiu.shop.service.impl;

import org.springframework.stereotype.Service;

import com.shiziqiu.shop.domain.GoodsEvaluate;
import com.shiziqiu.shop.mapper.GoodsEvaluateMapper;
import com.shiziqiu.shop.service.GoodsEvaluateService;
/**
 * @title : GoodsEvaluateServiceImpl
 * @author : shiziqiu
 * @date : 2017年9月28日 上午11:09:52
 * @Fun :
 */
@Service("goodsEvaluateService")
public class GoodsEvaluateServiceImpl implements GoodsEvaluateService{
	
	private GoodsEvaluateMapper goodsEvaluateMapper;

	@Override
	public int deleteByPrimaryKey(Integer evaluateId) {
		return goodsEvaluateMapper.deleteByPrimaryKey(evaluateId);
	}

	@Override
	public int insert(GoodsEvaluate record) {
		return goodsEvaluateMapper.insert(record);
	}

	@Override
	public int insertSelective(GoodsEvaluate record) {
		return goodsEvaluateMapper.insertSelective(record);
	}

	@Override
	public GoodsEvaluate selectByPrimaryKey(Integer evaluateId) {
		return goodsEvaluateMapper.selectByPrimaryKey(evaluateId);
	}

	@Override
	public int updateByPrimaryKeySelective(GoodsEvaluate record) {
		return goodsEvaluateMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(GoodsEvaluate record) {
		return goodsEvaluateMapper.updateByPrimaryKey(record);
	}

}
