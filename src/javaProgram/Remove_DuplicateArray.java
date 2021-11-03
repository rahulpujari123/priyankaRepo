package javaProgram;

public class Remove_DuplicateArray {

	public static void main(String[] args) {
		int a[] = { 11, 12, 13, 11, 12,15,11,12,16,13 };
		int length = a.length;
		//int temp[] = new int[a.length];
		int j = 0;
		for (int i = 0; i < length - 1; i++) {

			if (a[i] != a[i + 1]) {
				a[j ++] = a[i];
			}
		}
		a[j++] = a[length - 1];
		for (int k = 0; k < j; k++) {
			System.out.print(" "+ a[k]);
		}

	}

}
