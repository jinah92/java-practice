package org.opentutorials.javatutorials.exception;

class A2 {
	private int [] arr = new int[3];
	A(){
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	public void z(int first, int second){
		try{
			System.out.println(arr[first]/arr[second]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		} catch(Exception e){
			System.out.println("Exception");
		} finally {
			System.out.println("finally");	// 예외여부와 상관없이 언제나 실행
		}
	}
}
public class Exception_Finally {

	public static void main(String[] args) {
		A2 a = new A2();
		a.z(10, 0);	// Exception: ArrayIndexOutOfBoundsException
		a.z(1, 0);	// Exception: ArithmeticException
		a.z(2, 1);
	}

}
