package com.shiziqiu.shop.mapper;

import com.shiziqiu.shop.domain.Goods;


public interface GoodsMapper {
	
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}