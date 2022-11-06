package Laboratorio;

import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Parte5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // EJERICIO STRING
        /**System.out.println("Ingrese la primera cadena "); String cad1 = sc.nextLine();
        System.out.println("Ingrese la segunda cadena "); String cad2 = sc.nextLine();
        if (cad2.length() > cad1.length()){
            System.out.println("La segunda cadena ingresada es mas larga que la primera");
        }
        else {
            if (cad1.contains(cad2)){
                System.out.println("ENCONTRADO");
            }
            else {
                System.out.println("NO ENCONTRADO");
            }
        }**/
        //EJERCICIO REPETITIVA
        /**System.out.println("Que cantidad de numeros desea ingresar? "); int n = sc.nextInt();
        if (n < 0){
            System.out.println("Cantidad no valida");
        }
        else {
           double sumaVal = 0;
           double promedio;
           for (int i = 0; i < n; i++) {
               System.out.println("Ingrese un numero ");
               double val = sc.nextDouble();
               sumaVal+=val;
           }
           promedio = sumaVal/n;
            System.out.println("El promedio de los numeros ingresados es: " + promedio);
        }**/
        //EJERCICIO RECURSIVA
        /**System.out.println("Ingrese una cadena "); String cadena = sc.nextLine();
        devolverCaracteres(cadena);**/
        //EJERCICIOS ARREGLOS
        //EJERCICIO A
        /**int [] arreglo = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese un valor mayor a 0 y que no haya sido ingresado anteriormente ");
            int val = sc.nextInt();
            while (esValido(arreglo, val) == false){
                System.out.println("El valor ingresado no es valido");
                System.out.println("Ingrese un valor mayor a 0 y que no haya sido ingresado anteriormente ");
                val = sc.nextInt();
            }
            arreglo[i] = val;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+ " ");
        }**/
        //EJERCICIO B
        /**Integer [] arreglo = {1,5,9,3,45,23,45,12,87,9,6,5};
        System.out.println("Ingresa el numero que quieres borrar");
        Integer num = sc.nextInt();
        System.out.print("Array inicial: ");
        for (int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == num) {
                arreglo = quitarElemento(arreglo,i);
            }
        }
        System.out.println("");
        System.out.print("Array final: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+ " ");
        }**/
        //EJERCICIO C
        /**int [] menus = {2500,3200,4500};
        System.out.println("Ingrese el numero de comensales (minimo 1-maximo 6): ");
        int comensales = sc.nextInt();
        while (comensales < 1 || comensales > 6){
            System.out.println("La cantidad ingresada no es valida (minimo 1-maximo 6))");
            System.out.println("Ingrese el numero de comensales (minimo 1-maximo 6): ");
            comensales = sc.nextInt();
        }
        int [] arr = new int[comensales];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese el menu pedido por el comensal " + (i+1));
            int menuCom = sc.nextInt();
            while (menuCom != 1 && menuCom != 2 && menuCom != 3) {
                System.out.println("El menu ingresado no esta en la carta");
                System.out.println("Ingrese el menu pedido por el comensal " + (i+1));
                menuCom = sc.nextInt();
            }
            if (menuCom == 1) {arr[i] = menus[0];}
            else if (menuCom == 2) {arr[i] = menus[1];}
            else if (menuCom == 3) {arr[i] = menus[2];}{
            }
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int indice = -1;
            for (int j = 0; j < menus.length; j++) {
                if (arr[i] == menus[j]) {indice = j; break;}
            }
            System.out.println("Comensal " + (i+1) + " va a tomar el menu " + (indice+1) + " con precio $"+ arr[i]);
            total += arr[i];
        }
        System.out.println("El costo total a pagar por la mesa es de $" + total);**/
    }
    //FUNCION EJERCICIO RECURSION
    /**public static void devolverCaracteres(String cadena){
        if (cadena.length() > 1){
            for (int i = 0; i < cadena.length(); i++){
                devolverCaracteres(String.valueOf(cadena.charAt(i)));
            }
        }
        else {
            System.out.println(cadena);
        }
    }**/
    //FUNCION EJERCICIO A ARREGLOS
    /**public static boolean esValido(int [] arreglo, int val){ //Chequea si el valor ingresado es valido
        for (int i = 0; i < arreglo.length; i++) {
            if (val == arreglo[i] || val <= 0) return false;
        }
        return true;
    }**/
    //FUNCION EJERCICIO B ARREGLOS
    /**public static Integer[] quitarElemento( Integer[] arr, int index ){
        ArrayList <Integer> lista = new ArrayList<Integer>(Arrays.asList(arr));
        lista.remove(index);
        return lista.toArray(new Integer[0]);
    }**/
}
