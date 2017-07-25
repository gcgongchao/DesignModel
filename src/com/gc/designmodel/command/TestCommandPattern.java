package com.gc.designmodel.command;

public class TestCommandPattern {
	public static void main(String[] args) {
		Invoker xiaoSan=new Invoker();
		System.out.println("--------客户要求增加一项需求------");
		Command command=new AddRequirementCommand();
		xiaoSan.setCommand(command);
		xiaoSan.action();
	}
}
