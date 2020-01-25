package org.opentutorials.javatutorials.overriding;

public class overloadingDemo2 extends overloadingDemo{
	// overloadingDemo 상속
	
	
	void A (String arg1, String arg2) {
		System.out.println("sub class: void A (String arg1, String arg2)");
	}	// overloading
	
	void A () {
		System.out.println("sub class: void A()");
	}	// overriding
	
	public static void main(String[] args) {
		overloadingDemo2 od = new overloadingDemo2();
		od.A();
		od.A(1);
		od.A("coding everybody");
		od.A("coding everybody", "hello");
	}

}
