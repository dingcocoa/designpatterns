package com.cocoa.designpatterns.builder;

import java.util.Date;

public abstract class AutoMessage {
	private String to;
	private String from;
	private String subject;
	private String body;
	private Date sendDate;
	protected void send() {
		System.out.println("send start");
		System.out.println("from:"+getFrom());
		System.out.println("to:"+getTo());
		System.out.println("subject:"+getSubject());
		System.out.println("body:"+getBody());
		System.out.println("date:"+getSendDate().toString());
		System.out.println("send over");
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
	
}
