package p02_basic_syntax.paso_valor.paso_objetos;

class PasoObjetos {

    public static void main(String[] args) {

        System.out.println("\n--- Pasando un int");
        int entero = 1;
        modificaVarInt(entero);  // pasamos el valor del entero
        System.out.println("Valor del int fuera del método:    " + entero);

        System.out.println("\n--- Pasando un String");
        String string = "string1";
        modificaVarString(string); // pasamos el valor del String
        System.out.println("Valor del string fuera del método:  " + string);

        System.out.println("\n--- Pasando un objeto y reasignando el parámetro");
        Clase objeto = new Clase(1, "string1");
        modificaVarObjeto(objeto); // pasamos la referencia al objeto
        System.out.println("Valor del objeto fuera del método: " + objeto);

        System.out.println("\n--- Pasando un objeto y modificando su contenido");
        Clase objeto2 = new Clase(1, "string1");
        modificaContenidoObjeto(objeto2); // pasamos la referencia al objeto
        System.out.println("Valor del objeto fuera del método: " + objeto2);

    }


    private static void modificaVarInt(int a) {
        a++; // Incrementamos en 1
        System.out.println("Valor del int dentro del método:   " + a);
    }

    private static void modificaVarString(String a) {
        a += " modificado";
        System.out.println("Valor del string dentro del método: " + a);
    }

    private static void modificaVarObjeto(Clase o) {
        o = new Clase(o.entero + 1, "nuevo string"); // creamos un nueva instancia
        System.out.println("Valor del objeto dentro de método: " + o);
    }

    private static void modificaContenidoObjeto(Clase o) {
        o.entero = -99; // modificamos el contenido de la referencia
        o.string = "string modificado";
        System.out.println("Valor del objeto dentro de método: " + o);
    }

}