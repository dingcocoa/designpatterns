package com.cocoa.designpatterns.abstractfactory;

public class LightningDataLine implements DataLine {

	@Override
	public void charge() {
		System.out.println("我是Lightning充电线，可以给iphone 手机充电");
	}

}
