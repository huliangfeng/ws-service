package com.nw.service.webservice.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.nw.service.dao.PetDao;
import com.nw.service.dao.UserDao;
import com.nw.service.entity.Pet;
import com.nw.service.entity.PetImmune;
import com.nw.service.entity.User;
import com.nw.service.vo.ResultEntity;
import com.nw.service.webservice.PetWebService;
import com.thoughtworks.xstream.XStream;

@Component("petWebService")
public class PetWebServiceImpl implements PetWebService {

	@Autowired
	private PetDao petDao;
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public String getPetImmuneInfo(String phone, String userName) throws Exception{
		if (StringUtils.isEmpty(phone) || StringUtils.isEmpty(userName)) {
			throw new RuntimeException("phone or userName is null");
		}
		User user = userDao.getUserInfo(phone, userName);
		if (user == null) {
			throw new RuntimeException("user info is null");
		} else {
			List<PetImmune> petImmuneList = petDao.getPetImmuneInfoList(phone, userName);
			if (petImmuneList == null) {
				petImmuneList = new ArrayList<PetImmune>();
				PetImmune petImmune = new PetImmune();
				petImmune.initDefaultObject();
				petImmuneList.add(petImmune);
			}
			Pet pet = petDao.getPetInfo(phone, userName);
			if (pet == null) {
				pet = new Pet();
				pet.initDefaultObject();
			}
			List<Object> resultBody = new ArrayList<Object>();
			resultBody.add(user);
			resultBody.add(petImmuneList);
			resultBody.add(pet);
			ResultEntity<List<Object>> resultEntity = new ResultEntity<List<Object>>();
			resultEntity.setObj(resultBody);
			
			XStream xStream = new XStream();
			xStream.alias("resultEntity", ResultEntity.class);
			xStream.alias("user", User.class);
			xStream.alias("petImmune", PetImmune.class);
			xStream.alias("pet", Pet.class);
			xStream.aliasSystemAttribute(null, "class");
			String xmlStr = xStream.toXML(resultEntity);
			return xmlStr;
		}
	}


}
