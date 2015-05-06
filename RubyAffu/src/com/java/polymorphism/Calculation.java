package com.java.polymorphism;

/**
 * 
 * @author faiz
 * 
 * Method Overloading in Java
 * 
 * If a class have multiple methods by same name but different parameters, it is known as Method Overloading.
 * Advantage of method overloading?
  Method overloading increases the readability of the program.
  
  Different ways to overload the method

There are two ways to overload the method in java 

1.By changing number of arguments
2.By changing the data type
 

 
 *
 */

public class Calculation {

	void sum(int a,int b){System.out.println(a+b);}  
	 void sum(int a,int b,int c){System.out.println(a+b+c);}  
	  
	 public static void main(String args[]){  
		 Calculation obj=new Calculation();  
	 obj.sum(10,10,10);  
	obj.sum(20,20);  
	 
	 }  

}
