package org.opentutorials.javatutorials.abstractclass;

abstract class A {
	public abstract int b(); 
	// 본체가 있는 메소드는 abstract 키워드를 가질 수 없음
	// public abstract int c(){System.out.println("hello");}
	
	// 추상 클래스 내에서는 추상 메소드가 아닌 메소드가 존재할 수 있음
	public void d() {
		System.out.println("world");
	}
}

class B extends A {
	public int b() {
		return 1;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		//A obj = new A(); //에러
		B obj = new B();
	}

}
