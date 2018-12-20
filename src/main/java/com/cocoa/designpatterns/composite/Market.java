package com.cocoa.designpatterns.composite;
/**
 * 商场接口
 * @author CocoaDing
 * created on 2018年12月19日 下午4:49:35	
 *
 */
public interface Market {
	public String getName();
	public void add(Market market);
	public void remove(Market market);
	public void pay();
}
