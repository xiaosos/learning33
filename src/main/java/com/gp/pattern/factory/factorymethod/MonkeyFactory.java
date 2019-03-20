package com.gp.pattern.factory.factorymethod;

public class MonkeyFactory implements IAnimalFactory {
	public Animal createAnimal() {
		return new Monkey();
	}
}
