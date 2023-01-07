package p01_introductorio.polimorfism.empleado;

import java.util.ArrayList;
import java.util.Arrays;

public class Programador extends Empleado {

	ArrayList<String> lenguajes;
	
	public Programador(ArrayList<String> lenguajes) {
		this.lenguajes = lenguajes;		
	}
	
	public Programador(String... lenguajes) {
		this.lenguajes = new ArrayList<String>(Arrays.asList(lenguajes));
	}
	
	@Override
	public String toString() {
		return lenguajes.toString();
		
	}
	
	public String peri() {
		return "Programador";
	}

}
