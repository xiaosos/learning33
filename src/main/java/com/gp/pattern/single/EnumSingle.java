package com.gp.pattern.single;
public enum EnumSingle {
	INSTANCE;
	private EnumSingle(){}
	public static EnumSingle getInstance(){
		return INSTANCE;
	}
}
