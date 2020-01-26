package org.opentutorials.javatutorials.polymorphism;

class A {
	public String x() {return "A.x";}
}

class B extends A{ // 클래스 A를 상속
	public String x() {return "B.x";}
	public String y() {return "y";}
		
}	

class B2 extends A{ // 클래스 A를 상속
	public String x() {return "B2.x";}
}

public class PolymorphismDemo1 {
	public static void main(String[] args) {
		A obj	= new B();	// 클래스 B의 데이터형: 클래스 A (=> 클래스 B가 클래스 A화)
		A obj2 	= new B2();	// 클래스B2의 데이터형: 클래스 A (=> 클래스 B2가 클래스 A화)
		System.out.println(obj.x());	//B.x 출력
		System.out.println(obj2.x());	//B2.x 출력
		//obj.y(); // error
		
	}

}
