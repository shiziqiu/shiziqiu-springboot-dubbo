package com.shiziqiu.shop.mapper;

import com.shiziqiu.shop.domain.GoodsDetails;


public interface GoodsDetailsMapper {

    int deleteByPrimaryKey(Integer goodsDetailId);

    int insert(GoodsDetails record);

    int insertSelective(GoodsDetails record);

    GoodsDetails selectByPrimaryKey(Integer goodsDetailId);

    int updateByPrimaryKeySelective(GoodsDetails record);

    int updateByPrimaryKey(GoodsDetails record);
}