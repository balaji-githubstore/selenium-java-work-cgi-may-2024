package com.cgi.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ZDemo1Test  {
	
	@DataProvider
	public Object[][] validData()
	{
		Object[][] data=new Object[3][2];
		//i--> number of test case
		//j--> number of parameters 
		
		data[0][0]="saul";
		data[0][1]="saul123";
		
		data[1][0]="kim";
		data[1][1]="kim123";
		
		data[2][0]="peter";
		data[2][1]="peter123";
		
		return data;
	}
	
	
	@Test(dataProvider = "validData")
	public void validLogin(String username,String password)
	{
		System.out.println("valid login "+username+password);
	}

}
