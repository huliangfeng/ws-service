package com.nw.service.vo;

import java.util.List;

import com.nw.service.entity.Pet;
import com.nw.service.entity.PetImmune;
import com.nw.service.entity.User;

public class PetImmuneResult {

	private User user;

	private List<PetImmune> petImmunes;

	private Pet pet;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<PetImmune> getPetImmunes() {
		return petImmunes;
	}

	public void setPetImmunes(List<PetImmune> petImmunes) {
		this.petImmunes = petImmunes;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

}
