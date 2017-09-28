package com.shiziqiu.shop.web.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shiziqiu.shop.domain.GoodsDetails;
import com.shiziqiu.shop.service.GoodsDetailsService;

/**
 * @title : GoodsDetailsController
 * @author : shiziqiu
 * @date : 2017年9月28日 下午2:43:07
 * @Fun :
 */
@RestController
@RequestMapping("/goodsDetail")
public class GoodsDetailsController {

	private static Logger logger = Logger.getLogger(GoodsDetailsController.class);
	
	@Resource
	private GoodsDetailsService goodsDetailsService;
	
	@RequestMapping(value = "/api/saveGoodsDetail", method = RequestMethod.POST)
	public Integer saveGoodsDetail(@RequestBody GoodsDetails goodsDetail) {
		return goodsDetailsService.insert(goodsDetail);
	}
	
	@RequestMapping(value = "/api/updateGoodsDetail", method = RequestMethod.POST)
	public Integer updateGoodsDetail(@RequestBody GoodsDetails goodsDetail) {
		return goodsDetailsService.updateByPrimaryKey(goodsDetail);
	}
	
	@RequestMapping(value = "/api/deleteGoodsDetail", method = RequestMethod.GET)
	public Integer deleteGoodsDetail(@RequestParam("id") Integer id) {
		return goodsDetailsService.deleteByPrimaryKey(id);
	}
	
	@RequestMapping(value = "/api/getGoodsDetailById",method = RequestMethod.GET)
	public GoodsDetails getGoodsDetailById(@RequestParam("id") Integer id) {
		logger.info("=================");
		return goodsDetailsService.selectByPrimaryKey(id);
	}
}
