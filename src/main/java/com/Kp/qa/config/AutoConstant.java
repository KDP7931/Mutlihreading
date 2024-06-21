package com.Kp.qa.config;

import java.time.Duration;

public interface AutoConstant {
	
	public static final Duration ExplicitWaitTime = Duration.ofSeconds(30);
	public static final Duration ImplicitWaitTime = Duration.ofSeconds(20);
	Duration PageLoaderTime = Duration.ofSeconds(30);
	String UserName = "mngr576516";
	String Password = "EmEpypa";
	static long ConstantTime = 10000;
	/*####File Path#####*/	
	String Downloadpath ="C:\\Users\\dhava\\Downloads"; 

}
