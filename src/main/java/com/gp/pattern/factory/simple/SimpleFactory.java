package com.gp.pattern.factory.simple;
public class SimpleFactory
{
	/**
	 * 根据动物类型创建对应实体
	 * @param 需要创建 的 动物类型
	 * @return 返回的动物类型
	 */
	public Animal createAnimal(String type){
		if("monkey".equals(type))
		{
			return new Monkey();
		}
		if("person".equals(type))
		{
			return new Person();
		}
		return null;
	}

}
