package org.opentutorials.javatutorials.interfaces;

/*인터페이스 특징*/
// 하나의 클래스가 여러개의 인터페이스를 구현
interface I1{
	public void x();
}

interface I2 {
	public void z();
}

class A implements I1, I2 {
	public void x(){}
	public void z(){}
}

// 인터페이스의 상속
interface I3 {
	public void x();
}

interface I4 extends I3{
	public void z();
}

class B implements I4 {
	public void x(){}
	public void z(){}
}

// 인터페이스의 멤버(변수)는 반드시 Public
interface I5{
	//private void x();	// error
}