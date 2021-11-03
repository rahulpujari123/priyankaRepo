package javaProgram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * Scanner sc= new Scanner(System.in); // a[5]= Scan.nextlength;
		 * System.out.println("enter number"); int a[]= {1,2,3};
		 * 
		 * //int [] a= {11,112,123,1234,}; //int i=a.length;
		 * 
		 * System.out.println("array length = "+a.length); for (int i = 0; i < a.length;
		 * i++) { a[i]=sc.nextInt(); System.out.print(( a[i]+"\t" )); }
		 * 
		 */
		Scanner sc= new Scanner (System.in);
		int arr[]= null;
		int a[]= {11,12};
		System.out.println("enter length of array");
		int length=sc.nextInt();
		arr=new int [length];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			Arrays.sort(arr);
			//System.out.println(Arrays.deepToString(a));  
		//	System.err.println(Arrays.compare(arr, null));
		//	System.out.println(Arrays.equals(arr, null));
		//	System.out.println(Arrays.toString(arr[i]);
		}
		
		
	}

}
