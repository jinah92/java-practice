package org.opentutorials.javatutorials.scope;

class C {
	int v = 10;
	
	void m() {
		int v = 5;
		System.out.println(v);	// 5
		System.out.println(this.v);	// 10
	}
}


public class ScopeDemo6 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
	}

}
