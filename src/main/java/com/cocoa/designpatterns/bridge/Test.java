package com.cocoa.designpatterns.bridge;

public class Test {
	public static void main(String[] args) {
		Person man=new Man();
		Person woman=new Lady();
		Clothing jacket=new Jacket();
		Clothing rose=new Rose();
		jacket.personDressCloth(man);
		jacket.personDressCloth(woman);
		rose.personDressCloth(man);
		rose.personDressCloth(woman);
	}
}
