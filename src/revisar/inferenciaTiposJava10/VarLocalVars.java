package revisar.inferenciaTiposJava10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;

// local-variable type inference (Java 10)
public class VarLocalVars {

	public static void main(String... args) {

		// var foo; foo = "Foo"; // No se puede usar solo para declaración porque no infiere el tipo
		//
		// var id = 0;// At this moment, compiler interprets variable id as integer.
		// id = "34"; // This will result in compilation error because of incompatible types
		//
		// var p = new Doctor(); // In this case, the type of p is Doctor or Person?
		// p=new Engineer(); // Compilation error saying incompatible types
		//
		// public long countNumberofFiles(var fileList);// Compilation error: cannot infer type
		// //of local/variable fileList; cannot use 'var' on variable without initializer
		//
		// var count=null;// Compilation error: cannot infer type for local variable count since
		// // any Java object reference can be null
		//
		// var z = () -> {} // Compilation error: cannot infer type for local variable z;
		// //lambda expression needs an explicit target type

		var companyToEmployees = new HashMap<String, List<String>>();
		for (var entry : companyToEmployees.entrySet()) {
			var employees = entry.getValue();
		}
		
		// // none of this works
		// var ints = {0, 1, 2};
		// var appendSpace = a -> a + " ";
		// var compareString = String::compareTo
		

		// var in for loops
		var numbers = List.of("a", "b", "c");
		for (var nr : numbers)
		    System.out.print(nr + " ");
		for (var i = 0; i < numbers.size(); i++)
		    System.out.print(numbers.get(i) + " ");
		 
		// var in try-with-resources
		try (var file = new FileInputStream(new File("no-such-file"))) {
			new BufferedReader(new InputStreamReader(file))
					.lines()
					.forEach(System.out::println);
		} catch (IOException ex) {
			// at least, we tried
			System.out.println("There's actually no `no-such-file`. :)");
		}

	}
}

class Person {
}

class Doctor extends Person {
}

class Engineer extends Person {
}