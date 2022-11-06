package laboratorio;

import laboratorio.OperacionMatematica;

public class Calculo {
    public static void main(String[] args) {
        OperacionMatematica mat = new OperacionMatematica();
        mat.setValor1(15);
        mat.setValor2(247);
        mat.aplicarOperacion("+");
        mat.aplicarOperacion("-");
        mat.aplicarOperacion("*");
        mat.aplicarOperacion("/");
    }
}
