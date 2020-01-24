package org.opentutorials.javatutorials.method;

public class MethodDemo3 {
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while (i < limit) {
			output += i;
			i++;
		}
		// output에 담긴 문자열을  리턴
		return output;
	}

	public static void main(String[] args) {
		// 메소드가 리턴한 값이 변수 result에 담긴다.
		String result = numbering(1, 5);
		// 변수 result 값을 화면에 출력한다.
		System.out.println(result);
	}

}
