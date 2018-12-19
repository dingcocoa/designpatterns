package com.cocoa.designpatterns.builder;

public class Client {
	public static void main(String[] args) {
		Director send=new Director(new WelcomeBuilder());
		send.send("xiaofei","xiaofei1");
		Director send1=new Director(new GoodbyeBuilder());
		send1.send("xiaofei","xiaofei1");
	}
}
