package laboratorio;

import java.util.Date;
import java.util.Scanner;
import laboratorio.FuncionesPrograma;

public class TP2 {
   public static void main(String[] args){
       //EJERCICIO 1//
       /**Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese un numero decimal ");
       double valorDecimal = sc.nextDouble();
       int entero = (int)valorDecimal;//Conversion a entero
       short corto = (short)valorDecimal;//Conversion a short
       long largo = (long)valorDecimal;//Conversion a long
       float flotante = (float)valorDecimal;//Conversion a float
       String cadena = String.valueOf(valorDecimal);//Conversion a String
       System.out.println("Valor double "+valorDecimal);
       System.out.println("Valor entero "+entero);
       System.out.println("Valor short "+corto);
       System.out.println("Valor long "+largo);
       System.out.println("Valor float "+flotante);
       System.out.println("Valor string "+cadena);**/
       //EJERCICIO 2
       /** Si intentamos almacenar un valor fuera del rango del tipo de dato nos dara un error
        de ejecucion o compilacion, en el caso del IDE que estoy usando(IntelliJ IDEA) el mensaje es
        "El numero es muy grande", una forma de evitar esto podria ser cambiar el tipo de dato por uno que tenga
        un rango de numeros mas amplios como en el ejemplo a continuacion

       Scanner sc = new Scanner(System.in);
       try {
           System.out.println("Ingrese un valor ");
           int number = sc.nextInt();
           System.out.println("El numero es "+ number);
       } catch (Exception e) {
           System.out.println("El codigo anterior dio error");
           System.out.println("Ingrese un valor ");
           long numero = sc.nextLong();
           System.out.println("El numero es "+ numero);
       }**/
       //EJERCICIO 3
      /**Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese un numero de tres digitos");
      int number = sc.nextInt();
      int primero = (int) Math.floor(number/100);
      int segundo = (number/10)%10;
      int tercero = number%10;
      System.out.println("La suma de los tres digitos del numero ingresado es: " + (primero + segundo + tercero));**/
      //EJERCICIO 4
      /**Scanner sc = new Scanner(System.in);
      System.out.println("Cantidad de dinero: ");
      Float dinero = sc.nextFloat();
      int b200 = (int)Math.floor(dinero/200);
      if (b200>= 1){
         dinero = dinero - (b200*200);
         System.out.println("Cantidad de billetes de 200: " + b200);
      }
      int b100 = (int)Math.floor(dinero/100);
      if (b100>= 1){
         dinero = dinero - (b100*100);
         System.out.println("Cantidad de billetes de 100: " + b100);
      }
      int b50 = (int)Math.floor(dinero/50);
      if (b50>= 1){
         dinero = dinero - (b50*50);
         System.out.println("Cantidad de billetes de 50: " + b50);
      }
      int b20 = (int)Math.floor(dinero/20);
      if (b20>= 1){
         dinero = dinero - (b20*20);
         System.out.println("Cantidad de billetes de 20: " + b20);
      }
      int b10 = (int)Math.floor(dinero/10);
      if (b10>= 1){
         dinero = dinero - (b10*10);
         System.out.println("Cantidad de billetes de 10: " + b10);
      }
      int b5 = (int)Math.floor(dinero/5);
      if (b5>= 1){
         dinero = dinero - (b5*5);
         System.out.println("Cantidad de billetes de 5: " + b5);
      }
      int b2 = (int)Math.floor(dinero/2);
      if (b2>= 1){
         dinero = dinero - (b2*2);
         System.out.println("Cantidad de billetes  de 2: " + b2);
      }
      int b1 = (int)Math.floor(dinero);
      if (b1>= 1){
         dinero = dinero - (b1*1);
         System.out.println("Cantidad de billetes de 1:  " + b1);
      }
      int m50 = (int)Math.floor(dinero/0.5);
      if (m50>= 1){
         dinero = (float)(dinero - (m50*0.5));
         System.out.println("Cantidad de monedas de 50: "+ m50);
      }
      int m25 = (int)Math.floor(dinero*0.25);
      if (m25>= 1){
         dinero =  (float) (dinero - (m25*0.25));
         System.out.println("Cantidad de monedas de 25: "+ m25);
      }
      int m10 = (int)Math.floor(dinero*0.1);
      if (m10>= 1){
         dinero = (float) (dinero - (m10*0.1));
         System.out.println("Cantidad de monedas de 10: "+ m10);
      }
      int m5 = (int)Math.floor(dinero/0.05);
      if (m5>= 1){
         dinero =  (float) (dinero - (m5*0.05));
         System.out.println("Cantidad de monedas de 5: "+ m5);
      }**/
      //EJERCICIO 5
      /**Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese un numero ");
      int numero = sc.nextInt();
      String cadena = String.valueOf(numero);
      System.out.println(cadena);**/
      //EJERCICIO 6
      /**String cadena = "La lluvia en Mendoza es escasa";
      System.out.println("El numero de caracteres es "+ cadena.length());**/
      //EJERCICIO 7 y EJERCICIO 8
      /**Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese un texto ");
      String texto = sc.nextLine();
      int contador = 0;
      for (int i = 0; i < texto.length(); i++){
         if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A'
            || texto.charAt(i) == 'e' || texto.charAt(i) == 'E'
            || texto.charAt(i) == 'i' || texto.charAt(i) == 'I'
            || texto.charAt(i) == 'o' || texto.charAt(i) == 'O'
            || texto.charAt(i) == 'u' || texto.charAt(i) == 'U'){
            contador++;
         }
      }
      System.out.println("Tamaño del texto " + texto.length());
      System.out.println("Cantidad de vocales " + contador);
      String newText = texto.replace("a","e");
      System.out.println(newText);**/
      //EJERCICIO 9
      /**String cadena = "La lluvia en Mendoza es escasa";
      byte[] arreglo = cadena.getBytes();
      for (int i = 0; i < arreglo.length; i++) {
         System.out.print(arreglo[i]+ " ");
      }**/
      //EJERCICIO 10
      /**Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese una frase ");
      String frase = sc.nextLine();
      System.out.println("Convertir la frase a: 1.Mayusculas  2.Minusculas");
      int opcion = sc.nextInt();
      if (opcion == 1) {
         System.out.println(frase.toUpperCase());
      }
      else if (opcion == 2){
         System.out.println(frase.toLowerCase());
      }
      else {
         System.out.println("La opcion ingresada no es valida");
      }**/
      //EJERCICIO 11
      /**Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese la primer palabra"); String pal1 = sc.nextLine();
      System.out.println("Ingrese la segunda palabra"); String pal2 = sc.nextLine();
      if (pal1.equalsIgnoreCase(pal2)){
         System.out.println("Las palabras ingresadas son iguales");
      }
      else {
         System.out.println("Las palabras ingresadas NO son iguales");
      }**/
      //EJERCICIO 12
      /**Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese un texto"); String texto = sc.nextLine().replace(" ", "");
      String letras = texto.substring(3,5);
      System.out.println("La cuarta letra del texto ingresado es: " + letras.charAt(0));
      System.out.println("La quinta letra del texto ingresado es: " + letras.charAt(1));**/
      //EJERCICIO 13
      /**Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese la primer cadena ");String cad1 = sc.nextLine();
      System.out.println("Ingrese la segunda cadena ");String cad2 = sc.nextLine();
      if (cad1.contains(cad2)){
         System.out.println("La segunda cadena se encuentra dentro de la primera");
      }
      else {
         System.out.println("La segunda cadena NO se encuentra dentro de la primera");
      }**/
      //EJERCICIO 14
      /**Los tipos de datos no primitivos u objetos son datos que complejos que poseen metodos mientras que los primitivos son datos
      elementales que no disponen de metodos **/
      //EJERCICIO 15
      /** Ocurre un error al realizar esta declaracion debido a que el dato primitivo int solo admite numeros enteros. Si quiero realizar
      una declaracion de este tipo debo usar el objeto Integer. **/
      //EJERCICIO 16
      /**double val = 23.05;
      Double val2 = val;
      System.out.println(val2);**/
      //EJERCICIO 17
      /**Date fecha = new Date();
      FuncionesPrograma objetoFecha = new FuncionesPrograma();
      String fechaString = objetoFecha.getFechaString(fecha);
      System.out.println(fechaString);**/
      //EJERCICIO 18
      /**Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el dia "); int dia = sc.nextInt();
      System.out.println("Ingrese el mes "); int mes = sc.nextInt();
      System.out.println("Ingrese el año "); int anio = sc.nextInt();
      FuncionesPrograma objetoFecha = new FuncionesPrograma();
      Date fechaDate = objetoFecha.getFechaDate(dia,mes,anio);
      System.out.println(fechaDate);**/
      //EJERCICIO 19 Clases Calculo y OperacionMatematica
      //EJERCICIO 20 Clases Fraccion y OperacionesFraccion
      //EJERCICIO 21
      /**Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese un numero entero mayor a 0 "); int num = sc.nextInt();
      System.out.println(suma(num));**/
      //EJERCICIO 22
      /**Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese un numero "); String num = sc.nextLine();
      System.out.println(sumaDigitos(num));**/
      //EJERCICIO 23
      /**Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese una cadena "); String cadena = sc.nextLine();
      System.out.println(invertirString(cadena));**/
      }
      //FUNCION EJERCICIO 21
      /**public static int suma(int numero){
         int result;
         if (numero == 1){
            result = 1;
         }
         else {
            result = suma(numero -1) + numero;
         }
         return result;
      }**/
      //FUNCION EJERCICIO 22
      /**public static int sumaDigitos(String numero){
         int result;
         int posicion = numero.length()-1;
         String ultDigito = String.valueOf(numero.charAt(posicion));
         if (posicion == 0) {
            result = Integer.valueOf(numero);
         }
         else {
            result = Integer.valueOf(ultDigito)+ sumaDigitos(numero.replace(ultDigito,""));
         }
         return result;
      }**/
      //FUNCION EJERCICIO 23
      /**public static String invertirString(String cadena) {
         String cadenaInvertida;
         int posicion = cadena.length() - 1;
         String ultChar = String.valueOf(cadena.charAt(posicion));
         String primChar = String.valueOf(cadena.charAt(0));
         if (posicion == 0){
            cadenaInvertida = cadena;
         }
         else if (posicion == 1){
            cadenaInvertida = ultChar + primChar;
         }
         else {
            String medio = cadena.substring(1,posicion);
            cadenaInvertida = ultChar + invertirString(medio)+ primChar;
         }
         return cadenaInvertida;
      }**/
}
