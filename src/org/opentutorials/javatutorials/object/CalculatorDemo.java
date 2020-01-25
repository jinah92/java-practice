package org.opentutorials.javatutorials.object;

class Calculator{
	int left, right;	// (1) 
	
	public void setOperands(int left, int right) {
		this.left = left;	// this : 인스턴스 자신을 가르킴 (=> 인자로 받은 left를 (1)의 left에 대입
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
	
}

public class CalculatorDemo {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();	// 인스턴스 생성 (객체화 = 객체 생성)
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();	// 인스턴스 생성
		c2.setOperands(20, 40);
		c2.sum();
		c2.avg();
	}

}
