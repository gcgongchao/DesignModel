package com.gc.designmodel.command;

public class CodeGroup extends Group{

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("找到代码组....");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("客户要求增加一项功能....");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("客户要求删除一项功能....");
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("客户要求修改一项功能....");
	}

	@Override
	public void plan() {
		// TODO Auto-generated method stub
		System.out.println("客户要求代码变更计划....");
	}
	

}
