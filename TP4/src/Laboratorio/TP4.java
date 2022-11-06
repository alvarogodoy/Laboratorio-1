package Laboratorio;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class TP4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //EJERCICIO 1
        /**String [][] pais = new String[4][4];
         System.out.println("Ingrese cuatro paises");
         pais [0][0] = sc.nextLine();
         pais [0][1] = sc.nextLine();
         pais [0][2] = sc.nextLine();
         pais [0][3] = sc.nextLine();
         for (int i=0 ;i<4; i++){
         System.out.println("Ingrese tres ciudades de " + pais[0][i]);
         for (int j=1;j<4;j++){
         pais[j][i] = sc.nextLine();
         }
         }
         for (int i=0 ;i<4; i++){
         System.out.print("Pais: " + pais[0][i]);
         System.out.print(" Ciudades: ");
         for (int j=1;j<4;j++){
         System.out.print(pais[j][i]+ " ");
         }
         System.out.println("");
         }**/
        //EJERCICIO 2
        /**System.out.println("Ingrese dos valores");
         int x = sc.nextInt();
         int y = sc.nextInt();
         int [][] matriz1 = new int [x][y];
         int [][] matriz2 = new int [y][x];
         int [][] matriz3 = new int [x][y];
         llenarMatriz(matriz1);
         llenarMatriz(matriz2);
         for (int i = 0; i<matriz3.length;i++){
         for (int j = 0; j<matriz3[0].length;j++){
         matriz3[i][j] = matriz1[i][j]*matriz2[j][i];
         }
         }
         System.out.println("Arreglo 3");
         for (int i = 0; i<matriz3.length;i++){
         System.out.println("");
         for (int j = 0; j<matriz3[0].length;j++){
         System.out.print(matriz3[i][j] + " | ");;
         }
         }**/
        //EJERCICIO 3
        /**System.out.println("Ingrese el tamaño ");
        int x = sc.nextInt();
        if (x >=3 && x<=10){
            int [][] matriz1 = new int [x][x];
            llenarMatriz(matriz1);
            mostrarMatriz(matriz1);
            int [] array1 = new int [x];
            for (int i = 0;i<matriz1.length;i++){
                for (int j = 0; j<matriz1[0].length;j++){
                    array1[i] = array1[i] + matriz1[j][i];
                }
            }
            System.out.println("");
            System.out.println("Arreglo de suma de columnas");
            for (int i = 0;i<array1.length;i++){
                System.out.print(array1[i]+ " ");
            }
            int result = 0;
            for (int i = 0; i<array1.length;i++){
                result = result + array1[i];
            }
            System.out.println("");
            System.out.println("El resultado es: " + result);
        }
        else {System.out.println("El valor ingresado no es valido");}**/
        //EJERCICIO 4
        /**System.out.println("Ingrese el tamaño de la matriz (minimo 4-maximo 10): ");
        int tamanio = sc.nextInt();
        while (tamanio > 10 || tamanio < 4){
            System.out.println("El tamaño ingresado no es valido");
            System.out.println("Ingrese el tamaño de la matriz (minimo 4-maximo 10): ");tamanio = sc.nextInt();
        }
        int [][] arr = new int[tamanio][tamanio];
        System.out.println("Para acceder al menu primero debe llenar la matriz");
        llenarMatriz(arr);
        System.out.println("MATRIZ LLENA");
        System.out.println(" Menu ");
        System.out.print("(1). Sumar una fila ");
        System.out.print("(2). Sumar una columna ");
        System.out.print("(3). Sumar diagonal principal ");
        System.out.print("(4). Sumar diagonal inversa ");
        System.out.println("(5). Valor medio de la matriz ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(sumarFila(arr));
                break;
            case 2:
                System.out.println(sumarColumna(arr));
                break;
            case 3:
                System.out.println("La suma de la diagonal principal es: ");
                System.out.println(diagonalPrincipal(arr));
                break;
            case 4:
                System.out.println("La suma de la diagonal inversa es: ");
                System.out.println(diagonalInversa(arr));
                break;
            case 5:
                System.out.println("El valor medio de la matriz es: ");
                System.out.println(mediaMatriz(arr));
                break;
            default:
                System.out.println("La opcion ingresada no es valida");
        }**/
        //EJERCICIO 5
        /**String [][] maquina = {
                {"KitKat","32","3"},
                {"Chicles","2","50"},
                {"Caramelos de Menta","2","50"},
                {"Huevos Kinder","25","10"},
                {"Cheetoos","30","10"},
                {"Twix","26","10"},
                {"M&M'S","35","10"},
                {"Papas Lays","40","20"},
                {"Milkybar","30","10"},
                {"Alfajor Tofi","20","15"},
                {"Lata Coca","50","20"},
                {"Chitos","45","10"}
        };
        System.out.println(" MENU ");
        System.out.println("(1).Pedir golosina \n(2).Mostrar golosinas \n(3).Rellenar golosinas \n(4).Apagar maquina");
        int opcion = sc.nextInt();
        while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {
            System.out.println("La opcion ingresada no es valida");
            System.out.println(" MENU ");
            System.out.println("(1).Pedir golosina \n(2).Mostrar golosinas \n(3).Rellenar golosinas \n(4).Apagar maquina");opcion = sc.nextInt();
        }
        int venta = 0;
        int ventaTotal = 0;
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    mostrarGolosinas(maquina);
                    venta = pedirGolosina(maquina);
                    ventaTotal += venta;
                    break;
                case 2:
                    mostrarGolosinas(maquina);
                    break;
                case 3:
                    rellenarGolosinas(maquina);
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
            }
            System.out.println(" MENU ");
            System.out.println("(1).Pedir golosina \n(2).Mostrar golosinas \n(3).Rellenar golosinas \n(4).Apagar maquina");opcion = sc.nextInt();
        }
        System.out.println("Total de ventas: $"+ ventaTotal);
        System.out.println("Maquina Apgada");**/
    }

    //METODO PARA LLENAR ARREGLO
    public static void llenarMatriz(int [][] matriz){
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<matriz.length;i++){
            for (int j = 0; j<matriz[0].length;j++){
                System.out.println("Elemento: " + "[ "+i+" ]" + "[ "+j+" ]");
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    //METODO PARA MOSTRAR ARREGLO
    public static void mostrarMatriz(int [][] matriz){
        for (int i = 0; i<matriz.length;i++){
            System.out.println("");
            for (int j = 0; j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+ " ");
            }
        }
    }
    //METODOS MENU EJERCICIO 4
    public static int sumarFila(int [][] matriz){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que fila desea sumar? "); int fila = sc.nextInt();
        while(fila > matriz.length || fila < 1){
            System.out.println("La fila ingresada no es valida ");
            System.out.println("Que fila desea sumar? "); fila = sc.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < matriz[0].length; i++){
            suma += matriz[fila-1][i];
        }
        System.out.println("La suma de la fila es: ");
        return suma;
    }
    public static int sumarColumna(int [][] matriz){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que columna desea sumar? "); int columna = sc.nextInt();
        while(columna > matriz[0].length || columna < 1){
            System.out.println("La columna ingresada no es valida ");
            System.out.println("Que columna desea sumar? "); columna = sc.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < matriz.length; i++){
            suma += matriz[i][columna-1];
        }
        System.out.println("La suma de la columna es: ");
        return suma;
    }
    public static int diagonalPrincipal(int [][] matriz){
        int suma = 0;
        for (int i = 0; i < matriz.length; i++){
            suma += matriz[i][i];
        }
        return suma;
    }
    public static int diagonalInversa(int [][] matriz){
        int suma = 0;
        int j = 0;
        for (int i = matriz.length-1; i >= 0; i--){
            suma += matriz[i][j];
            j++;
        }
        return suma;
    }
    public static double mediaMatriz(int[][] matriz){
        int suma = 0;
        int n = matriz.length*matriz.length;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                suma += matriz[i][j];
            }
        }
        double medio = Double.valueOf(suma) /(n);
        return medio;
    }
    //METODOS EJERCICIO 5
    public static String [] columnas(String[][] matriz, int columna) {
        String [] nuevaMatriz = new String[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            nuevaMatriz[i] = matriz[i][columna];
        }
        return nuevaMatriz;
    }
    public static void mostrarGolosinas(String[][] matriz){
        String[] golosinas = columnas(matriz,0);
        String[] precio = columnas(matriz,1);
        String[] stock = columnas(matriz,2);
        for (int i = 0; i < golosinas.length; i++) {
            System.out.println(i+ " " + golosinas[i] + " $" + precio[i] + " Cantidad disponible: " + stock[i] );
        }
    }

    public static int pedirGolosina(String[][] matriz) {
        Scanner sc = new Scanner(System.in);
        String[] stock = columnas(matriz, 2);
        String[] precio = columnas(matriz, 1);
        System.out.println("En que posicion esta la golosina seleccionada? ");int pos = sc.nextInt();
        while (pos < 0 || pos >= matriz.length){
            System.out.println("La posicion ingresada no es valida ");
            System.out.println("En que posicion esta la golosina seleccionada? ");pos = sc.nextInt();
        }
        int stockGol = Integer.valueOf(matriz[pos][2]);
        while (stockGol <= 0){
            System.out.println("Falta stock de la golosina ingresada. Seleccione otra golosina");pos = sc.nextInt();
            stockGol = Integer.valueOf(matriz[pos][2]);
        }
        matriz[pos][2] = String.valueOf(Integer.valueOf(matriz[pos][2])-1);
        int venta = Integer.valueOf(precio[pos]);
        return venta;
    }
    public static String[][] rellenarGolosinas(String[][] matriz){
        Scanner sc = new Scanner(System.in);
        String admin = "AdminXYZ";
        System.out.println("Ingrese la clave del administrador "); String clave = sc.nextLine();
        while (!clave.equals(admin)){
            System.out.println("Contraseña incorrecta ");
            System.out.println("Ingrese la clave del administrador ");clave = sc.nextLine();
        }
        System.out.println("Posicion de la golosina a recargar "); int pos = sc.nextInt();
        while (pos < 0 && pos >= matriz.length){
            System.out.println("La posicion ingresada no es valida ");
            System.out.println("Posicion de la golosina a recargar ");pos = sc.nextInt();
        }
        System.out.println("Cantidad a recargar "); int cant = sc.nextInt();
        matriz[pos][2] = String.valueOf(Integer.valueOf(matriz[pos][2]) + cant);
        return matriz;
    }
}
