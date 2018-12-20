package com.cocoa.designpatterns.composite;

public class Test {
	public static void main(String[] args) {
		Market beijing =new MarketBranch("北京总店");
		Market chong =new MarketJoin("北京崇文门分店");
		Market qianmen =new MarketJoin("北京前门分店");
		Market tiananmen =new MarketJoin("北京天安门分店");
		Market yiheyuan =new MarketJoin("北京颐和园分店");
		Market xiangshan =new MarketJoin("北京香山分店");
		Market guomao =new MarketJoin("北京国贸分店");
		beijing.add(chong);
		beijing.add(qianmen);
		beijing.add(tiananmen);
		beijing.add(yiheyuan);
		beijing.add(xiangshan);
		beijing.add(guomao);
		beijing.pay();
	}
}
