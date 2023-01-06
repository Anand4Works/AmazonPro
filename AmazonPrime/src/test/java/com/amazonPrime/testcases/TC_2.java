package com.amazonPrime.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.amazonPrime.org.listnersClass.class)
public class TC_2 {
	
	@Test
	public void tc2() {
		System.out.println("tc2 running");
	}

}
