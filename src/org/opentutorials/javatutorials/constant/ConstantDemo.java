package org.opentutorials.javatutorials.constant;

public class ConstantDemo {

	public static void main(String[] args) {
		/*double a = 2.2;
		float b = 2.2F;*/
		int a = 2147483647;
		long b = 2147483648L;
		
		/*자동 형변환은 표현 범위가 작은 => 큰 순서로 가능*/
		double c = 3.0F; // 자동 형변환: Float => Double
		/*float d = 3.0; 	// 에러: Double => Float
*/		
		
	}

}
