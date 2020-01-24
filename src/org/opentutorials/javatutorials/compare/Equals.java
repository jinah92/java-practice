package org.opentutorials.javatutorials.compare;

public class Equals {

	public static void main(String[] args) {
		String a = "hello world";
		String b = new String("hello world");
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // true
	}

}
