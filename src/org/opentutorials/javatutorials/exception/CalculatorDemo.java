package org.opentutorials.javatutorials.exception;
import org.opentutorials.javatutorials.abstractclass.calculatorDemo;

// class DivideException extends Exception {  /// 컴파일 에러
class DivideException extends RuntimeException {
	DivideException(){
		super();	// 부모 클래스와 동일한 생성자
	}
	DivideException(String message){
		super(message);
	}
}
class Calculator{
	int left, right;
	public void setOperands(int left, int right) {
		// 예외처리 1
		/*if(right == 0){
			throw new IllegalArgumentException("두 번째 인자 값은 0이 될 수 없습니다.");
		}*/
		this.left = left;
		this.right = right;
	}
	public void divide() {
		// 예외처리 2
		if(this.right == 0){
			//throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");
			throw new DivideException("0으로 나누는 것은 허용되지 않습니다."); // 사용자 정의 Exception
		}
		
		System.out.println(this.left/this.right);
		
		/*try{
			System.out.println("계산 결과는 ");
			System.out.println(this.left/this.right);
			System.out.println(" 입니다.");
			
		} catch(Exception e){
			System.out.println("\n\n e.getMessage()\n" + e.getMessage());
			System.out.println("\n\n e.toString()\n" + e.toString());
			System.out.println("\n\n e.printStackTrace()");
			e.printStackTrace();
		}*/
	}
}
public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();

		c1.setOperands(10, 0);	//예외처리방법 1. setOperands의 두번째 인자로 0이 들어오면 예외 발생
		c1.divide();			//예외처리방법 2. 메소드 divide를 실행할 때 right 값이 0이면 예외 발생 
	}

}
