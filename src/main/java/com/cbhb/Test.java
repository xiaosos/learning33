package com.cbhb;

import com.sun.tools.javac.main.JavaCompiler;
import sun.misc.ProxyGenerator;

import java.util.Arrays;

public class Test //implements Cloneable
{
	//ly1.branch
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Test{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone( );
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Test test = new Test();
		JavaCompiler pile;
//		ProxyGenerator.generateProxyClass();
		try {
			test.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace( );
		}
	}
}
