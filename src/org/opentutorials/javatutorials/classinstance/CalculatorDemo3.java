package org.opentutorials.javatutorials.classinstance;

class C1 {
	static int static_val = 1;	// 클래스 변수
	int instance_val = 2;		// 인스턴스 변수
	
	static void static_static(){		// 클래스 메소드가 클래스 변수에 접근
		System.out.println(static_val);
	}
	static void static_instance() {
		// 클래스 메소드에서 인스턴스 변수에 접근할 수 없다.
		// System.out.println(instance_val);
	}
	void instance_static() {
		// 인스턴스 메소드는 클래스 변수에 접근할 수 있다.
		System.out.println(static_val);
	}
	void instance_instance() {
		System.out.println(instance_val);
	}
	
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		C1 c = new C1();
		// 인스턴스를 이용해서 정적 메소드에 접근 => 성공
		// 인스턴스 메소드가 정적 변수에 접근 => 성공
		c.static_static();
		// 인스턴스를 이용해서 정적 메소드에 접근 => 성공
		// 정적 메소드가 인스턴스 변수에 접근 => 실패
		c.static_instance();
		c.instance_static();
		c.instance_instance();
		C1.static_static();
		C1.static_instance();
		//C1.instance_static();
		//C1.instance_instance();
		
	}

}
