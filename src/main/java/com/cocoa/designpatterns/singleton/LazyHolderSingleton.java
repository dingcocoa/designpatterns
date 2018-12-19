package com.cocoa.designpatterns.singleton;
/**
 * 单例模式的特点：
 * <p>1、单例类只能有一个实例</p>
 * <p>2、单列类必须自己创建自己，自己初始化</p>
 * <p>3、单例类必须给所有对象提供这一实例</p>
 * Lazy initialization holder class模式
 * 比较好的一种方式
 * @author CocoaDing
 * created on 2018年12月19日 上午9:59:26	
 *
 */
public class LazyHolderSingleton {
	private LazyHolderSingleton() {}
	private static class SingletonHolder{
		private static LazyHolderSingleton instance=new LazyHolderSingleton();
	}
	public static LazyHolderSingleton getInstance() {
		return SingletonHolder.instance;
	}
}
