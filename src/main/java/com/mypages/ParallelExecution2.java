package com.mypages;

import org.testng.annotations.Test;

public class ParallelExecution2 extends TestBase{
	
	@Test
	public void Fourth() {
		System.out.println("Fourth Test Case");
	}
	
	@Test
	public void Fifth() {
		System.out.println("Fifth Test Case");
	}
	
	@Test
	public void Sixth() {
		System.out.println("Sixth Test Case");
	}

}
