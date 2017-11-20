package com.pointwest.training.main;

import java.util.ArrayList;
import java.util.List;

import com.pointwest.training.beans.Animals;
import com.pointwest.training.ui.AnimalShelterAppUI;

public class AnimalShelterAppMain {

	public static void main(String[] args) {

		AnimalShelterAppUI mainUI = new AnimalShelterAppUI();
		List<Animals> listOfAnimals = new ArrayList<Animals>(10);

		mainUI.displayMainMenu(listOfAnimals);
	}
}
