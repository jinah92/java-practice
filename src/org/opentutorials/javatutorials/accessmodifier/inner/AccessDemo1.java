package org.opentutorials.javatutorials.accessmodifier.inner;

class A {
	public String y() {
		return "public void y()";
	}
	private String z() {
		return "private voide z()";
	}
	public String x() {
		return z();
	}
}

public class AccessDemo1 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		
		// error
		//System.out.println(a.z());
		
		System.out.println(a.x());
	}

}
