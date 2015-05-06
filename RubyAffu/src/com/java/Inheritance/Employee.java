package com.java.Inheritance;

/**
 * 
 * @author faiz
 * 
 * Inheritance in java is a mechanism in which one object acquires all the properties and behaviors of parent object.

The idea behind inheritance in java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of parent class, and you can add new methods and fields also.

Inheritance represents the IS-A relationship, also known as parent-child relationship.


Why use inheritance in java
•For Method Overriding (so runtime polymorphism can be achieved).
•For Code Reusability.

 *
 */


public class Employee {
	float salary=40000;  
}  
  class Programmer extends Employee{  
     int bonus=10000;  
	 public static void main(String args[]){  
	 Programmer p=new Programmer();  
	 System.out.println("Programmer salary is:"+p.salary);  
	 System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  

}
