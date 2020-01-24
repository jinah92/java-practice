package org.opentutorials.javatutorials.iteration;

public class forDemo {

	public static void main(String[] args) {
		// for (초기화; 종료조건; 반복실행)
		for (int i = 0; i<5; i++){
			System.out.println((i+1) + " : coding everybody");
		}
		
		int max = 10;
		int i = 0;
		while(i<max){
			System.out.println(i + ": coding~!");
			i++;
		}
	}

}
