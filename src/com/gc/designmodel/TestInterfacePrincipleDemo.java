package com.gc.designmodel;
/***
 * 
    * @说明 设计模式之接口隔离原则学习
    * @作者 Android将军
    * @创建日期 2015-9-2 下午3:46:24
    * @版本号 1.0
    * @since 1.0
 */
public class TestInterfacePrincipleDemo {
	public static void main(String[] args) {
		//定义一个美女
		IPettyGirl yanYan=new PettyGirl("哈哈");
		AbstractSearcher searcher=new Searcher(yanYan);
		searcher.show();
	}

}
/**美女 基类**/
interface IPettyGirl
{
	/**要有较好的面孔**/
	public void goodLooking();
	/**要有好身材**/
	public void niceFigure();
	/**要有气质**/
	public void greatTemperament();
}
class PettyGirl implements IPettyGirl{

	private String name;
	/**美女都有名字**/
	public PettyGirl(String name) {
		
		this.name = name;
	}

	/**脸蛋漂亮**/
	public void goodLooking() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"-----脸蛋很漂亮！");
	}

	/**身材要好**/
	public void niceFigure() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"----气质非常好");
		
	}

	
	/**气质要好**/
	public void greatTemperament() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"----身材非常棒!");
	}
	
}
/**星探抽象类**/
abstract class AbstractSearcher{
	protected IPettyGirl pettyGril;

	public AbstractSearcher(IPettyGirl pettyGril) {
		super();
		this.pettyGril = pettyGril;
	}
	/**搜索美女，列出美女信息**/
	public abstract void show();
}

/**星探类**/
class Searcher extends AbstractSearcher{

	public Searcher(IPettyGirl pettyGril) {
		super(pettyGril);
		// TODO Auto-generated constructor stub
	}
	

	/**展示美女信息**/
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("-------------美女的信息如下：---------------");
		//展示面容
		pettyGril.goodLooking();
		//展示身材
		pettyGril.niceFigure();
		//展示气质
		pettyGril.greatTemperament();
	}
	
}

