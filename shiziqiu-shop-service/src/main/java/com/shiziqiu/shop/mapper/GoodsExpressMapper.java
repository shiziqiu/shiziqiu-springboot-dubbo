package com.shiziqiu.shop.mapper;

import com.shiziqiu.shop.domain.GoodsExpress;

public interface GoodsExpressMapper {

    int deleteByPrimaryKey(Integer expressId);

    int insert(GoodsExpress record);

    int insertSelective(GoodsExpress record);

    GoodsExpress selectByPrimaryKey(Integer expressId);

    int updateByPrimaryKeySelective(GoodsExpress record);

    int updateByPrimaryKey(GoodsExpress record);
}