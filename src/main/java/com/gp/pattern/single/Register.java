package com.gp.pattern.single;
import java.util.concurrent.ConcurrentHashMap;
public class Register {
	private Register(){}
	private static ConcurrentHashMap<String,Register> map = new ConcurrentHashMap<String,Register>();
	static{
		Register register = new Register();
		map.put(Register.class.getName(),register);
	}
	public static Register getInstance(String name){
		Register ret = map.get(name);
		if(ret == null){
			ret = new Register();
			map.put(name,ret);
		}
		return ret;
	}
}
