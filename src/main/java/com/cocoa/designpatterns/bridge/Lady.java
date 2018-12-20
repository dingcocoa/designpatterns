package com.cocoa.designpatterns.bridge;

public class Lady extends Person {
	public Lady() {
		setType("女人");
	}
	@Override
	public void dress() {
		getClothing().personDressCloth(this);
	}

}
