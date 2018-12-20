package com.cocoa.designpatterns.composite;

public class MarketJoin implements Market{
	String name;
	public MarketJoin(String name) {
		this.name=name;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void add(Market market) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Market market) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pay() {
		System.out.println(getName()+"已收到积分变动");
	}
}
