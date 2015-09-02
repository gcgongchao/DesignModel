package com.gc.designmodel;
/**
 * 
    * @说明 学习设计模式之依赖倒置原则(Dependence Inversion Principle,DIP)
    * @作者 巩超
    * @创建日期 2015-9-1 下午1:13:12
    * @版本号 1.0
    * @since 1.0
    * 采用依赖倒置原则可以减少类间的耦合性，提高系统的稳定性，降低并行开发引起的风险，提高代码的可读性和
    * 可维护性。
 */
public class TestDIPDemo {

	public static void main(String[] args) {
//		
//		Driver1 zhangSan=new Driver1();
//		Benz1 benz=new Benz1();
//		//张三开奔驰车
//		zhangSan.drive(benz);
		IDriver zhangSan=new Driver();
		ICar benz=new Benz();
		zhangSan.drive(benz);
		ICar bmw=new BMW();
		zhangSan.drive(bmw);
	}
}
/**司机类**/
class Driver1
{
	/**司机的主要职责就是驾驶汽车**/
	public void drive(Benz1 benz)
	{
		benz.run();
	}
	
}
/**奔驰车类**/
class  Benz1{
	/**汽车肯定会跑**/
	public void run(){
		System.out.println("奔驰汽车开始运行...");
	}
}
/**宝马车类**/
class BMW1{
	/**宝马车当然也可以开动了**/
	public void run(){
		System.out.println("宝马汽车开始运行...");
	}
}
/**接口只是一个抽象化的概念，是对一类事物的最抽象描述，具体的实现代码由相应的实现类来完成。**/
/**司机接口**/
interface IDriver{
	/**是司机就应该会驾驶汽车**/
	public void drive(ICar car);
}
/**司机实现类**/
class Driver implements IDriver{

	/**司机的主要职责就是驾驶汽车**/
	public void drive(ICar car) {
		// TODO Auto-generated method stub
		car.run();
	}
	
	
}
/**汽车接口**/
interface ICar{
	/**是汽车就应该能跑**/
	public void run();
}
class Benz implements ICar{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("奔驰汽车开始运行...");
	}
	
}
class BMW implements ICar{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("宝马汽车开始运行...");
	}
	
}
