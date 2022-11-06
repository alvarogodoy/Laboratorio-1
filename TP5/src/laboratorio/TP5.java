package laboratorio;

import java.util.Arrays;
import java.util.Scanner;

public class TP5 {
    //EJERCICIO 2 Y 3
    //ORDENAMIENTO POR INSERCION
    public static void insercion(int[] lista, String orden){
        for (int i = 1; i < lista.length; i++) {
            int valor = lista[i];
            int j = i-1;
            if (orden.equals("ASC")){
                while(j >= 0 && lista[j] > valor){
                    lista[j+1] = lista[j];
                    j--;
                }
            }
            else if (orden.equals("DESC")){
                while(j >= 0 && lista[j] < valor){
                    lista[j+1] = lista[j];
                    j--;
                }
            }
            lista[j+1] = valor;
        }
    }
    //ALGORITMO DE LA BURBUJA
    public static void burbuja(int[] lista, String orden){
        boolean intercambiado = false;
        int temp;
        while(!intercambiado){
            intercambiado = true;
            for (int i = 0; i < lista.length - 1; i++) {
                if (orden.equals("ASC")){
                    if (lista[i] > lista[i+1]){
                        temp = lista[i];
                        lista[i] = lista[i+1];
                        lista[i+1] = temp;
                        intercambiado = false;
                    }
                }
                else if (orden.equals("DESC")){
                    if (lista[i] < lista[i+1]){
                        temp = lista[i];
                        lista[i] = lista[i+1];
                        lista[i+1] = temp;
                        intercambiado = false;
                    }
                }
            }
        }
    }
    //ORDENAMIENTO POR SELECCION
    public static void seleccion(int[] lista, String orden) {
        for (int i = 0; i < lista.length; i++) {
            int menor = lista[i];
            int menorPos = i;
            for (int j = i+1; j < lista.length; j++) {
                if (orden.equals("ASC")) {
                    if (lista[j] < menor) {
                        menor = lista[j];
                        menorPos = j;
                    }
                }
                else if (orden.equals("DESC")) {
                    if (lista[j] > menor) {
                        menor = lista[j];
                        menorPos = j;
                    }
                }
            }
            int temp = lista[i];
            lista[i] = menor;
            lista[menorPos] = temp;
        }
    }
    public static boolean secuencial(String[] lista, String alumno){
        int n = lista.length;
        boolean seEncontro = false;
        for (int i = 1; i < n-1; i++){
            if (lista[i] == alumno){
                seEncontro = true;
            }
        }
        return seEncontro;
    }
    public static void main(String[] args){
        //EJERCICIO 1
        //ORDENAMIENTO POR INSERCION
        /** Se va tomando cada elemento del arreglo y se va comparando con los elementos ya ordenados
         * para ser colocado en la posicion correcta
         */
        //ALGORITMO DE LA BURBUJA
        /** Se toman los elementos por parejas y se comparan para establecer la posicion correcta de cada uno
         * esto se realiza hasta que todos los elementos queden ordenados
         */
        //ORDENAMIENTO POR SELECCION
        /** Se itera por toda la lista hasta encontrar el menor elemento el cual es colocado en la primer posicion
         * Se vuelve a realizar este procedimiento pero quitando el primer elemento de esta forma al final solo nos queda
         * un elemento el cual es el mayor
         */
        //ALGORITMO QUICK SORT
        /** Se elige un elemento de la lista el cual sera usado como pivote. Se ordenan los demas elementos de tal manera que los mayores
         * queden a un lado del pivote y los menores del otro lado. Se vuelve a realizar el mismo procedimiento de forma recursiva
         * con las dos sublistas resultantes
         */
        //BUSQUEDA SECUENCIAL
        /** Se busca el elemento recorriendo la lista elemento por elemento hasta que se lo encuentra o se llega al final
         * sin haberlo encontrado
         */
        //BUSQUEDA BINARIA
        /** Es util cuando trabajamos con listas ordenadas. Se selecciona el elemento medio de la lista y se sigue buscando
         * en la mitad que puede contener el elemento descartando la otra
         */
        //RECORRIDO DE PROFUNDIDAD
        /** Se recorre un nodo y todos sus nodos hijos antes de pasar al siguiente nodo
         */
        // RECORRIDO DE ANCHURA
        /** Primero se recorren todos los nodos hijos del nodo principal. A continuacion se recorren los hijos de los hijos
         * sucesivamente de modo que se recorre todo un nivel antes de pasar al siguiente
         */
        Scanner sc = new Scanner(System.in);
        //EJERCICIO 4
        /**System.out.println("Ingrese los valores del array ");
        int[] arreglo = new int[8];
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = sc.nextInt();
        }
        System.out.println("CARGA FINALIZADA");
        System.out.println("Forma ascendente (ASC) || Forma descendente (DESC) ");
        String orden = sc.next();
        while (!orden.equals("ASC") && !orden.equals("DESC")){
            System.out.println("Orden incorrecto");
            System.out.println("Forma ascendente (ASC) || Forma descendente (DESC)");
            orden = sc.next();
        }
        System.out.println("Metodo de ordenamiento: (1) Insercion (2) Burbuja (3) Seleccion ");
        int metodo = sc.nextInt();
        while (metodo != 1 && metodo != 2 && metodo != 3) {
            System.out.println("Metodo incorrecto");
            System.out.println("Metodo de ordenamiento: (1) Insercion (2) Burbuja (3) Seleccion ");
            metodo = sc.nextInt();
        }
        System.out.println("ARRAY ORIGINAL");
        System.out.println(Arrays.toString(arreglo));
        System.out.println("ARRAY ORDENADO");
        if (metodo == 1){insercion(arreglo, orden);}
        else if (metodo == 2){burbuja(arreglo, orden);}
        else if (metodo == 3){seleccion(arreglo, orden);}
        System.out.println(Arrays.toString(arreglo));
         **/
        //EJERCICIO 5
        /**System.out.println("Ingrese el numero de filas ");
        int filas = sc.nextInt();
        System.out.println("Ingrese el numero de columnas ");
        int columnas = sc.nextInt();
        int [][] matriz = new int[filas][columnas];
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el elemento [" + i + "] [" + j + "]");
                matriz[i][j] = sc.nextInt();
                suma += matriz[i][j];
            }
        }
        int promedio = suma/(filas*columnas);
        boolean seEncontro = false;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++){
                if (matriz[i][j] == promedio) {
                    System.out.println("Se encontro el promedio en la posicion [" + i + "] [" + j + "]");
                    seEncontro = true;
                }
            }
        }
        if (seEncontro == false) {
            System.out.println("No se encontro el promedio en la matriz");
        }
        System.out.println("Promedio entero = " + promedio);**/
    }
}
