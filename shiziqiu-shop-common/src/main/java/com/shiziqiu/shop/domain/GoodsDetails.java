package com.shiziqiu.shop.domain;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 商品详情
 * @author : shiziqiu
 * @title : GoodsDetails
 * @date : 2017年9月20日 下午5:35:05 
 * @FUN :
 */
@Data
public class GoodsDetails implements Serializable{

	/**
	 */
	private static final long serialVersionUID = 1L;
	private Integer goodsId;
	private Integer goodsDetailId;
	private String describe;//描述
	private String goodsImages;//商品展示图片集
	private String goodsVideo;//商品展示视频
	private String goodsSellingPoint;//商品卖点
	private String goodsSpecific;//商品规格
	private String goodsSize;//商品大小
	private Date createTime;
	private Date updateTime;
	private String remark;
}
