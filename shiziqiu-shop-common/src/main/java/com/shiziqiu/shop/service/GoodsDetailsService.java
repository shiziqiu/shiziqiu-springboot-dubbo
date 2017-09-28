package com.shiziqiu.shop.service;

import com.shiziqiu.shop.domain.GoodsDetails;

/**
 * @title : GoodsDetailsService
 * @author : shiziqiu
 * @date : 2017年9月28日 上午10:44:50
 * @Fun :
 */
public interface GoodsDetailsService {

	int deleteByPrimaryKey(Integer goodsDetailsId);

	int insert(GoodsDetails record);

	int insertSelective(GoodsDetails record);

	GoodsDetails selectByPrimaryKey(Integer goodsDetailsId);

	int updateByPrimaryKeySelective(GoodsDetails record);

	int updateByPrimaryKey(GoodsDetails record);
}
