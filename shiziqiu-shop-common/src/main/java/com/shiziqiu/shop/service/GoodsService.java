package com.shiziqiu.shop.service;
import com.shiziqiu.shop.domain.Goods;
/**
 * @author : shiziqiu
 * @title : NcGoodsService
 * @date : 2017年9月20日 下午8:06:01 
 * @FUN :
 */
public interface GoodsService {

	int deleteByPrimaryKey(Integer goodsId);

	int insert(Goods record);

	int insertSelective(Goods record);

	Goods selectByPrimaryKey(Integer goodsId);

	int updateByPrimaryKeySelective(Goods record);

	int updateByPrimaryKey(Goods record);
}
