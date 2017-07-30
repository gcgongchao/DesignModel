package com.gc.designmodel.bridge;

public class ShanZhaiCorp extends Corp{

	public ShanZhaiCorp(Product product) {
		super(product);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeMoney() {
		// TODO Auto-generated method stub
		super.makeMoney();
		System.out.println("我赚钱啊....");
	}
	

}
