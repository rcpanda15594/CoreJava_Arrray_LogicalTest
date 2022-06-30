package test;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50 };
		//int[] array = { 40, 20, 30, 10, 50 };

		//--------------Collection Arrays Process---------------------------
		
		/*System.out.println("=============Before Sorting Array Element=============");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("=============After Sorting Array Element=============");
		Arrays.sort(array);
		for(int i :array){
			System.out.println(i);
		}
		
		int binarySearchArrays = Arrays.binarySearch(array, 40);
		
		System.out.println("Getting Index is :"+binarySearchArrays);
		System.out.println("Getting Value is :" +array[binarySearchArrays]);*/

		
		//----------------------Normal Process-----------------------
		
		
		int start = 0, end = array.length - 1, mid, pos = -1;
		int n = 40;

		mid = (start + end) / 2;
		// System.out.println(mid);

		if (n == array[mid]) {
			pos = mid;
		} else if (n < array[mid]) {
			end = mid - 1;
			pos = end;
		} else {
			start = mid + 1;
			pos = start;
		}
		if (pos == -1) {
			System.out.println("element not found");
		} else {
			System.out.println("Element index is =" + pos);
		}
	}

}
