package com.gc.designmodel.memento;

public class TestMementoPattern {
	public static void main(String[] args) {
		Originator originator=new Originator();
		Caretaker caretaker=new Caretaker();
		caretaker.setMemento(originator.createMemento());
		originator.restoreMemento(caretaker.getMemento());
	}
}
