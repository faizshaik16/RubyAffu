package com.ruby.affu.basic;

public class MyFirstProgram {
	
	private int a;
	private int b;
	
	public void setA(int x){
		a =x;
	}
	
	public void setB(int y){
		b = y;
	}
	
	public int cccc(){
		return a + b;
	}
	
	public int multiply2Numbers(){
		return a * b;
	}
	
	
	public static void main(String args[]) throws Exception {
		
		MyFirstProgram objAffu = new MyFirstProgram();
		
		objAffu.setA(10000);
		objAffu.setB(20000);
		
		int result = objAffu.cccc();
		
		System.out.println(" Affu Result = " + result);
		
		
		MyFirstProgram objRuby = new MyFirstProgram();
		
		objRuby.setA(196);
		objRuby.setB(196);
		
		int rubyResult = objRuby.cccc();
		
		System.out.println(" rubyResult = " + rubyResult);
		
	}

}
