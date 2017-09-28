package com.shiziqiu.shop.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 评价
 * @author : shiziqiu
 * @title : GoodsEvaluate
 * @date : 2017年9月20日 下午5:34:51 
 * @FUN :
 */
@Data
public class GoodsEvaluate implements Serializable{

	/**
	 */
	private static final long serialVersionUID = 1L;
	private Integer goodsId;
	private Integer evaluateId;
	private Byte goodsStar;//星级
	private String evaluateDesc;//评价内容
	private Byte evaluateStatus;//状态
	private Long accountId;
	private String accountAvtar;//用户头像
	private String accountNickName;//用户昵称
	private String evaluateImages;//评价图片集合
	private Date createTime;
	private String remark;//备注
	
}
