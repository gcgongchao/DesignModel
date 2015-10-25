package com.gc.designmodel;
/***
 * 
 * @author GeneralAndroid
 *	模板方法模式的学习：
 *一些点：（1）抽象是所有子类的共性封装（2）在软件开发过程中，如果相同的一段代码复制过两次，就需要对设计产生怀疑，架构师要明确地说明
 * 为什么相同的逻辑要出现两次或要多次。
 * 模板方法模式的定义：
 * Define the skeleton of an algorithm in an operation,deferring some steps to subclasses.Template Method lets subclasses
 * redefine certain steps of an algorithm without changing the algorithm's structure.
 * 定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改变 一个算法的结构即可重定义该算法的某些特定步骤。
 * 
 * 模板方法模式确实非常简单，仅仅使用了Java的继承机制，但它是一个应用非常广泛的模式。它的方法分为两类：（1）基本方法（2）模板方法。在其扩展模式中还可以有钩子方法。
 * （1）基本方法：基本方法也叫做基本操作，是由子类实现的方法，并且在模板方法被调用。
 * （2）模板方法：可以有一个或几个，一般是一个具体的方法，也就是一个框架，实现对基本方法的调度，完成固定的逻辑。
 * 注意：为了防止恶意的操作，一般模板方法都加上final关键字，不允许被覆写。
 * 
 * 模板方法模式的应用
 * 1、模板方法模式的优点：
 * (1)封装不变部分，扩展可变部分——把认为是不变部分的算法封装到父类实现，而可变部分的则可以通过继承来继续扩展。
 * (2)提取公共部分代码，便于维护。
 * (3)行为由父类控制，子类实现——基本方法是由子类实现的，因此子类可以通过扩展的方式增加相应的功能，符合开闭原则
 * 2、模板方法模式的缺点：
 *  按照我们的设计习惯，抽象类负责声明最抽象、最一般的事物属性和方法，实现类完成具体的事物属性和方法。但是模板方法模式却颠倒了
 *  ，抽象类定义了部分抽象方法，由子类实现，子类执行的结果影响了父类的结果，也就是子类对父类产生了影响，这在复杂的项目中，会带来代码
 *  阅读的难度，而且也会让新手产生不适感。
 *  3、模板方法模式的使用场景：
 *  (1)多个子类有公有的方法，并且逻辑基本相同时。
 *  (2) 重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现。
 *  (3)重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数约束其行为。
 *  
 */
public class TestTemplateMethod {

	public static void main(String[] args) {
		AbstractClass class1=new ConcreteClass1();
		AbstractClass class2=new ConcreteClass2();
		//调用模板方法
		class1.templateMethod();
		class2.templateMethod();
		
	}
}
/**抽象模板类**/
abstract class AbstractClass{
	//基本方法
	protected abstract void doSomething();
	//基本方法
	protected abstract void doAnything();
	//模板方法
	public void templateMethod(){
		/**调用基本方法，完成相关的逻辑**/
		this.doAnything();
		this.doSomething();
	}
}
class ConcreteClass1 extends AbstractClass{

	protected void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteClass1 doSomething");
	}

	protected void doAnything() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteClass1 doAnything");
	}
	
}
class ConcreteClass2 extends AbstractClass{

	protected void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteClass2 doSomething");
	}

	protected void doAnything() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteClass2 doAnything");
	}
	public void say(){
		
	}
	
}