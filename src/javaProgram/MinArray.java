package javaProgram;

public class MinArray {

	public static void main(String[] args) {
		int[] arr = {  12, 13, 144,1,10,20 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]){
			
				
			min = arr[i];
		}
		
	}
		System.out.println("small no " + min);

}
}
