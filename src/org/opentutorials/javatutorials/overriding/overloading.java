package org.opentutorials.javatutorials.overriding;

class Calculator2{
	int left, right;
	int third = 0;
	
	public void setOperands(int left, int right) {
		System.out.println("setOperands(int left, int right)");
		this.left = left;
		this.right = right;
		this.third = 0;
	}
	
	public void setOperands(int left, int right, int third) {
		System.out.println("setOperands(int left, int right, int third)");
		this.left = left;
		this.right = right;
		this.third = third;
	}
	
	public void sum2() {
		System.out.println(this.left + this.right + this.third);
	}
	
	public void avg() {
		System.out.println((this.left+this.right+this.third)/3);
	}
}

public class overloading {

	public static void main(String[] args) {
		
		Calculator2 c1 = new Calculator2();
		c1.setOperands(10, 20);
		c1.sum2();	//	30
		c1.avg();	// 15
		
		//c1.setOperands(10, 20, 30);
		c1.setOperands(20, 10, 30);
		c1.sum2();	// 60
		c1.avg();	// 20
	}

}
