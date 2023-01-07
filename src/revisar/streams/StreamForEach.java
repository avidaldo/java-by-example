package revisar.streams;

import java.util.Arrays;
import java.util.List;

public abstract class StreamForEach {

	public static void main(String[] args) {
		Persona p1 = new Persona("juan", "sanchez", 20);
		Persona p2 = new Persona("ana", "gomez", 12);
		Persona p3 = new Persona("pedro", "gutierrez", 40);
		List<Persona> lista = Arrays.asList(p1, p2, p3);

		lista.stream().forEach((p) -> {
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
			System.out.println(p.getEdad());
		});

	}

}

class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
}

//https://www.arquitecturajava.com/java-stream-foreach-y-colecciones/
