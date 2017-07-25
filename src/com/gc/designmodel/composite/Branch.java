package com.gc.designmodel.composite;

import java.util.ArrayList;

public class Branch extends Corp{
	ArrayList<Corp> subordinateList=new ArrayList<Corp>();
	
	public Branch(String name, String position, int salary) {
		super(name, position, salary);
		// TODO Auto-generated constructor stub
	}
	
	public void addSubordinate(Corp corp){
		this.subordinateList.add(corp);
	}
	
	public ArrayList<Corp> getSubordinate(){
		return this.subordinateList;
	}
	

}
