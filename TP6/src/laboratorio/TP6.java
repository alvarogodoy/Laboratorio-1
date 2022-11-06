package laboratorio;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

public class TP6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //EJERCICIO 1
        /**ArrayList<Integer> lista = new ArrayList<Integer>();
        Integer num;
        System.out.println("Ingrese un numero "); num = sc.nextInt();
        while (num >= 0){
            lista.add(num);
            System.out.println("Ingrese un numero "); num = sc.nextInt();
        }
        System.out.println(lista);
         **/
        //EJERCICIO 2
        /**ArrayList<Double> lista = new ArrayList<Double>();
        for (int i = 0; i < 20; i++){
            System.out.println("Ingrese un numero decimal ");
            Double num = sc.nextDouble();
            lista.add(num);
        }
        Collections.sort(lista);
        Double menor = lista.get(0);
        Double mayor = lista.get(lista.size()-1);
        Double rango = (mayor-menor);
        System.out.println("El mayor numero es: " + mayor);
        System.out.println("El menor numero es: " + menor);
        System.out.println("El rango es: " + rango);
         **/
        //EJERCICIO 3
        /**ArrayList<Integer> lista = new ArrayList<Integer>();
        int suma = 0;
        while (lista.size() < 20){
            int num = (int) (Math.random()*100);
            if (num % 2 == 0){
                lista.add(num);
                suma += num;
            }
        }
        System.out.println(lista);
        double promedio = suma/ lista.size();
        System.out.println("Promedio: "+promedio);
        int contadorMayores = 0;
        int contadorIguales = 0;
        int contadorMenores = 0;
        for (int val : lista){
            if (val == promedio)contadorIguales++;
            else if (val > promedio)contadorMayores++;
            else contadorMenores++;
        }
        System.out.println("Cantidad de numeros iguales al promedio: " + contadorIguales);
        System.out.println("Cantidad de numeros mayores al promedio: " + contadorMayores);
        System.out.println("Cantidad de numeros menores al promedio: " + contadorMenores);
        **/
        //EJERCICIO 4
        /**ArrayList<String> lista = new ArrayList<>();
        System.out.println("Ingrese una palabra ");
        String palabra = sc.next();
        String mayor = "";
        ArrayList<String> duplicado = new ArrayList<>();
        while (!palabra.equals("salir")){
            lista.add(palabra);
            if (!duplicado.contains(palabra)){
                duplicado.add(palabra);
            }
            System.out.println("Ingrese una palabra ");
            palabra = sc.next();
            if (palabra.length() > mayor.length()){
                mayor = palabra;
            }
        }
        System.out.println(lista);
        System.out.println("La palabra con mas caracteres es: " + mayor);
        for (String p : duplicado){
            int contador = contadorRepetidas(lista, p);
            if (contador > 1) System.out.println("La palabra "+p+" esta repetida "+contador+" veces");
        }
         **/
        //EJERCICIO 5
        /**ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            int num = (int) (Math.random()*100);
            lista.add(num);
        }
        System.out.println("Ingrese el valor que desea buscar ");
        int val = sc.nextInt();
        int pos = busquedaSecuencial(lista, val);
        if (pos == -1) System.out.println("Valor no encontrado");
        else System.out.println("Valor encontrado en la posicion "+pos);
        System.out.println(lista);
        **/
        //EJERCICIO 6
        /**ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaOrdDesc;
        ArrayList<Integer> listaOrdAsc;
        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese un numero ");
            int num = sc.nextInt();
            lista.add(num);
        }
        System.out.println("Lista original");
        System.out.println(lista);
        listaOrdAsc = lista;
        listaOrdAsc.sort(Comparator.naturalOrder());
        System.out.println("Lista orden ascendente");
        System.out.println(listaOrdAsc);
        listaOrdDesc = lista;
        listaOrdDesc.sort(Comparator.reverseOrder());
        System.out.println("lista orden descendente");
        System.out.println(listaOrdDesc);
        **/
        //EJERCICIO 7 CLASES CELDA Y MATRIZ(MAIN)
    }
    //Metodo para contar palabras repetidas
    public static int contadorRepetidas(ArrayList<String> lista,String palabra){
        int contador = 0;
        for (String p : lista){
            if (p.equals(palabra)){
                contador++;
            }
        }
        return contador;
    }
    //Metodo para realizar la busqueda secuencial
    public static int busquedaSecuencial(ArrayList<Integer> lista, int val){
        for (int i = 0; i< lista.size(); i++){
            if (lista.get(i).equals(val)){
               return i;
            }
        }
        return -1;
    }
}
