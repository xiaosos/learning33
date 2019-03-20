package org.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public  class DynProxy implements InvocationHandler {

	Object target;

	public DynProxy(Object target){
		this.target = target;
	}

//	public Object getInstance(){
//		return Proxy.newProxyInstance(DynProxy.class.getClassLoader(),target.getClass().getInterfaces(),this );
//
//	}

	public void before(){
		System.out.println("before:..." );
	}

	public void after(){
		System.out.println("after:..." );
	}

	public Object invoke(Object proxy, Method method, Object[] args)  {


		before();

		Object obj = null;
		try {
			obj = method.invoke(target,args);
		} catch (IllegalAccessException e) {
			e.printStackTrace( );
		} catch (InvocationTargetException e) {
			e.printStackTrace( );
		}

		after();
		return obj;
	}
}
