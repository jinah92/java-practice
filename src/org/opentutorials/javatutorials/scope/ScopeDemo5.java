package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {
	static int i = 5;	// 전역변수
	
	static void a() {
		int i = 10; 	// 지역변수
		b();
	}
	
	static void b() {
		int i = 30;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		//int i = 30;
		a(); // 출력결과 : 5(전역변수)
	}

}
