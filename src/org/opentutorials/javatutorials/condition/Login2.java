package org.opentutorials.javatutorials.condition;

public class Login2 {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		if(id.equals("jinah")){
			if(pw.equals("111111")){
				System.out.println("right");
			}else{
				System.out.println("wrong");
			}
			
		}else{
			System.out.println("wrong");
		}
	}

}
