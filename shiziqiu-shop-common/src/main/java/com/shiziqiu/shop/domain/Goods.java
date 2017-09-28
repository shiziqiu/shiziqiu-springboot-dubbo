package com.shiziqiu.shop.domain;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @author : shiziqiu
 * @title : Goods
 * @date : 2017年9月20日 下午5:25:06 
 * @FUN : 商品
 */
@Data
public class Goods implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer goodsId;
	private String goodsUUID;
	private String goodsName;
	private Integer goodsNum;//商品数量
	private Double goodsPrice;//正常价格
	private Double goodsPurchPrice;//采购价
	private Double goodsConcessRate;//优惠价
	private String goodsLabel;//标签名
	private String goodsCover;//商品封面图
	private String goodsDesc;//商品描述
	private Date createTime;
	private Date updateTime;
	private Byte goodsStatus;// 1,下架，2补货，3卖完等
	private String remark;
	private String filed1;
	private String filed2;
	private String filed3;
}
