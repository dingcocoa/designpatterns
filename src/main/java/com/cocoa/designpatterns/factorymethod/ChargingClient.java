package com.cocoa.designpatterns.factorymethod;

public class ChargingClient {
	public static void main(String[] args) {
		String phoneType="iphone";
		String datalineType="lightning";
		DataLine dataline= DataLineFactory.getDataLine(datalineType);
		Store phone=PhoneFactory.getStore(phoneType);
		phone.getPhone();
		dataline.charge();
	}
}
