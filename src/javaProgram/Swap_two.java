package javaProgram;

import java.util.Scanner;

public class Swap_two {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first no");
	double x= sc.nextDouble();
	System.out.println("enter secod no");
	double y= sc.nextDouble();
	System.out.println("befor swaping x ="+ x +"before swapping=y "+y);
	x=x+y;
	y=x-y;
	x=x-y;
	
	System.out.println("after swapx= "+ x+"after swap y="+ y);
	
	
	}

}
