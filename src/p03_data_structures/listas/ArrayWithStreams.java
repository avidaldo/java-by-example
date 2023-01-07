package p03_data_structures.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayWithStreams {

	public static void main(String[] args) {

		String[] str = {"A", "B", "C"};

		ArrayList<String> list1 = Stream.of(str).collect(Collectors.toCollection(ArrayList::new));
		list1.add("D");
		list1.forEach(x -> System.out.println(x));

		List<String> list2 = Stream.of(str).collect(Collectors.toList());
		list2.add("D");
		list2.forEach(x -> System.out.println(x));

	}
}
