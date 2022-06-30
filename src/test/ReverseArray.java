package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {

	public static void main(String[] args) {

		int[] array = { 10, 30, 40, 100, 20, 50 };
		String[] string = { "A", "D", "C" , "B"};

		List l = Arrays.asList(string);
		System.out.println(l);
		
		Collections.reverse(l);
		System.out.println(l);
		Arrays.sort(string);
		System.out.println(l);
		
		
		Arrays.stream(array).forEach(a -> System.out.println("Array Element-"+a));
		
		List<Integer> list1 = Arrays.stream(array).boxed().collect(Collectors.toList());

		Collections.reverse(list1);
		list1.forEach(e -> System.out.println("Reverse Element-"+e));
		
		Arrays.sort(array);
		Arrays.stream(array).forEach(a -> System.out.println("Sorting Array Element-"+a));
		
		Integer[] in =(Integer[])list1.toArray();
		
		
		/*
		for (Integer i : list1) {
			System.out.println(i);
		}
		*/
	}

}
