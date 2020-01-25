package org.opentutorials.javatutorials.inheritance;

class Calculator2{
	int left, right;
	
	public Calculator2(){} // 기본 생성자 (명시적 정의)
	
	public Calculator2(int left, int right) {	// 사용자 정의 생성자
		this.left = left;
		this.right = right;
	}
	
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

class SubstractionableCalculator2 extends Calculator2 {
	public SubstractionableCalculator2(int left, int right){
		/*this.left = left;
		this.right = right;*/	// 부모클래스와 동일 (코드 중복)
		super(left, right);		// 부모클래스의 생성자
	}
	
	public void substract(){
		System.out.println(this.left - this.right);
	}
}

public class example1 {

	public static void main(String[] args) {
		SubstractionableCalculator2 c1 = new SubstractionableCalculator2(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}

}
