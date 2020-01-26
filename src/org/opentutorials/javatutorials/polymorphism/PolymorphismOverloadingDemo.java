package org.opentutorials.javatutorials.polymorphism;

// 다형성의 예 1: 오버로딩
class O {
	// 2개의 메소드 a는 같은 이름이지만 서로 다른 동작 방식을 가짐
	public void a(int param) {
		System.out.println("숫자 출력");
		System.out.println(param);
	}
	public void a(String param) {
		System.out.println("문자 출력");
		System.out.println(param);
		
	}
}

public class PolymorphismOverloadingDemo {

	public static void main(String[] args) {
		O o = new O();
		o.a(1); // 숫자 1 출력
		o.a("one"); // 문자열 "one" 출력
	}

}
