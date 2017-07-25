package com.gc.designmodel.command;

public class DeletePageCommand extends Command{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.pg.find();
		super.pg.delete();
		super.pg.plan();
	}

}
