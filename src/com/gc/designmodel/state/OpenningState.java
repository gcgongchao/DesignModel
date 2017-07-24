package com.gc.designmodel.state;

public class OpenningState extends LiftState{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("电梯门开启....");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		super.context.setLiftState(LiftContext.closingState);
		super.context.getLiftState().close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
