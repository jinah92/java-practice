package org.opentutorials.javatutorials.conditionaloperator;

public class Login3 {
	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		if((id.equals("egoing"))||(id.equals("k8805"))||(id.equals("jinah"))){
			System.out.println("true");
		}else{
			System.out.println("wrong");
		}
	}

}
