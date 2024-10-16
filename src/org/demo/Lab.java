package org.demo;

public class Lab {
	
	private void labOne() {
		System.out.println("Lab one finished");

	}
	
	private void labTwo() {

		System.out.println("Lab one finished");

	}
	
	public static void main(String[] args) {
		Lab l= new Lab();
		l.labOne();
		l.labTwo();
		Demo d= new Demo();
		d.demoOne();
		d.demoTwo();
	}

}
