package com.gp.pattern.factory.abstractfactory;

public class CatFactory implements ICatFactory {
	public ICat createCat(String catType) {
		if("Jerry".equals(catType)){
			return new Jerry();
		}else if("RealCat".equals(catType)){
			return new RealCat();
		}else{
			throw new RuntimeException("没有此类型的猫!");
		}
	}
}
