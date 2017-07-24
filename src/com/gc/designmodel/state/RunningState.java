package com.gc.designmodel.state;

public class RunningState extends LiftState{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("电梯上下运行....");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.context.setLiftState(LiftContext.stoppingState);
		super.context.getLiftState().stop();
	}

}
