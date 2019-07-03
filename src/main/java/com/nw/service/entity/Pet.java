package com.nw.service.entity;

import org.springframework.util.StringUtils;

public class Pet {

	/**
	 * 宠物昵称
	 */
	private String petName;
	
	/**
	 * 宠物照片
	 */
	private String petPic;
	
	/**
	 * 宠物品种
	 */
	private String petVarieties;
	
	/**
	 * 宠物毛色
	 */
	private String petCoatColor;
	
	/**
	 * 宠物生日
	 */
	private String petBirthday;
	
	/**
	 * 宠物性别
	 */
	private String petSex;
	
	/**
	 * 免疫证编号
	 */
	private String immuneCertificatesNo;
	
	/**
	 * 免疫证生效日期
	 */
	private String effectiveDate;
	
	/**
	 * 免疫证照片1
	 */
	private String immuneCertificatesPic1;
	
	/**
	 * 免疫证照片2
	 */
	private String immuneCertificatesPic2;
	
	public void initDefaultObject() {
		if (StringUtils.isEmpty(this.petName)) {
			this.petName = "";
		}
		if (StringUtils.isEmpty(this.petPic)) {
			this.petPic = "";
		}
		if (StringUtils.isEmpty(this.petVarieties)) {
			this.petVarieties = "";
		}
		if (StringUtils.isEmpty(this.petCoatColor)) {
			this.petCoatColor = "";
		}
		if (StringUtils.isEmpty(this.petBirthday)) {
			this.petBirthday = "";
		}
		if (StringUtils.isEmpty(this.petSex)) {
			this.petSex = "";
		}
		if (StringUtils.isEmpty(this.immuneCertificatesNo)) {
			this.immuneCertificatesNo = "";
		}
		if (StringUtils.isEmpty(this.effectiveDate)) {
			this.effectiveDate = "";
		}
		if (StringUtils.isEmpty(this.immuneCertificatesPic1)) {
			this.immuneCertificatesPic1 = "";
		}
		if (StringUtils.isEmpty(this.immuneCertificatesPic2)) {
			this.immuneCertificatesPic2 = "";
		}
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetPic() {
		return petPic;
	}

	public void setPetPic(String petPic) {
		this.petPic = petPic;
	}

	public String getPetVarieties() {
		return petVarieties;
	}

	public void setPetVarieties(String petVarieties) {
		this.petVarieties = petVarieties;
	}

	public String getPetCoatColor() {
		return petCoatColor;
	}

	public void setPetCoatColor(String petCoatColor) {
		this.petCoatColor = petCoatColor;
	}

	public String getPetBirthday() {
		return petBirthday;
	}

	public void setPetBirthday(String petBirthday) {
		this.petBirthday = petBirthday;
	}

	public String getPetSex() {
		return petSex;
	}

	public void setPetSex(String petSex) {
		this.petSex = petSex;
	}

	public String getImmuneCertificatesNo() {
		return immuneCertificatesNo;
	}

	public void setImmuneCertificatesNo(String immuneCertificatesNo) {
		this.immuneCertificatesNo = immuneCertificatesNo;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getImmuneCertificatesPic1() {
		return immuneCertificatesPic1;
	}

	public void setImmuneCertificatesPic1(String immuneCertificatesPic1) {
		this.immuneCertificatesPic1 = immuneCertificatesPic1;
	}

	public String getImmuneCertificatesPic2() {
		return immuneCertificatesPic2;
	}

	public void setImmuneCertificatesPic2(String immuneCertificatesPic2) {
		this.immuneCertificatesPic2 = immuneCertificatesPic2;
	}
	
	
	
}
