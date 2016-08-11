package net.icircuit.junitblog;

import static org.junit.Assert.*;

import org.junit.Ignore;

import static org.hamcrest.CoreMatchers.*; 
import org.junit.Test;

public class BasicMathTest {

	public  BasicMathTest() {
		// TODO Auto-generated constructor stub
		System.out.println("Test object is created");
	}
	@Test
	@Ignore
	public void testSumOfTwoNum() {
		int result=new BasicMath().addTwoNum(2, 9);
		assertThat(result,equalTo(11));
	}
	@Test
	public void addingTwoNumGivesSum(){
		int result=new BasicMath().addTwoNum(2, 9);
		assertThat(result,equalTo(11));
	}

}
