package com.gc.designmodel.state;

public abstract class LiftState {

	protected LiftContext context;
	public void setContext(LiftContext _context){
		this.context=_context;
	}
	public abstract void open();
	public abstract void close();
	public abstract void run();
	public abstract void stop();
}
