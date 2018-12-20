package com.cocoa.designpatterns.bridge;

public class Rose implements Clothing {

	@Override
	public void personDressCloth(Person person) {
		System.out.println(person.getType()+"穿裙子");
	}

}
