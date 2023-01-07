package p01_introductorio.sobreescritura;

import java.util.ArrayList;
import java.util.List;

public class Overriding { // Overriding

	public static void main(String[] args) {
		List<Perro> mascotas = new ArrayList<Perro>();

		Perro troski = new Sabueso();
		troski.ladrar();
	}

}

interface Exterminio {
	void infectarEvola();

}

class Perro {

	public void ladrar() {
		System.out.println("guau");
	}

	/* Sobrecarga (Overload): mismo nombre de método con distinto número de
	argumentos. Se resuelve en tiempo de compilación. Static Binding. */
	public void ladrar(int veces) {
		ladrar();
	}

}

class Sabueso extends Perro { // Herencia: la clase Sabueso hereda de su clase padre Perro

	public void olfatear() {
		System.out.println("sniff ");
	}

	/* Sobreescritura: el método ladrar del padre pasa a tener una nueva definición. Dynamic binding */
	@Override
	public void ladrar() {
		System.out.println("wuf");
	}

}
