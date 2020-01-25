package org.opentutorials.javatutorials.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scannerDemo3 {

	public static void main(String[] args) {
		try {
			File file = new File("test.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()){
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		} catch (FileNotFoundException e){	// 예외처리 
			e.printStackTrace();
		}
	}

}
