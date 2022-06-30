package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] array = { 10, 30, 40, 10, 20, 50,30,50};

		List<Integer> list = Arrays.stream(array).distinct().boxed().collect(Collectors.toList());
		Collections.sort(list);
		list.forEach(e -> System.out.println("Element-"+e));
		
		list.add(60);
		list.forEach(e -> System.out.println("Element-"+e));
		Object[] array1 = list.toArray();
		Arrays.stream(array1).forEach(a -> System.out.println("Array Element-"+a));
	}

}
