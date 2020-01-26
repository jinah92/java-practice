package org.opentutorials.javatutorials.finals;
// final 필드(=변수)
// 실행되는 과정에서 한 번 값이 정해진 이후헤는 변수 값을 바뀌지 않도록 하는 규제

class Calculator {
	static final double PI = 3.14;
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
		//Calculator.PI = 6;	// 에러
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}


// final 메소드
class A{
	final void b(){}
}

class B extends A {
	void b(){}	// error
}


// final 클래스
final class C {
	final void b(){}
}

class D extends C{} 	// error

public class CalculatorDemo1 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		//Calculator.PI = 10;	//에러
	}

}
