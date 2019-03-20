package com.gp.pattern.factory.abstractfactory;

public class AbstractFactory {
	private ICatFactory iCatFactory;
	private IDogFactory iDogFactory;

	public AbstractFactory(ICatFactory iCatFactory, IDogFactory iDogFactory) {
		this.iCatFactory = iCatFactory;
		this.iDogFactory = iDogFactory;
	}

	public IDog getDog(String dogType){
		return iDogFactory.createDog(dogType);
	}

	public ICat getCat(String catType){
		return iCatFactory.createCat(catType);
	}
}
