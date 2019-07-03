package com.nw.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nw.service.entity.Pet;
import com.nw.service.entity.PetImmune;

public interface PetDao {

	/**
	 * 根据手机号码和用户姓名查询宠物免疫记录信息
	 * @param phone
	 * @param userName
	 * @return PetImmune
	 */
	List<PetImmune> getPetImmuneInfoList(@Param("phone")String phone, @Param("userName")String userName);
	
	/**
	 * 根据手机号码和用户姓名查询宠物信息
	 * @param phone
	 * @param userName
	 * @return Pet
	 */
	Pet getPetInfo(@Param("phone")String phone, @Param("userName")String userName); 
}
