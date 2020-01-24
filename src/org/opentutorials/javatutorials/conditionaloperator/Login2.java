package org.opentutorials.javatutorials.conditionaloperator;

public class Login2 {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		if(id.equals("jinah") && pw.equals("111111")){
			System.out.println("right");
		}else{
			System.out.println("wrong");
		}
	}

}
