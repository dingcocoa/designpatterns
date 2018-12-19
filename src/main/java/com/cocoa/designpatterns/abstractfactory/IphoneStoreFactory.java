package com.cocoa.designpatterns.abstractfactory;

public class IphoneStoreFactory implements BaseStoreFactory{

	@Override
	public Store getStore() {
		// TODO Auto-generated method stub
		return new IphoneStore();
	}

}
