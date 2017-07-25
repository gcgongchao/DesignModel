package com.gc.designmodel.facade;

public class TestFacadePattern {
	public static void main(String[] args) {
		ModenPostOffice modenPostOffice=new ModenPostOffice();
		String address="address is load and 666 GeneralAndroid";
		String context="fuck the code";
		modenPostOffice.sendLetter(context, address);
	}
}
