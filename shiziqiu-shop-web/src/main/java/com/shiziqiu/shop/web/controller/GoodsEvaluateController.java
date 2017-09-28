package com.shiziqiu.shop.web.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shiziqiu.shop.domain.GoodsEvaluate;
import com.shiziqiu.shop.service.GoodsEvaluateService;
/**
 * @title : GoodsEvaluateController
 * @author : shiziqiu
 * @date : 2017年9月28日 下午2:54:04
 * @Fun :
 */
@RestController
@RequestMapping("/goodsEvaluate")
public class GoodsEvaluateController {

	private static Logger logger = Logger.getLogger(GoodsEvaluateController.class);
	
	@Resource
	private GoodsEvaluateService goodsEvaluateService;
	
	@RequestMapping(value = "/api/saveGoodsEvaluate", method = RequestMethod.POST)
	public Integer saveGoodsEvaluate(@RequestBody GoodsEvaluate goodsEvaluate) {
		return goodsEvaluateService.insert(goodsEvaluate);
	}
	
	@RequestMapping(value = "/api/updateGoodsEvaluate",method = RequestMethod.POST)
	public Integer updateGoodsEvaluate(@RequestBody GoodsEvaluate goodsEvaluate){
		return goodsEvaluateService.updateByPrimaryKey(goodsEvaluate);
	}
	
	@RequestMapping(value = "/api/deleteGoodsEvaluate",method = RequestMethod.GET)
	public Integer deleteGoodsEvaluate(@RequestParam("id") Integer id) {
		return goodsEvaluateService.deleteByPrimaryKey(id);
	}
	
	@RequestMapping(value = "/api/getGoodsEvaluate",method = RequestMethod.GET)
	public GoodsEvaluate getGoodsEvaluate(@RequestParam("id") Integer id) {
		return goodsEvaluateService.selectByPrimaryKey(id);
	}
	
}
