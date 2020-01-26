package org.opentutorials.javatutorials.interfaces;

public interface Calculatable {
	public void setOperands(int first, int second, int third);
	public int sum();
	public int avg();
}

class Calculator implements Calculatable {
	int first, second, thrid;
	public void setOperands(int first, int second, int third){
		this.first = first;
		this.second = second;
		this.thrid = third;
	}
	public int sum() {
		return this.first + this.second + this.thrid;
	}
	public int avg() {
		return (this.first + this.second + this.thrid)/3;
	}
}