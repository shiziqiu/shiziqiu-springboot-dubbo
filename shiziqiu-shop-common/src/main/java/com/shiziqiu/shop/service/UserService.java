package com.shiziqiu.shop.service;
import com.shiziqiu.shop.domain.User;
/**
 * @title : UserService
 * @author : shiziqiu
 * @date : 2017年9月28日 上午10:42:06
 * @Fun :
 */
public interface UserService {

	int deleteByPrimaryKey(Integer userId);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer userId);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}
