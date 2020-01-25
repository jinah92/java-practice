package org.opentutorials.javatutorials.overriding;

public class overloadingDemo {
	void A() {System.out.println("void A()");}
	void A(int arg1){System.out.println("void A (int arg1)");}
//	int A() {System.out.println("void A()");}	// error
	void A(String arg1){System.out.println("void A (string arg1)");}
	
	public static void main(String[] args) {
		overloadingDemo od = new overloadingDemo();
		od.A(); 	// "void A()"
		od.A(1);	// "void A (int arg1)"
		od.A("coding everybody");// "void A (string arg1)"
	}

}
