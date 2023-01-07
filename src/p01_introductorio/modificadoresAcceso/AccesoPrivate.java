package p01_introductorio.modificadoresAcceso;

public class AccesoPrivate { //Representa una fracción
	private int numerador;
	private int denominador;

	
	public boolean esMayor(AccesoPrivate f) {
		return this.numerador *f.denominador > this.denominador * f.numerador;
	}

	/* Java permite que un ojeto acceda a los atributos privados de otro si es de la misma clase
	 *  solo desde las implementaciones de los métodos.
	 */
}
