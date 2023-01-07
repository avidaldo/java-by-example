package p01_introductorio.flujoBasico;

public class Switch {
	public static void main(String... args) {
		
		for (int i=0; i<7; i++) {
			System.out.println("Caso "+i);
			switch (i) {
				case 1: System.out.println(1);
				case 2: System.out.println("2"); break;
				case 3: System.out.println(3);
				case 4: System.out.println(4);
				case 5: System.out.println("5"); break;
				default: System.out.println("default");	
			}	
		}
		
		
		// Pendientes los switch de Java 12
	}
}
