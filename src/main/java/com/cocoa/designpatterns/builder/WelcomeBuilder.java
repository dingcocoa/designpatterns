package com.cocoa.designpatterns.builder;

public class WelcomeBuilder extends Builder {

	public WelcomeBuilder() {
		message=new WelcomeMessage();
	}
	@Override
	protected void buildSubject() {
		message.setSubject("欢迎subject");
	}

	@Override
	protected void buildBody() {
		message.setBody("欢迎body");
	}
	
}
