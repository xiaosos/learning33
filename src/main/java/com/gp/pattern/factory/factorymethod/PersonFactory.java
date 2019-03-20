package com.gp.pattern.factory.factorymethod;

public class PersonFactory implements IAnimalFactory {
	public Animal createAnimal() {
		return new Person();
	}
}
