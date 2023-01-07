package revisar.nestedClass;

public class NestedClass {

	public static void main(String[] args) {

		String a = "string1";
		Objeto o = new Objeto();
		o.i = 5;

		modifica(a);

		System.out.println(a);

	}

	private static void modifica(String a) {
		a = "string2";

	}

	private static class Objeto {
		int i;
	}

}
