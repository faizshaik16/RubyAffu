package com.ruby.affu.table;

public class TableTable {
	
	private int a;
	
	public void setA(int x){
		a = x;
	}
	
	public void table(){
		
		int i =1;
		while(i < 12 ){
			
			int result= a * i;
			
			System.out.println( a  +" * " + i +" = " + result );
			i = i +1;
		}
	}
	
	public static void main(String args[]) throws Exception {
		
		System.out.println( "Start Time in milli seconds = " + System.currentTimeMillis());
		TableTable objTable = new TableTable();
		objTable.setA(2);
		objTable.table();
		
		System.out.println( "End Time in milli seconds = " + System.currentTimeMillis());
	}

}
