package com.gp.pattern.factory.abstractfactory;

public class DogFactory implements IDogFactory {
	public IDog createDog(String dogType) {
		if("GuiBing".equals(dogType)){
			return new GuiBing();
		}else if("Zangao".equals(dogType)){
			return new ZangAo();
		}else {
			throw new RuntimeException("没有此类型的狗");
		}
	}
}
