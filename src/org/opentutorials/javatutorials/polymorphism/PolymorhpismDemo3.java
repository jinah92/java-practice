package org.opentutorials.javatutorials.polymorphism;
interface I2{
	public String A();
}
interface I3{
	public String B();
}
class D implements I2, I3{
	public String A(){
		return "A";
	}
	public String B(){
		return "B";
	}
}
public class PolymorhpismDemo3 {

	public static void main(String[] args) {
		D obj = new D();
		I2 obj2 = new D();
		I3 obj3 = new D();
		
		System.out.println(obj.A());
		System.out.println(obj.B());
		
		System.out.println(obj2.A());
		//System.out.println(obj2.B());	// error
		
		//System.out.println(obj3.A());	// error
		System.out.println(obj3.B());
	}

}
