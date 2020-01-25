package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
	static int i;	// 전역변수 i의 선언
	
	static void a() {
		i = 0;
	}
	
	public static void main(String[] args) {
		// 무한 반복
		for (i=0; i<5; i++){	// i를 선언하지 않음. 할당만
			a();
			System.out.println(i);
		}
	}

}
