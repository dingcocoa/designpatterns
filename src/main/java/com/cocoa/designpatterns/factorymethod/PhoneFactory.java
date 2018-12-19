package com.cocoa.designpatterns.factorymethod;
/**
 * 生成手机工厂
 * @author CocoaDing
 * created on 2018年12月13日 上午11:10:45	
 *
 */
public class PhoneFactory {
	public static Store getStore(String type) {
		Store store=null;
		switch (type) {
		case "iphone":
			store=new IphoneStore();
			break;
		case "android":
			store=new AndroidStore();
			break;
		default:
			break;
		}
		return store;
	}
}
