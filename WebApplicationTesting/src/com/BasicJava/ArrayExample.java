package com.BasicJava;

public class ArrayExample {

	public static void main(String[] args) 
	{
		/*int a=10;
		a=20;
		
		System.out.println(a);*/
		
		int a[] = new int[3];
		// index of an array always starts with 0
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		//a[3]=40;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		

	}

}
