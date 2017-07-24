package com.gc.designmodel.chain_responsibility;

public class Son extends Handler{

	public Son() {
		super(Handler.SON_LEVEL_REQUEST);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void response(IWomen women) {
		// TODO Auto-generated method stub
		System.out.println("--------------母亲向儿子请示--------------");
		System.out.println(women.getRequest());
		System.out.println("儿子的答复是：同意\n");
	}
	

}
