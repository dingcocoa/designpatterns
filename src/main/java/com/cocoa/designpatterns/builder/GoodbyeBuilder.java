package com.cocoa.designpatterns.builder;

public class GoodbyeBuilder extends Builder {
	public GoodbyeBuilder() {
		message=new GoodByeMessage();
	}
	@Override
	protected void buildSubject() {
		message.setSubject("goodbye subject");
	}

	@Override
	protected void buildBody() {
		message.setBody("goodbye body");
	}

}
