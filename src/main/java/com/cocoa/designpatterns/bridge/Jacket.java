package com.cocoa.designpatterns.bridge;

public class Jacket implements Clothing {

	@Override
	public void personDressCloth(Person person) {
		System.out.println(person.getType()+"穿马甲");
	}

}
