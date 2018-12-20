package com.cocoa.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class MarketBranch implements Market {

	private List<Market> markets=new ArrayList<Market>();
	String name;
	
	public MarketBranch(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void add(Market market) {
		System.out.println("加入"+market.getName());
		markets.add(market);
	}

	@Override
	public void remove(Market market) {
		markets.remove(market);
	}

	@Override
	public void pay() {
		System.out.println(getName()+":发生消费，积分加入会员卡,");
		for (Market market : markets) {
			market.pay();
		}
	}

}
