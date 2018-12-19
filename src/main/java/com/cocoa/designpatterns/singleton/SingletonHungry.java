package com.cocoa.designpatterns.singleton;
/**
 * 单例模式的特点：
 * <p>1、单例类只能有一个实例</p>
 * <p>2、单列类必须自己创建自己，自己初始化</p>
 * <p>3、单例类必须给所有对象提供这一实例</p>
 * 饿汉式单例
 * <p>特点：空间换时间，在类装载的时候加载，永远占着内存，节省了运行时间，但是在刚开始不使用的时候浪费资源</p>
 * @author CocoaDing
 * created on 2018年12月19日 上午9:19:45	
 *
 */
public class SingletonHungry {
	private static SingletonHungry instance=new SingletonHungry();
	/**
	 * 构造函数私有化，防止外部对象初始化
	 */
	private SingletonHungry(){}
	
	public static SingletonHungry getInstance() {
		return instance;
	}
}
