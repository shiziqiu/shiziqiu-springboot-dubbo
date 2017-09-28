package com.shiziqiu.shop.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 物流快递
 * @author : shiziqiu
 * @title : GoodsLogistics
 * @date : 2017年9月20日 下午5:33:39 
 * @FUN :
 */
@Data
public class GoodsExpress implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer goodsId;
	private Integer expressId;
	private Long accountId;
	private Byte expressStatus;//1，配送中，2已收货，3失效，4已退款
	private String consignName;//收货人
	private String mobile;
	private String address;//地址
	private String province;
	private Integer provinceId;
	private String city;
	private Integer cityId;
	private String area;
	private Integer areaId;
	private Date createTime;
	private Date updateTime;
	private String describe;
}
