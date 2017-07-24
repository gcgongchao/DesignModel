package com.gc.designmodel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/***
 * 
    * @说明 学习设计模式之里式替换原则，LSP（Liskov Substitution Principle,LSP）
    * @作者 Android将军
    * @创建日期 2015-8-31 下午1:37:40
    * @版本号 1.0
    * @since 1.0
    * 采用里式替换原则的目的就是增强程序的健壮性，版本升级时也可以保持非常好的兼容性。
    * 即使增加子类，原有的子类还可以继续运行。在实际项目中，每个子类对应不同的业务含义，
    * 使用父类作为参数，传递不同的子类完成不同的业务逻辑，非常完美！
 */
public class TestLSPDemo {

	public static void main(String[] args) {
		//产生三毛这个士兵
//		Soldier sanMao=new Soldier();
//		//给三毛一支枪
//		sanMao.setGun(new Rifle());
//		sanMao.killEnemy();
//		Snipper sanMao=new Snipper();
//		sanMao.setRifle(new AUG());
//		sanMao.killEnemy(new AUG());
		invoker1();
	}
	public static void invoker1()
	{
//		Father1 f=new Father1();
		Son1 f=new Son1();
		HashMap map=new HashMap();
		f.doSomething(map);
	}
	public static void invoker()
	{
		//有父类的地方就有子类
//		Father f=new Father();
		Son f=new Son();
		HashMap map=new HashMap();
		f.doSomething(map);
	}
	
	
}
/**枪支抽象类**/
abstract class AbstractGun{
	/**枪用来干什么的？杀敌！**/
	public abstract void shoot();
}
/**手枪**/
class Handgun extends AbstractGun
{

	/**手枪的特点是携带方便、射程远**/
	public void shoot() {
		// TODO Auto-generated method stub
		System.out.println("手枪射击...");
	}
	
}
/**步枪**/
class Rifle extends AbstractGun
{

	/**步枪的特点是射程远，威力大**/
	public void shoot() {
		// TODO Auto-generated method stub
		System.out.println("步枪射击...");
	}
	
}
/**机枪**/
class MachineGun extends AbstractGun
{

	/**机枪扫射**/
	public void shoot() {
		// TODO Auto-generated method stub
		System.out.println("机枪扫射...");
	}
	
}
/**
 * 士兵类
 * 注意：(1)在类中调用其他类时务必要使用父类或接口，如果不能使用父类或接口，则说明类的
 * 设计已经违背了LSP原则。(2)如果子类不能完整地实现父类的方法，或者父类的某些方法在子类
 * 中已经发生“畸变”，则建议断开父子继承关系，采用依赖、聚集、组合等关系代替继承。
 * **/
class Soldier
{
	/**定义士兵的枪支**/
	private AbstractGun gun;
	/**给士兵一支枪**/
	public void setGun(AbstractGun _gun)
	{
		this.gun=_gun;
	}
	public void killEnemy()
	{
		System.out.println("士兵开始杀敌人....");
		gun.shoot();
	}
}
class AUG extends Rifle
{
	/**狙击枪都携带一个精准的望远镜**/
	public void zoomOut()
	{
		System.out.println("通过望远镜察看敌人...");
	}
	public void shoot()
	{
		System.out.println("AUG射击...");
	}
}
class Snipper
{
	private Rifle rifle;
	public void setRifle(Rifle rifle)
	{
		this.rifle=rifle;
	}
	public void killEnemy(AUG aug)
	{
		/**首先看看敌人的情况，别杀死敌人，自己也被干掉**/
		aug.zoomOut();
		/**开始射击**/
		aug.shoot();
		
	}
}
/***覆盖或实现父类的方法时输入参数可以被放大
 * 里式替换原则也要求制定一个契约，就是父类或接口，这种设计方法也叫做Design by Contract(契约设计)
 * 与里式替换原则有着异曲同工之妙。契约制定了，也就同时制定了前置条件和后置条件，前置条件就是你要让我执行，
 * 就必须满足我的条件，后置条件就是我执行完了需要反馈。
 * 注意：子类中方法的前置条件必须与超类中被覆写的方法的前置条件相同或者更宽松。
 * ***/
class Father
{
	public Collection doSomething(HashMap map)
	{
		System.out.println("父类被执行...");
		return map.values();
	}
}
class Son extends Father
{
	/**放大输入参数类型**/
	public Collection doSomething(Map map)
	{
		System.out.println("子类被执行...");
		return map.values();
	}
}
class Father1
{
	public Collection doSomething(Map map)
	{
		System.out.println("父类1被执行...");
		return map.values();
	}
}
class Son1 extends Father1
{
	public Collection doSomething(HashMap map)
	{
		System.out.println("子类1被执行...");
		return map.values();
	}
}