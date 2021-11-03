package javaProgram;

import java.util.Scanner;

public class Swap_no {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nuber");
		int s= sc.nextInt();
		System.out.println("enter no");
		int a=sc.nextInt();
		
		//int x=11;
	//	int y=12;
		
		System.out.println("before swap");
		System.out.println("s ="+s);
		System.out.println("a ="+ a);
		int temp=s;
		s=a;
		a=temp;
		System.out.println("after swap");
		System.out.println("s =" + s);
		System.out.println("a ="+ a);
	}

}
