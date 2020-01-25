package org.opentutorials.javatutorials.overriding;

class Calculator {
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public int avg() {
		return ((this.left + this.right)/2);
	}
}

class Substractionable extends Calculator {
	
	public void sum() {	// 오버라이딩 (재정의)
		System.out.println("실행 결과는 " + (this.left + this.right) + " 입니다.");
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
	
	public int avg() {
		return super.avg(); // 부모 클래스의 메소드를 오버라이딩
	}
}

public class example1 {

	public static void main(String[] args) {
		Substractionable c1 = new Substractionable();
		c1.setOperands(10, 20);		// 오버라이딩 된 메소드가 실행
		c1.sum();
		System.out.println("실행 결과는 " + c1.avg());
		c1.substract();
	}

}
