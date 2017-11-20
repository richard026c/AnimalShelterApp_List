package com.pointwest.training.manager;

import java.util.List;

import com.pointwest.training.beans.Animals;
import com.pointwest.training.beans.Cat;
import com.pointwest.training.beans.Dog;
import com.pointwest.training.beans.Parrot;

public class AnimalManager {

	int uniqueID = 1000;
	String name;
	int age;
	String gender;

	public String setDogInfo(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

		return name + age + gender;
	}

	public String setCatInfo(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

		return name + age + gender;
	}

	public String setParrotInfo(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

		return name + age + gender;
	}

	public void addDog(List<Animals> listOfAnimals) {
		Animals dog = new Dog();

		dog.setName(name);
		dog.setAge(age);
		dog.setGender(gender);
		dog.setUniqueID(uniqueID++);

		listOfAnimals.add(dog);
	}

	public void addCat(List<Animals> listOfAnimals) {
		Animals cat = new Cat();

		cat.setName(name);
		cat.setAge(age);
		cat.setGender(gender);
		cat.setUniqueID(uniqueID++);

		listOfAnimals.add(cat);
	}

	public void addParrot(List<Animals> listOfAnimals) {
		Animals parrot = new Parrot();

		parrot.setName(name);
		parrot.setAge(age);
		parrot.setGender(gender);
		parrot.setUniqueID(uniqueID++);

		listOfAnimals.add(parrot);
	}

	public boolean hasRemoved(int id, List<Animals> listOfAnimals) {
		for (Animals animal : listOfAnimals) {
			if (id == animal.getUniqueID()) {
				listOfAnimals.remove(animal);
				return true;
			}
		}
		return false;
	}
	
	public boolean isShelterFull(List<Animals> listOfAnimals) {
		if (listOfAnimals.size() == 10) {
			return true;
		} return false;
	}
	
	public boolean isShelterEmpty(List<Animals> listOfAnimals) {
		if (listOfAnimals.isEmpty()) {
			return true;
		} else{
			return false;
		}
	}
}