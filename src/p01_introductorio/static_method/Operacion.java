package p01_introductorio.static_method;

public class Operacion {
    int operando1;
    int operando2;
    int resultado;

    public Operacion(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    void sumaAtributosEnResultado(){
        resultado = operando1+operando2;
    }

    int devuelveSuma(){
        return operando1+operando2;
    }

    static int calculaSuma( int parametro1, int parametro2){
        return parametro1+parametro2;
    }






    public static void main() {
        int resultado = calculaSuma(1,2);

        Operacion suma =  new Operacion(1,2);
        int resultado2 = suma.devuelveSuma();

        suma.sumaAtributosEnResultado();

    }

}
