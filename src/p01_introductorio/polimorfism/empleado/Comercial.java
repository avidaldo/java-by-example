package p01_introductorio.polimorfism.empleado;

import java.util.ArrayList;

public class Comercial extends Empleado {
	
	ArrayList<String> idiomas = new ArrayList<String>();

	public Comercial(String string) {
		this.idiomas.add(string);
	}
	

	@Override
	public String toString() {
		return idiomas.toString();
		
	}
	

	public String peri() {
		return "Comercial";
	}

}
