package com.cocoa.designpatterns.bridge;

public class Man extends Person {
	public Man() {
		this.setType("男人");
	}
	@Override
	public void dress() {
		getClothing().personDressCloth(this);
	}

}
