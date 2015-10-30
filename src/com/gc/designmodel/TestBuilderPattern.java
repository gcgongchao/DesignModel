package com.gc.designmodel;

import java.util.ArrayList;

/***
 * 
 * @author GeneralAndroid
 *
 *建造者模式的学习：
 *注意：ArrayList和HashMap如果定义为类的成员变量，那你在方法中的调用一定要做一个clear的动作，以防止数据混乱。
 *	建造者模式(Builder Pattern)也叫做生成器模式，其定义如下：
 *	Separate the construction of a complex object from its representation so that the same construction 
 *	process can create different representations.
 *	(将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示)
 *	在建造者模式中，有如下4个角色：
 *	(1)Product产品类：通常是实现了模板方法模式，也就是有模板方法和基本方法。
 *	(2)Builder抽象建造者：规范产品的组建，一般是由子类实现。
 *	(3)ConcreteBuilder具体建造者：实现抽象类定义的所有方法，并且返回一个组建好的对象。
 *	(4)Director导演类：负责安排已有模块的顺序，然后告诉Builder开始建造。
 *建造者模式的优点：
 *（1）封装性:使用建造者模式可以使客户端不必知道产品内部组成的细节。
 *（2）建造者独立，容易扩展
 *（3）便于控制细节风险：由于具体的建造者是独立的，因此可以对建造者过程逐步细化，而不对其他的模块产生任何影响
 */
public class TestBuilderPattern {

	public static void main(String[] args) {
		//高层模块不需要知道对象到底怎么创建的，导演类起到封装的作用，避免高层模块深入到建造者内部的实现类。当然
		//在建造者模式比较庞大时，导演类可以有多个。
		Director mDirector=new Director();
		mDirector.getABenzModel().run();
		mDirector.getABMWModel().run();
	}
}
/**车辆模型的抽象类**/
abstract class CarModel{
	//这个参数是各个基本方法执行的顺序
	private ArrayList<String> sequence =new ArrayList<String>();
	//模型是启动开始跑了
	protected abstract void start();
	//能发动，那还要能停下来，那才是真本事
	protected abstract void stop();
	
	protected abstract void alarm();
	protected abstract void engineBoom();
	final public void run(){
		for(int i=0;i<this.sequence.size();i++){
			String actionName=this.sequence.get(i);
			if(actionName.equalsIgnoreCase("start")){
				this.start();
			}else if(actionName.equalsIgnoreCase("stop")){
				this.stop();
			}else if(actionName.equalsIgnoreCase("alarm")){
				this.alarm();
			}else if(actionName.equalsIgnoreCase("engine boom")){
				this.engineBoom();
			}
		}
	}
	final public void setSequence(ArrayList<String> sequence){
		this.sequence=sequence;
	}
	
}

class BenzModel extends CarModel{

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("奔驰车跑起来是这个样子的...");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("奔驰车应该这样停车...");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("奔驰车的喇叭声音是这个样子的...");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("奔驰车的引擎是这个声音的...");
	}
	
}
class BMWModel extends CarModel{

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("宝马车跑起来是这个样子的...");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("宝马车应该这样停车...");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("宝马车的喇叭声音是这个样子的...");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("宝马车的引擎是这个声音的...");
	}
	
}
/**抽象汽车组装者**/
abstract class CarBuilder{
	//建造一个模型，你要给我一个顺序，就是组装顺序
	public abstract void setSequence(ArrayList<String> sequence);
	//设置完毕顺序后，就可以直接拿到这个车辆模型
	public abstract CarModel getCarModel();
}
class BenzBuilder extends CarBuilder{

	private BenzModel benz=new BenzModel();
	@Override
	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.benz;
	}
	
}
class BMWBuilder extends CarBuilder{

	private BMWModel bmw=new BMWModel();
	@Override
	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.bmw.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.bmw;
	}
	
}
class Director{
	private ArrayList<String> sequence=new ArrayList<String>();
	private BenzBuilder benzBuilder=new BenzBuilder();
	private BMWBuilder bmwBuilder=new BMWBuilder();
	/***
	 * A类型的奔驰车模型，先start，然后stop，其他什么引擎了，喇叭一概没有
	 */
	public BenzModel getABenzModel(){
		//清理场景，这里是一些初级程序员不注意的地方
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
		
	}
	public BMWModel getABMWModel(){
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("alarm");
		this.sequence.add("stop");
		this.bmwBuilder.setSequence(sequence);
		return (BMWModel) this.bmwBuilder.getCarModel();
		
	}
}
