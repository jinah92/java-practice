package org.opentutorials.javatutorials.overriding;

class Calculator_sample {
	int[] operands;
	
	public void setOperands(int[] operands) {
		this.operands = operands;
	}
	
	public void sum() {
		int total = 0;
		for(int value : this.operands){
			total += value;
		}
		System.out.println(total);
	}
	
	public void avg() {
		int total = 0;
		for(int val : this.operands){
			total += val;
		}
		System.out.println(total/operands.length);
	}
}

public class example2 {

	public static void main(String[] args) {
		Calculator_sample c1 = new Calculator_sample();
		c1.setOperands(new int[]{10, 20});
		c1.sum();
		c1.avg();
		c1.setOperands(new int[]{10, 20, 30});
		c1.sum();
		c1.avg();
	}

}
