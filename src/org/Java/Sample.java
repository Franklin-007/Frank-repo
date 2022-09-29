package org.Java;

public class Sample{
public void information() {
	String firstName = "Franklin";
	long phoneNumber = 9677281769l;
	byte date=25;
	short year = 2022;
	char gender = 'M';
	float sal = 294847.97948f;
	double sal1 = 294847.97948;
	System.out.println("String value is:" +firstName);
	System.out.println("Long value is: " +phoneNumber);
	System.out.println("Byte value is: " +year);
	System.out.println("Char value is: " +gender);
	System.out.println("Float value is: " +sal);
	System.out.println("Double value is: " +sal1);
}
public static void main(String[] args) {
	Sample s = new Sample();
	s.information();
}
}
