package test;

public class SortingArray_OR_BubbulSort {

	public static void main(String[] args) {

		int[] array = {30,50,40,20,10,60};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j]> array[j+1]) {
					int t=array[j];
					array[j] = array[j+1];
					array[j+1]=t;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}
	}

}
