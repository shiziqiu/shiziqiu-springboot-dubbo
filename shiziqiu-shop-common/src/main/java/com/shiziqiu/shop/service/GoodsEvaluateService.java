package com.shiziqiu.shop.service;

import com.shiziqiu.shop.domain.GoodsEvaluate;
/**
 * @title : GoodsEvaluateService
 * @author : shiziqiu
 * @date : 2017年9月28日 上午10:44:06
 * @Fun :
 */
public interface GoodsEvaluateService {

	int deleteByPrimaryKey(Integer goodsEvaluateId);

	int insert(GoodsEvaluate record);

	int insertSelective(GoodsEvaluate record);

	GoodsEvaluate selectByPrimaryKey(Integer goodsEvaluateId);

	int updateByPrimaryKeySelective(GoodsEvaluate record);

	int updateByPrimaryKey(GoodsEvaluate record);
}
