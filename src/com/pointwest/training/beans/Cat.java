package com.pointwest.training.beans;

public class Cat extends Animals{
	
	@Override
	public String getSignatureSound() {
		return "meow.. meow..";
	}

	@Override
	public String getTypeOfAnimal() {
		return "Cat";
	}
}
