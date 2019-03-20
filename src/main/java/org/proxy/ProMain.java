package org.proxy;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Proxy;
import java.util.Comparator;

public class ProMain extends Duck {



	public static void main(String[] args) {
		Duck duck = new Duck();
//		duck.say();
		DynProxy dynProxy = new DynProxy(duck);
//		Person p = (Person)dynProxy.getInstance();
		Person p = (Person)Proxy.newProxyInstance(Duck.class.getClassLoader(),Duck.class.getInterfaces(),new DynProxy(duck) );


		DispatcherServlet
		System.out.println(p );
		p.toString();
		System.out.println(p.toString( ));
		p.say();


//		try {
//			String s = new String("中国人1234".getBytes("GBK"),"UTF-8");
//
//			System.out.println(s );
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace( );
//		}
	}
}
