package com.cocoa.designpatterns.adapter.object;

import com.cocoa.designpatterns.adapter.clazz.ShaoLinSi;

public class Dharma {
	private ShaoLinSi shaolinsi;
	public Dharma(ShaoLinSi shaolinsi) {
		this.shaolinsi=shaolinsi;
	}
	
	public void kongfu() {
		this.shaolinsi.kongfu();
	}
	public void patter() {
		//do something
	}
}
