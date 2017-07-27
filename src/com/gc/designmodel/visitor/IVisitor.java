package com.gc.designmodel.visitor;

public interface IVisitor {
	public void visit(CommonEmployee commonEmployee);
	public void visit(Manager manager);
}
