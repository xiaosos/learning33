package com.cbhb;
public class LazySingleton {
	private static  LazySingleton lazySingleton = null;

	private LazySingleton(){ }


	//ly3 ,sddf

	//i'm master

	public static LazySingleton getInstance(){
		if(lazySingleton == null) {
			lazySingleton = new LazySingleton( );
			return lazySingleton;
		}
		return lazySingleton;
	}
}
