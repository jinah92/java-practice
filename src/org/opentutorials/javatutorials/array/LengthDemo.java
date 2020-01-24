package org.opentutorials.javatutorials.array;

public class LengthDemo {

	public static void main(String[] args) {
		//String[] classGroup = {"최진혁", "최진아", "이고잉", "장동건"};
		String[] classGroup = new String[4];
		classGroup[0] = "최진혁";
		System.out.println(classGroup.length);	//배열에 담길 수 있는 자료의 크기
		classGroup[1] = "최진아";
		System.out.println(classGroup.length);
		classGroup[2] = "최유빈";
		System.out.println(classGroup.length);
		classGroup[3] = "장동건";
		System.out.println(classGroup.length);
	}

}
