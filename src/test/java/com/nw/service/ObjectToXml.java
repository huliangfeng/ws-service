package com.nw.service;

import java.util.ArrayList;
import java.util.List;

import com.nw.service.entity.Pet;
import com.nw.service.entity.PetImmune;
import com.nw.service.entity.User;
import com.nw.service.vo.PetImmuneResult;
import com.nw.service.vo.ResultEntity;
import com.thoughtworks.xstream.XStream;

public class ObjectToXml {

	public static void main(String[] args) {
		ResultEntity<PetImmuneResult> resultEntity = new ResultEntity<PetImmuneResult>();
		PetImmuneResult petImmuneResult = new PetImmuneResult();
		User user = new User();
		user.initDefaultObject();
		petImmuneResult.setUser(user);
		List<PetImmune> petImmunes = new ArrayList<PetImmune>();
		PetImmune petImmune = new PetImmune();
		petImmune.initDefaultObject();
		petImmunes.add(petImmune);
		petImmuneResult.setPetImmunes(petImmunes);
		Pet pet = new Pet();
		pet.initDefaultObject();
		petImmuneResult.setPet(pet);
		resultEntity.setObj(petImmuneResult);
		XStream xStream = new XStream();
		xStream.alias("resultEntity", ResultEntity.class);
		xStream.alias("user", User.class);
		xStream.alias("petImmune", PetImmune.class);
		xStream.alias("pet", Pet.class);
		xStream.aliasSystemAttribute(null, "class");
		String xmlStr = xStream.toXML(resultEntity);
		System.out.println(xmlStr);
		
	}
}
