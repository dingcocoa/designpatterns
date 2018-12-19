package com.cocoa.designpatterns.builder;

import java.util.Date;

public abstract class Builder {
	protected AutoMessage message;
	protected void buildTo(String to) {
		message.setTo(to);
	}
	protected void buildFrom(String from) {
		message.setFrom(from);
	}
	
	protected abstract void buildSubject();
	protected abstract void buildBody();
	protected void buildSendDate(){
		message.setSendDate(new Date());
	}
	protected void sendMessage() {
		message.send();
	}
	public AutoMessage getMessage() {
		return message;
	}
	public void setMessage(AutoMessage message) {
		this.message = message;
	}
	
}
