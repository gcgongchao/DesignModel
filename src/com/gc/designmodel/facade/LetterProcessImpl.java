package com.gc.designmodel.facade;

public class LetterProcessImpl implements ILetterProcess{

	public void writeContext(String context) {
		// TODO Auto-generated method stub
		System.out.println("填写信的内容...."+context);
	}

	public void fillEnvelope(String address) {
		// TODO Auto-generated method stub
		System.out.println("填写收件人地址及姓名...."+address);
	}

	public void letterInotoEnvelope() {
		// TODO Auto-generated method stub
		System.out.println("把信放到信封中.....");
	}

	public void sendLetter() {
		// TODO Auto-generated method stub
		System.out.println("邮寄信件....");
	}

}
