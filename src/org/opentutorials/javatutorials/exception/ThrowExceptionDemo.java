package org.opentutorials.javatutorials.exception;

import java.io.*;

class B{
	void run() throws IOException, FileNotFoundException{
		BufferedReader bReader = null;
		String input = null;	
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
}
class C{
	void run() throws IOException, FileNotFoundException{
		B b = new B();
		b.run();
	}
}

public class ThrowExceptionDemo {
	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();	
		} catch(FileNotFoundException e) {
			System.out.println("out.txt 파일은 설정 파일입니다.프로젝트 루트 디렉토리에 위치시켜 주세요");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
