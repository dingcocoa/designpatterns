package com.cocoa.designpatterns.abstractfactory;

public class ChargingClient {
	public static void main(String[] args) {
		BaseStoreFactory storeFactory=new AndroidFactory();
		BaseDataLineFactory dataLineFactory=new TypeCDataLineFactory();
		Store phone=storeFactory.getStore();
		DataLine dataline=dataLineFactory.getDataLine();
		phone.getPhone();
		dataline.charge();
	}
}
