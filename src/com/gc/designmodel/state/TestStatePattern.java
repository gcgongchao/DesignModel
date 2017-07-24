package com.gc.designmodel.state;
/***
 * 
 * @author GeneralAndroid
 * 
 */
public class TestStatePattern {
	public static void main(String[] args) {
		LiftContext liftContext=new LiftContext();
		liftContext.setLiftState(new ClosingState());
		liftContext.open();
		liftContext.close();
		liftContext.run();
		liftContext.stop();
	}
}

