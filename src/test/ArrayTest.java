package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {

		// Compare two arrays

		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 2, 3 };
		//String[] array1 = new String[] {"mango", "grapes", "plum", "watermelon", "apple"};   
		//String[] array2 = new String[] {"mango", "grapes", "plum", "watermelon", "apple"};
		// Comparing by ==
		
		System.out.println("== results: " + (array1 == array2));

		//Comparing by Arrays.equals()
		
		System.out.println("Arrays.equals :" + Arrays.equals(array1, array2));
		//Comparing using Arrays.deepEquals()
		Object[] obj1 = {array1};
		Object[] obj2 = {array2};
		System.out.println("Arrays.equals :" + Arrays.deepEquals(obj1, obj2));
		
		
		
		
		
		//merge two array
		
		List<Object> list2 = new ArrayList<Object>();
		
		//Collections.addAll(list2, array);
	}

}
