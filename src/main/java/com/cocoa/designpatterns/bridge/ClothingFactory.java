package com.cocoa.designpatterns.bridge;

public class ClothingFactory {
	private Clothing clothing;
	public ClothingFactory(Clothing clothing) {
		this.clothing=clothing;
	}
	public Clothing getClothing() {
		return clothing;
	}
}
