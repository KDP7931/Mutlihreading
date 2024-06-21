package com.runner;

import com.login.threadClass.MultiThreadingTest;

public class LoginRunner {
	
	public static void main(String[] args)
	{
		Thread t1= new MultiThreadingTest("chrome thread","chrome");
		Thread t2= new MultiThreadingTest("firefox thread","firefox");
		
		System.out.println("thread started");
		
		t1.start();
		t2.start();
	}

}
