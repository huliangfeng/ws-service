package com.nw.service.dao;

import org.apache.ibatis.annotations.Param;

import com.nw.service.entity.User;

public interface UserDao {

	/**
	 * 根据手机号码和用户姓名查询用户信息
	 * @param phone
	 * @param username
	 * @return User
	 */
	User getUserInfo(@Param("phone")String phone, @Param("userName")String userName);
}
