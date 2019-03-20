package com.cbhb;

public class MyThread implements Runnable {

	Enum e;


	public void run() {
		Runnable runnable = new Runnable( ) {
			public void run() {
				System.out.println(Thread.currentThread().getName()+":---11" );
				System.out.println(Thread.currentThread().getName()+":---22" );
			}
		};

	}

	public static void main(String[] args) {
		new Thread(new MyThread()).start();
		new Thread(new MyThread()).start();
		new Thread(new MyThread()).start();

	}
}
