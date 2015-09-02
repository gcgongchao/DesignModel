package com.gc.designmodel;
/**
 * 
    * @说明 学习设计模式之依赖倒置原则(Dependence Inversion Principle,DIP)
    * @作者 GeneralAndroid
    * @创建日期 2015-9-1 下午1:13:12
    * @版本号 1.0
    * @since 1.0
    * 采用依赖倒置原则可以减少类间的耦合性，提高系统的稳定性，降低并行开发引起的风险，提高代码的可读性和
    * 可维护性。
    * 
    * 依赖倒置原则的本质就是通过抽象（接口或抽象类）使各个类或模块的实现彼此独立，不互相影响，实现模块间的松耦合。
    * 在项目中使用时只要遵循以下的几个规则就可以：
    * （1）每个类尽量都有接口或抽象类，或者抽象类和接口两者都具备。
    * （2）变量的表面类型尽量是接口或者是抽象类
    * （3）任何类都不应该从具体类派生（主要不超过两层的继承还是可以忍受的）
    * （4）尽量不要覆写基类的方法
    * （5）结合里式替换原则使用
    * 
 */
public class TestDIPDemo {

	public static void main(String[] args) {
//		
//		Driver1 zhangSan=new Driver1();
//		Benz1 benz=new Benz1();
//		//张三开奔驰车
//		zhangSan.drive(benz);
//		IDriver zhangSan=new Driver();
//		ICar benz=new Benz();
//		zhangSan.drive(benz);
//		ICar bmw=new BMW();
//		zhangSan.drive(bmw);
//		IDriverOne iDriverOne=new DriverOne(new Benz());
//		iDriverOne.drive();
		IDriverTwo iDriverTwo=new DriverTwo();
		iDriverTwo.setCar(new Benz());
		iDriverTwo.drive();
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
/**接口只是一个抽象化的概念，是对一类事物的最抽象描述，具体的实现代码由相应的实现类来完成。
 * 依赖3种写法的其中一种——接口声明依赖对象。
 * **/
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
/***依赖的三种写法***/
/**1、构造函数传递依赖对象：
 * 在类中通过构造函数声明依赖对象，按照依赖注入的说法，这种方式叫做构造函数注入。
 * **/
interface IDriverOne
{
	//是司机就应该会驾驶汽车
	public void drive();
}
class DriverOne implements IDriverOne{

	private ICar car;
	//构造函数注入
	public DriverOne(ICar _car){
		this.car=_car;
	}
	//司机的主要职责就是驾驶汽车
	public void drive() {
		// TODO Auto-generated method stub
	this.car.run();	
	}
	
}
/**2、Setter方法传递依赖对象
 * 在抽象中设置Setter方法声明依赖关系，依照依赖注入的说法，这是Setter依赖注入
 * **/
interface IDriverTwo{
	/**车辆型号**/
	public void setCar(ICar car);
	/**是司机就应该会驾驶汽车**/
	public void drive();
}
class DriverTwo implements IDriverTwo{

	private ICar car;
	public void setCar(ICar car) {
		// TODO Auto-generated method stub
		this.car=car;
	}

	/**司机的主要职责就是驾驶汽车**/
	public void drive() {
		// TODO Auto-generated method stub
		this.car.run();
	}
	
}