package com.gc.designmodel.visitor;

public class Visitor implements IVisitor{

	public void visit(CommonEmployee commonEmployee) {
		// TODO Auto-generated method stub
		System.out.println(this.getCommonEmployee(commonEmployee));
	}

	public void visit(Manager manager) {
		// TODO Auto-generated method stub
		System.out.println(this.getManagerInfo(manager));
	}
	private String getBasicInfo(Employee employee){
		return "姓名："+employee.getName()+"\t"+"性别："+(employee.getSex()==Employee.FEMALE?"女":"男")+"\t"
						+"薪水:"+employee.getSalary()+"\t";
	}
	private String getManagerInfo(Manager manager){
		return this.getBasicInfo(manager)+"业绩："+manager.getPerformance()+"\t";
	}
	private String getCommonEmployee(CommonEmployee commonEmployee){
		return this.getBasicInfo(commonEmployee)+"工作："+commonEmployee.getJob()+"\t";
	}

}
