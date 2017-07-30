package com.gc.designmodel.bridge;

public class House extends Product{

	@Override
	public void beProducted() {
		// TODO Auto-generated method stub
		System.out.println("生产出的房子是这样的....");
	}

	@Override
	public void beSelled() {
		// TODO Auto-generated method stub
		System.out.println("生产出的房子卖出去了......");
	}
	

}
