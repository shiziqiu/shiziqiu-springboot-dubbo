package com.shiziqiu.shop.service;

import com.shiziqiu.shop.domain.GoodsExpress;
/**
 * @title : GoodsExpressService
 * @author : shiziqiu
 * @date : 2017年9月28日 上午10:42:31
 * @Fun :
 */
public interface GoodsExpressService {

	int deleteByPrimaryKey(Integer goodsExpressId);

	int insert(GoodsExpress record);

	int insertSelective(GoodsExpress record);

	GoodsExpress selectByPrimaryKey(Integer goodsExpressId);

	int updateByPrimaryKeySelective(GoodsExpress record);

	int updateByPrimaryKey(GoodsExpress record);
}
