package com.shiziqiu.shop.mapper;

import com.shiziqiu.shop.domain.GoodsEvaluate;

public interface GoodsEvaluateMapper {

    int deleteByPrimaryKey(Integer evaluateId);

    int insert(GoodsEvaluate record);

    int insertSelective(GoodsEvaluate record);

    GoodsEvaluate selectByPrimaryKey(Integer evaluateId);

    int updateByPrimaryKeySelective(GoodsEvaluate record);

    int updateByPrimaryKey(GoodsEvaluate record);
}