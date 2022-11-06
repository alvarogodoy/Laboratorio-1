package laboratorio;

import java.util.Scanner;
import laboratorio.Fraccion;

public class OperacionesFraccion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Fraccion 1");
        System.out.println("Ingrese el numerador"); int num1 = sc.nextInt();
        System.out.println("Ingrese el denominador"); int den1 = sc.nextInt();
        Fraccion frac1 = new Fraccion(num1, den1);
        System.out.println("Fraccion 2");
        System.out.println("Ingrese el numerador"); int num2 = sc.nextInt();
        System.out.println("Ingrese el denominador"); int den2 = sc.nextInt();
        Fraccion frac2 = new Fraccion(num2, den2);
        Fraccion result1 = frac1.sumarFracciones(frac1,frac2);
        System.out.println(result1.numerador + "/" + result1.denominador);
        Fraccion result2 = frac1.restarFracciones(frac1,frac2);
        System.out.println(result2.numerador + "/" + result2.denominador);
        Fraccion result3 = frac1.multiplicarFracciones(frac1,frac2);
        System.out.println(result3.numerador + "/" + result3.denominador);
        Fraccion result4 = frac1.dividirFracciones(frac1,frac2);
        System.out.println(result4.numerador + "/" + result4.denominador);
    }
}
