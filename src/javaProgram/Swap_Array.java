package javaProgram;

public class Swap_Array {

	public static void main(String[] args) {
		int arr[] = { 8, 5, 29, 6 };
		int temp = 0;
		System.out.println("element of orginal array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		System.out.print("  acsending order");
		for (int i = 0; i < arr.length; i++) {
			System.out.print( " "+arr[i] + " ");
		}
	}

}
