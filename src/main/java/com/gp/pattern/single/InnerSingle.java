package com.gp.pattern.single;
public class InnerSingle {
	private InnerSingle(){}
	public static InnerSingle getInstance(){
		return new InnerClass().instance;
	}
	private static class InnerClass{
		public  static InnerSingle instance = new InnerSingle();
	}
}
