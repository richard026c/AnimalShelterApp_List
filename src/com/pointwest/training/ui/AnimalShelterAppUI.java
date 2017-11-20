package com.pointwest.training.ui;

import java.util.List;
import java.util.Scanner;

import com.pointwest.training.beans.Animals;
import com.pointwest.training.manager.AnimalManager;

public class AnimalShelterAppUI {

	Scanner userIn = new Scanner(System.in);
	AnimalManager manager = new AnimalManager();

	public void displayMainMenu(List<Animals> listOfAnimals) {

		do {
			System.out.println("Welcome to Richard's Animal Shelter!");

			if (manager.isShelterEmpty(listOfAnimals)) {
				System.out.println("The shelter is currently empty.");
				System.out.println("Please select an option:");
				System.out.println("1. Add an Animal");
			} else if (manager.isShelterFull(listOfAnimals)) {
				System.out.println(
						"The shelter is currently full. We can no longer be able to accept a new animal. Do you want to continue? \n[1] Yes [2] No");
				String shelterFull = userIn.nextLine();

				if ("1".equalsIgnoreCase(shelterFull)) {
					System.out.println("Please select an option:");
					System.out.println("2. Remove an Animal");
					System.out.println("3. View all Animals");
				} else if ("2".equalsIgnoreCase(shelterFull)) {
					System.out.println("Program Ends. Goodbye!");
					break;
				} else {
					continue;
				}

			} else {
				System.out.println("Please select an option:");
				System.out.println("1. Add an Animal");
				System.out.println("2. Remove an Animal");
				System.out.println("3. View all Animals");
			}

			String mainMenu = userIn.nextLine();

			switch (mainMenu) {
			case "1":
				if (manager.isShelterEmpty(listOfAnimals) || !manager.isShelterFull(listOfAnimals)) {
					displayAddAnimalOption(listOfAnimals);
				}
				break;
			case "2":
				if (!manager.isShelterEmpty(listOfAnimals) || manager.isShelterFull(listOfAnimals)) {
					removeAnimal(listOfAnimals);
				}
				break;
			case "3":
				if (!manager.isShelterEmpty(listOfAnimals) || manager.isShelterFull(listOfAnimals)) {
					viewAnimals(listOfAnimals);
				}
				break;
			}
		} while (true);
	}

	public void displayAddAnimalOption(List<Animals> listOfAnimals) {
		System.out.println("What animal you are trying to add?");
		System.out.println("1. A Dog");
		System.out.println("2. A Cat");
		System.out.println("3. A Parrot");

		String selectAnimal = userIn.nextLine();

		switch (selectAnimal) {
		case "1":
			addAnimal();
			manager.addDog(listOfAnimals);
			break;
		case "2":
			addAnimal();
			manager.addCat(listOfAnimals);
			break;
		case "3":
			addAnimal();
			manager.addParrot(listOfAnimals);
			break;
		}
	}

	public void addAnimal() {
		System.out.println("Name: ");
		String name = userIn.nextLine();

		System.out.println("Age: ");
		int age = Integer.parseInt(userIn.nextLine());

		System.out.println("Gender: ");
		String gender = userIn.nextLine();

		manager.setDogInfo(name, age, gender);
		manager.setCatInfo(name, age, gender);
		manager.setParrotInfo(name, age, gender);
	}

	public void removeAnimal(List<Animals> listOfAnimals) {
		System.out.println("Please enter the reference ID of the animal to remove: ");
		int id = Integer.parseInt(userIn.nextLine());

		if (manager.hasRemoved(id, listOfAnimals)) {
			System.out.println("The animal is now removed.");
		} else {
			System.out.println("Animal ID not found.");
		}
	}

	public void viewAnimals(List<Animals> listOfAnimals) {
		System.out.println("Meet our lovely animal friends!");

		for (Animals animal : listOfAnimals) {
			System.out.println(animal.getUniqueID() + " : " + animal.getSignatureSound() + "...Hi I'm "
					+ animal.getName() + " the " + animal.getTypeOfAnimal() + ", " + animal.getAge() + " yr/s old.");
		}
	}
}
