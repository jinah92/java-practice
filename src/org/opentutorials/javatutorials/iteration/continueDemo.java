package org.opentutorials.javatutorials.iteration;

public class continueDemo {

	public static void main(String[] args) {
		for(int i=0; i<10; i++){
			if(i==5)
				continue;
			System.out.println("coding everybody: " + i);
		}
	}

}
