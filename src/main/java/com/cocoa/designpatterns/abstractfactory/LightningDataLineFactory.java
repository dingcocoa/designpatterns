package com.cocoa.designpatterns.abstractfactory;
/**
 * 数据线生成工厂
 * @author CocoaDing
 * created on 2018年12月13日 下午4:00:56	
 *
 */
public class LightningDataLineFactory implements BaseDataLineFactory{

	@Override
	public DataLine getDataLine() {
		// TODO Auto-generated method stub
		return new LightningDataLine();
	}
	
	/*public static DataLine getDataLine(String type) {
		DataLine dataLine=null;
		switch (type) {
		case "lightning":
			dataLine=new LightningDataLine();
			break;
		case "typec":
			dataLine=new TypecDataLine();
			break;
		default:
			break;
		}
		return dataLine;
	}*/
}
