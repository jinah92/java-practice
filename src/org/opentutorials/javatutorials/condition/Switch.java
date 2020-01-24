package org.opentutorials.javatutorials.condition;

public class Switch {

	public static void main(String[] args) {
		System.out.println("switch(1)");
		switch(1){
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		System.out.println("switch(2)");
		switch(2){
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		System.out.println("switch(3)");
		switch(2){
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}
		
		int val = 2;
		if(val ==1){
			System.out.println("one");
		} else if(val==2){
			System.out.println("two");
		} else if(val==3){
			System.out.println("three");
		}
		
		System.out.println("switch(4)");
		switch(4){
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default"); 	// 실행코드
		}
		
	}

}
