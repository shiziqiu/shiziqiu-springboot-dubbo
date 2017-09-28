package com.shiziqiu.shop.web.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shiziqiu.shop.domain.User;
import com.shiziqiu.shop.service.UserService;

/**
 * @title : UserController
 * @author : shiziqiu
 * @date : 2017年9月28日 上午11:36:40
 * @Fun :
 */
@RestController
@RequestMapping("/user")
public class UserController {

	private static Logger logger = Logger.getLogger(UserController.class);

	@Resource
	private UserService userService;
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/api/saveUser",method = RequestMethod.POST)
	public Integer saveUser(@RequestBody User user) {
		return userService.insert(user);
	}
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/api/deleteUser")
	public Integer deleteUser(@RequestParam("id") Integer id){
		return userService.deleteByPrimaryKey(id);
	}
	
	@RequestMapping(value = "/api/updateUser",method = RequestMethod.POST)
	public Integer updateUser(@RequestBody User  user) {
		return userService.updateByPrimaryKey(user);
	}

	@RequestMapping(value = "/api/getUserById", method = RequestMethod.GET)
	public User getUserById(@RequestParam("id") Integer id) {
		User user = userService.selectByPrimaryKey(id);
		if (user != null) {
			System.out.println("user.getName():" + user.getName());
			logger.info("user.getAge():" + user.getAge());
		}
		return user;
	}
}
