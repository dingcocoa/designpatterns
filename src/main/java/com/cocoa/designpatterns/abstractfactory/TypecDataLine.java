package com.cocoa.designpatterns.abstractfactory;

public class TypecDataLine implements DataLine {

	@Override
	public void charge() {
		System.out.println("我是Type-C充电线，可以给android 手机充电");
	}

}
