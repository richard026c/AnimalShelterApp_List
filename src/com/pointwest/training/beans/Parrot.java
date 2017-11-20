package com.pointwest.training.beans;

public class Parrot extends Animals{

	@Override
	public String getSignatureSound() {
		return "panget! panget!";
	}

	@Override
	public String getTypeOfAnimal() {
		return "Parrot";
	}
}
