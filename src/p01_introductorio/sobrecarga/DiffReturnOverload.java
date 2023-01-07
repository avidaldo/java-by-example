package p01_introductorio.sobrecarga;

public class DiffReturnOverload {
	

	// La sobrecarga de métodos no puede cambiar el tipo devuelto
	// int doSomething(int y) {
	// return 0;
	// }
	// String doSomething(int x) {
	// return null;
	// }


	static Object sobrecargado(Integer num) {
		return 0;
	}

	static Object sobrecargado(String string) {
		return "cero";
	}

	public static void main(String... args) {

		// sobrecargado(null); // The method sobrecargado(Integer) is ambiguous for the type Basicas

		System.out.println(sobrecargado(0) + " " + sobrecargado(0).getClass());
		System.out.println(sobrecargado("cero") + " " + sobrecargado("cero").getClass());

	}

}
