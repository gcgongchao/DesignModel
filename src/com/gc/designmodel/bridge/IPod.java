package com.gc.designmodel.bridge;

public class IPod extends Product{

	@Override
	public void beProducted() {
		// TODO Auto-generated method stub
		System.out.println("生产出的ipod是这样的....");
	}

	@Override
	public void beSelled() {
		// TODO Auto-generated method stub
		System.out.println("生产出的ipod卖出去了.....");
	}

}
