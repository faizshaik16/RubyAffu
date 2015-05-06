package com.java.polymorphism;


/**
 * 
 * @author faiz
 * Method Overriding in Java
 * 
 * If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in java
 * 
 * In other words, If subclass provides the specific implementation of the method that has been provided by one of its parent class, it is known as method overriding.
 * 
 * Usage of Java Method Overriding
Method overriding is used to provide specific implementation of a method that is already provided by its super class.
Method overriding is used for runtime polymorphism

 *
 */
class Vehicle{  
void run(){System.out.println("Vehicle is running");}  
}  


public class Bike2 {
	void run(){System.out.println("Bike is running safely");}  
 
	public static void main(String args[]){  
	Bike2 obj = new Bike2();  
	obj.run();  
	}
}
