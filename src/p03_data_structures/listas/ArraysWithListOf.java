package p03_data_structures.listas;

import java.util.ArrayList;
import java.util.List;

public class ArraysWithListOf {

	public static void main(String[] args) {

		String[] str = {"A", "B", "C"};

		List<String> list = new ArrayList<>(List.of("A", "B", "C"));// Java 9

		list.add("D");

		list.forEach(x -> System.out.println(x));

	}
}
