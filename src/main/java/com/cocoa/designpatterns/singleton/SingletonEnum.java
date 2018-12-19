package com.cocoa.designpatterns.singleton;
/**
 * 单例模式的特点：
 * <p>1、单例类只能有一个实例</p>
 * <p>2、单列类必须自己创建自己，自己初始化</p>
 * <p>3、单例类必须给所有对象提供这一实例</p>
 * 使用枚举来实现单实例控制会更加简洁，而且无偿地提供了序列化机制，并由JVM从根本上提供保障，绝对防止多次实例化，是更简洁、高效、安全的实现单例的方式。
 * @author CocoaDing
 * created on 2018年12月19日 上午10:24:32	
 *
 */
public enum SingletonEnum {
	INSTANCE;
	private SingletonNormal ss=null;
	private SingletonEnum() {
		ss=new SingletonNormal();
	}
	public SingletonNormal getInstance(){
		return ss;
	}
}
class SingletonNormal{}