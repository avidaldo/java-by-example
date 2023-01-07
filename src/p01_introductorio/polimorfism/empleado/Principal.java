package p01_introductorio.polimorfism.empleado;

import java.util.ArrayList;

public class Principal {
	
	static ArrayList<Empleado> lista = new ArrayList<Empleado>();
	
	public static void main(String... argv) {

		lista.add(new Programador("Java","C","PHP"));
		lista.add(new Comercial("inglés"));
		lista.add(new Empleado());
		
		
		for (Empleado e: lista)
		System.out.println(e.peri());
		
		
		
		
	}

}
