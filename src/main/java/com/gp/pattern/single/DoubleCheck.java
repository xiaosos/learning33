package com.gp.pattern.single;
public class DoubleCheck {
	private DoubleCheck(){}
	private static DoubleCheck instance = null;
	public static DoubleCheck getInstance(){
		if(instance == null){
			synchronized (DoubleCheck.class){
				if(instance == null){
					instance = new DoubleCheck();
				}
			}
		}
		return instance;
	}
}
