package com.gc.designmodel.strategy;

public class TestStrategyPattern {
	public static void main(String[] args) {
		Context context;
		System.out.println("-----刚刚到吴国的时候拆第一个-----");
		context=new Context(new BackDoor());
		context.operate();
		System.out.println("---------刘备乐不思蜀，拆第二个了--------");
		context=new Context(new GivenGreenLight());
		context.operate();
		System.out.println("--------孙权的小兵追了，咋办？拆第三个---------");
		context=new Context(new BlockEnemy());
		context.operate();
		System.out.println("3+5="+Calculator.ADD.exec(3, 5));
	}
}
