package com.shiziqiu.shop.web.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shiziqiu.shop.domain.GoodsExpress;
import com.shiziqiu.shop.service.GoodsExpressService;
@RestController
@RequestMapping("/goodsExpress")
public class GoodsExpressController {

	private static Logger logger = Logger.getLogger(GoodsExpressController.class);
	
	@Resource
	private GoodsExpressService goodsExpressService;
	
	@RequestMapping(value = "/api/saveGoodsExpress",method = RequestMethod.POST)
	public Integer saveGoodsExpress(@RequestBody GoodsExpress goodsExpress) {
		return goodsExpressService.insert(goodsExpress);
	}
	
	@RequestMapping(value = "/api/updateGoodsExpress",method = RequestMethod.POST)
	public Integer updateGoodsExpress(@RequestBody GoodsExpress goodsExpress) {
		return goodsExpressService.updateByPrimaryKey(goodsExpress);
	}
	
	@RequestMapping(value = "/api/updateExpress",method = RequestMethod.GET)
	public Integer deleteGoodsExpress(@RequestParam("id") Integer id) {
		return goodsExpressService.deleteByPrimaryKey(id);
	}
	
	@RequestMapping(value = "/api/getGoodsExpress",method = RequestMethod.GET)
	public GoodsExpress getGoodsExpress(@RequestParam("id") Integer id) {
		return goodsExpressService.selectByPrimaryKey(id);
	}
	
	
}
