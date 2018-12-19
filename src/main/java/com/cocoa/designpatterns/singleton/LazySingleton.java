package com.cocoa.designpatterns.singleton;
/**
    * 单例模式的特点：
 * <p>1、单例类只能有一个实例</p>
 * <p>2、单列类必须自己创建自己，自己初始化</p>
 * <p>3、单例类必须给所有对象提供这一实例</p>
 * 懒汉式单列
 * <p>懒汉式单列特点：使用synchronized实现了同步化，解决多线程访问问题
 * 	使用对象的时候才开始创建对象，但是每次获取实例都要判断，浪费时间并且降低了访问速度
 * <p>
 * @author CocoaDing
 * created on 2018年12月19日 上午9:29:01	
 *
 */
public class LazySingleton {
	private static  LazySingleton instance=null;
	private LazySingleton() {}
	public static synchronized LazySingleton getInstance() {
		if(null==instance) {
			instance=new LazySingleton();
		}
		return instance;
	}
}
