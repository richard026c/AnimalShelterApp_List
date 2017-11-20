package com.pointwest.training.beans;

public class Dog extends Animals{

	@Override
	public String getSignatureSound() {
		return "arf! arf! arf!";
	}

	@Override
	public String getTypeOfAnimal() {
		return "Dog";
	}
}
