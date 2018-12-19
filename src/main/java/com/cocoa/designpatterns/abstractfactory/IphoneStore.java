package com.cocoa.designpatterns.abstractfactory;

public class IphoneStore implements Store{
	@Override
	public void getPhone() {
		System.out.println("得到Iphone");
	}
}
