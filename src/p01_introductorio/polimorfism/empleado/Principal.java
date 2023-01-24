package p01_introductorio.polimorfism.empleado;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	static List<Object> lista = new ArrayList<>();
	
	public static void main(String... argv) {

		lista.add(new Programador("Java","C","PHP"));
		lista.add(new Comercial("inglés"));
		//lista.add(new Empleado());
		
		
/*		for (Empleado e: lista)
			System.out.println(e.peri());*/
		
		
		
		
	}

}
