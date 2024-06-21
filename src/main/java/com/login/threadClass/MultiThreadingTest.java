package com.login.threadClass;

import com.Pages.LoginPage;

public class MultiThreadingTest extends Thread{
	
	public String browserName;
	LoginPage lopage;
	public MultiThreadingTest(String threadName, String browserName)
	{
		super(threadName);
		this.browserName=browserName;
		lopage=new LoginPage();
	}
	
	
	public void run()
	{
		System.out.println("thread -- started "+ Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
			lopage.setUp(this.browserName);
			lopage.LoginTest();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally
		{
			lopage.tearDown();
		}
		
		System.out.println("thread -- ended "+ Thread.currentThread().getName());
	}

}
