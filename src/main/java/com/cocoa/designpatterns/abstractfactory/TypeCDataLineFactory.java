package com.cocoa.designpatterns.abstractfactory;

public class TypeCDataLineFactory implements BaseDataLineFactory{

	@Override
	public DataLine getDataLine() {
		// TODO Auto-generated method stub
		return new TypecDataLine();
	}

}
