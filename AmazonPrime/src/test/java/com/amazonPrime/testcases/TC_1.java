package com.amazonPrime.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.amazonPrime.org.listnersClass.class)
public class TC_1 {

	@Test
	public void tc1() {
		System.out.println("tc1 running");
	}
}
