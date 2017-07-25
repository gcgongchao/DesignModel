package com.gc.designmodel.composite;

public abstract class Corp {
	private String name="";
	private String position="";
	private int salary=0;
	public Corp(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	public String getInfo(){
		String info="";
		info="姓名："+this.name+"\t职位："+this.position+"\t薪水"+this.salary;
		return info;
	}
}
