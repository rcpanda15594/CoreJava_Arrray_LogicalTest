package test;

public class MaxElement_from_Array {

	public static void main(String[] args) {

		int[] a = { 20, 10, 40, 30, 60, 100, 70, 50 };
		int max = a[0];
		
		int  pos = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				pos = i;
			}
		}
		System.out.println("Max element is " +max);
	}

}
