package p02_basic_syntax.tiposYVariables;


public class Basicas {

	int a;


	public static void main(String... args) {
		int i, j;  i = j = 3;
		Integer p = null;
		// if (p) // Type mismatch: cannot convert from Integer to boolean (no como en C)
		// if(i=3) // Esto en C se puede hacer y creo que en PHP también (revisar script)


		Boolean b1 = Boolean.valueOf("True");
		Boolean b2 = Boolean.valueOf("1");
		System.out.println(b1&b2);
	
	}

}
