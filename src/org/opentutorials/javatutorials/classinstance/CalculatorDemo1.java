package org.opentutorials.javatutorials.classinstance;

class Calculator {
	static double PI = 3.14;	// 클래스 멤버 (인스턴스에 따라 변하지 않는 값)
	int left, right;			// 인스턴스 멤버
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right)/2);
		
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		
		System.out.println(Calculator.PI); // 클래스를 통해 직접적으로 클래스 멤버(PI)에 접근
	}

}
