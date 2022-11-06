package laboratorio;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TP3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // EJERCICIO 2
        /**int [] arreglo = new int[5];
         for (int i = 0; i<5; i++){
         System.out.println("Ingrese un numero");
         arreglo[i] = sc.nextInt();
         System.out.println(arreglo[i]);
         }**/
        //EJERCICIO 3
        /**System.out.println("Ingrese el tamaño del arreglo");
         int tamanio = sc.nextInt();
         int [] arreglo = new int[tamanio];
         System.out.println("Ingrese el numero a multiplicar");
         int num = sc.nextInt();
         rellenarArray(tamanio, num, arreglo);
         mostrarArray(arreglo, tamanio);**/
        //EJERCICIO 4
        /**float [] arreglo = new float[20];
         for (int i=0; i<20; i++){
         System.out.println("Ingrese un numero");
         arreglo[i] = sc.nextFloat();
         }
         Arrays.sort(arreglo);
         float mayor = arreglo[19];
         float menor =  arreglo[0];
         System.out.println("El mayor numero es " + mayor);
         System.out.println("El menor numero es " + menor);
         System.out.println("El rango es " +(mayor-menor));**/
        //EJERCICIO 5
        /**int [] arreglo = new int[20];
         for (int i = 0; i<20;i++){
         arreglo[i] = (int) (Math.random()*50)*2;
         }
         int total = 0;
         int i = 0;
         while  (i<20){
         total = total + arreglo[i];
         i++;
         }
         float promedio = total/20;
         int contadorIguales = 0;
         int contadorMayores = 0;
         int contadorMenores = 0;
         for (int e = 0; e<20 ; e++){
         if (arreglo[e] == promedio){
         contadorIguales+=1;
         }
         else if (arreglo[e] > promedio){
         contadorMayores+=1;
         }
         else {
         contadorMenores+=1;
         }
         }
         System.out.println("Promedio aritmetico: " + promedio);
         System.out.println("Cantidad de numeros iguales al promedio: " + contadorIguales);
         System.out.println("Cantidad de numeros mayores al promedio: " + contadorMayores);
         System.out.println("Cantidad de numeros menores al promedio: " + contadorMenores);**/
        //EJERCICIO 6
        /**int [] arreglo = new int[50];
        for (int i = 0; i<50;i++){
            arreglo[i] = (int) (Math.random()*1000);
        }
        System.out.println("Ingrese el valor a buscar ");
        int num = sc.nextInt();
        int i = 0;
        while ( i  < 50){
            if (num == arreglo[i]){
                System.out.println("Valor encontrado en posicion " + i);
                break;
            } else if (i == 49 && num != arreglo[i]){
                System.out.println("Numero no encontrado");
            }
            i++;**/
        //EJERCICIO 7
        /**Integer [] arreglo1 = new Integer[10];
        for (int i = 0; i<10; i++){
            System.out.println("Ingrese un valor");
            arreglo1[i] = sc.nextInt();
        }
        System.out.println("Arreglo lleno");
        Integer [] arreglo2 = arreglo1;
        Arrays.sort(arreglo2);
        System.out.println("Arreglo en modo ascendente");
        for (int i = 0; i<10; i++){
            System.out.println(arreglo2[i]);
        }
        Integer [] arreglo3 = arreglo1;
        Arrays.sort(arreglo3, Collections.reverseOrder());
        System.out.println("Arreglo en modo descendente");
        for (int i = 0; i<10; i++){
            System.out.println(arreglo3[i]);
        }**/
        //EJERCICIO 8
        /**System.out.println("Ingrese una serie de numeros separados por un guion medio (-)");
        String cadena = sc.nextLine();
        String [] arreglo = cadena.split("-");
        float suma = 0;
        float promedio;
        for (int i = 0; i < arreglo.length; i++){
            suma = suma + Integer.parseInt(arreglo[i]);
        }
        promedio = suma/ arreglo.length;
        System.out.println("La suma de todos los elementos es " + suma);
        System.out.println("El valor promedio calculado es " + promedio);**/
        //EJERCICIO 9
        /**System.out.println("Ingrese su numero de DNI sin puntos ");
        int dni = sc.nextInt();
        System.out.println("Su DNI completo es: " + dni+obtenerLetra(dni));**/
        //EJERCICIO 10
        /**int [] arreglo1 = new int[5];
        int [] arreglo2 = new int[10];
        int [] arreglo3 = new int[5];
        System.out.println("Ingrese cinco valores enteros para llenar el primer arreglo ");
        for (int i = 0; i < 5; i++) {
            arreglo1[i] = sc.nextInt();
        }
        System.out.println("Arreglo 1 lleno");
        System.out.println("Ingrese diez valores enteros para llenar el segundo arreglo ");
        for (int i = 0; i < 10; i++) {
            arreglo2[i] = sc.nextInt();
        }
        System.out.println("Arreglo 2 lleno");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                arreglo3[i] = arreglo3[i] + arreglo1[i]* arreglo2[j];
            }
        }
        System.out.println("Arreglo 3");
        for (int i = 0; i < 5; i++) {
            System.out.println(arreglo3[i]);
        }**/
    }
    //FUNCIONES EJERCICIO 3
    /**public static int[] rellenarArray(int tamanio,int num, int[] arreglo){
     for (int i = 0; i< tamanio; i++){
     arreglo[i] = num*(i+1);
     }
     return arreglo;
     };**/
    /**public static void mostrarArray(int [] arreglo,int tamanio ){
     for (int i = 0; i< tamanio; i++){
     System.out.print(arreglo[i] + " ");
     }
     }**/
    //FUNCION EJERCICIO 9
    /**public static String obtenerLetra(int numeroDNI){
        String [] arregloLetras =
                {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int posicion = numeroDNI%23;
        return arregloLetras[posicion];
    }**/
}
