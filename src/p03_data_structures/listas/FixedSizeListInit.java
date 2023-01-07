//https://javarevisited.blogspot.com/2012/12/how-to-initialize-list-with-array-in-java.html

package p03_data_structures.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/**
 * Arrays.asList() method is used to initialize a List from Array but List returned by this method is a
 * fixed size List and you can not change its size. Which means adding and deleting elements from the
 * List is not allowed.
 */
public class FixedSizeListInit {

	public static void main(String args[]) {

		// declaring and initializing array in one line
		String[] oldValues = new String[]{"list", "set", "map"};
		String[] values = {"abc", "bcd", "def"};

		// initializing list with array in java
		List init = Arrays.asList(values);
		System.out.println("size: " + init.size() + " list: " + init);

		// initializing List in one line in Java
		List oneLiner = Arrays.asList("one", "two", "three");
		System.out.println("size: " + init.size() + " list: " + oneLiner);

		// List returned by Arrays.asList is fixed size and doesn't support add or remove

		// This will throw java.lang.UnsupportedOperationException
		//oneLiner.add("four");

		// This also throws java.lang.UnsupportedOperationException
		// oneLiner.remove("one");
		
		
		// Para convertir la lista fija en un ArrayList o LinkedList:

		List<String> pairs = Arrays.asList(new String[]{"USD/AUD", "USD/JPY", "USD/EURO"});
		
	
		ArrayList<String> arrayList = new ArrayList<>(pairs);
		LinkedList<String> linkedList = new LinkedList<>(pairs);
		System.out.println("fixed list: " + pairs);
		
		arrayList.add("a");
		linkedList.add("a");
		System.out.println("ArrayList: " + arrayList);
		System.out.println("LinkedList: " + linkedList);
		
		
	}
}
