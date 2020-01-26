package org.opentutorials.javatutorials.polymorphism;
interface I{}
class C implements I{} 
public class PolymorphismDemo2 {
	public static void main(String[] args) {
		I obj = new C();	// 클래스 C의 데이터 타입: 인터페이스 I
	}

}
