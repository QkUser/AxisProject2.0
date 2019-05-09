package com.qk.axis.loan;

import org.testng.annotations.Test;

import com.qk.axis.readdata.GenericFuction;

public class NewTest extends GenericFuction{
	String Nickname = getData().getVariable("Nickname");
	
  @Test
  public void f() throws Exception {
	  System.out.println("Hello");
	  openApp();
  }
}
