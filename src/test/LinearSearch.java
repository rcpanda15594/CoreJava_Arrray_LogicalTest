package test;

public class LinearSearch {

	public static void main(String[] args) {

		int[] array = { 10, 30, 40, 100, 20, 50 };

		int searchingElement = 40;
		int position = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == searchingElement) {
				position = i;
				break;
			}
		}
		if (position == -1) {
			System.out.println("Elelment not found");
		} else {
			System.out.println("Element found at " + (position + 1));
		}
	}

}
