package com.shiziqiu.shop.web.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shiziqiu.shop.domain.Goods;
import com.shiziqiu.shop.service.GoodsService;
/**
 * @title : GoodsController
 * @author : shiziqiu
 * @date : 2017年9月28日 下午1:52:51
 * @Fun :
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

	private static Logger logger = Logger.getLogger(GoodsController.class);
	
	@Resource
	private GoodsService goodsService;
	
	@RequestMapping(value = "/api/saveGoods", method = RequestMethod.POST)
	public Integer saveGoods(@RequestBody Goods good) {
		return goodsService.insert(good);
	}
	
	@RequestMapping(value = "/api/deleteGoods", method = RequestMethod.GET)
	public Integer deleteGoods(@RequestParam("id") Integer id) {
		return goodsService.deleteByPrimaryKey(id);
	}
	
	@RequestMapping(value = "/api/updateGoods", method = RequestMethod.POST)
	public Integer updateGoods(@RequestBody Goods good) {
		return goodsService.updateByPrimaryKey(good);
	}
	
	@RequestMapping(value = "/api/getGoodsById",method = RequestMethod.GET)
	public Goods getGoodsById(@RequestParam("id") Integer id) {
		logger.info("---------" + id);
		return goodsService.selectByPrimaryKey(id);
	}
}
