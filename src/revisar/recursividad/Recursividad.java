package revisar.recursividad;

public class Recursividad {

	public static void main(String[] args) throws Exception {

		for (int num = 5; num <= 10; num++) {
			int f = factorial(num);
			System.out.println("factorial del número " + num + ": " + factorial(num));
			if (factorialNoRecursivo(num) != f) throw new Exception("No fuca bien") {
			}; // Excepción anonima

		}

		for (int num = 0; num <= 10; num++) {
			for (int exp = 0; exp <= 4; exp++) {
				System.out.println(num + "^" + exp + "=" + potencia(num, exp));
				if (potencia(num, exp) != Math.pow(num, exp)) throw new Exception("No fuca bien");
			}
		}

	}

	private static int factorial(int num) {
		return (num==1) ? 1 : num + factorial(num - 1);
	}

	private static int potencia(int base, int exp) {
		return (exp==0) ? 1 : base*potencia(base,exp-1);
		
	}

	private static int factorialNoRecursivo(int num) {
		int fact = 0;
		for (; num > 0; num--) {
			fact += num;
		}
		return fact;
	}

	private static int potenciaNoRecursivo(int base, int exp) {
		// El operador '^' es para XOR binario
		
		//return (int) (Math.pow(base, exp));
		
		if (exp==0) return 1;
		
		int pot = base;
		for (int num=2; num <=exp; num++) {
			pot*=base;
		}
		return pot;
	}

}
