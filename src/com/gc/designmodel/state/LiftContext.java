package com.gc.designmodel.state;

public class LiftContext {
	public final static OpenningState openningState=new OpenningState();
	public final static ClosingState closingState=new ClosingState();
	public final static RunningState runningsState=new RunningState();
	public final static StoppingState stoppingState=new StoppingState();
	private LiftState liftState;
	public LiftState getLiftState(){
		return liftState;
	}
	public void setLiftState(LiftState liftState){
		this.liftState=liftState;
		this.liftState.setContext(this);
	}
	public void open(){
		this.liftState.open();
	}
	public void close(){
		this.liftState.close();
	}
	public void run(){
		this.liftState.run();
	}
	public void stop(){
		this.liftState.stop();
	}
}
