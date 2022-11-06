package laboratorio;

public class Fraccion {
    int numerador;
    int denominador;
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
        int resultNum = (f1.numerador* f2.denominador)+(f1.denominador*f2.numerador);
        int resultDen = f1.denominador* f2.denominador;
        return new Fraccion(resultNum, resultDen);
    }
    public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
        int resultNum = (f1.numerador* f2.denominador)-(f1.denominador*f2.numerador);
        int resultDen = f1.denominador* f2.denominador;
        return new Fraccion(resultNum, resultDen);
    }
    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
        int resultNum = (f1.numerador*f2.numerador);
        int resultDen = f1.denominador* f2.denominador;
        return new Fraccion(resultNum, resultDen);
    }
    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
        int resultNum = (f1.numerador*f2.denominador);
        int resultDen = f1.denominador* f2.numerador;
        return new Fraccion(resultNum, resultDen);
    }
}
