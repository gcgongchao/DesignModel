package com.gc.designmodel.chain_responsibility;

public class Father extends Handler{

	public Father() {
		super(Handler.FATHER_LEVEL_REQUEST);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void response(IWomen women) {
		// TODO Auto-generated method stub
		System.out.println("------------女儿向父亲请示------------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是：同意\n");
	}

}
