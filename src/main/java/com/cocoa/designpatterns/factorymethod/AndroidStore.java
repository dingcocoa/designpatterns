package com.cocoa.designpatterns.factorymethod;

public class AndroidStore implements Store{
	@Override
	public void getPhone() {
		System.out.println("得到一部android手机");
	}
}
