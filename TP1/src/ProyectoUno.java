import java.util.Scanner;
public class ProyectoUno {
    public static void main(String[] args) throws Exception {
        //EJERCICIO 1//
        /*String name = "Alvaro";
        System.out.println("Bienvenido " + name);*/
        //EJERCICIO 2//
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = sc.nextLine();
        System.out.println("Bienvenido " + name);*/
        //EJERCICIO 3//
        /*double num1 = 9;
        double num2 = 12;
        System.out.println("La suma de los dos valores es: "+ (num1+num2));
        System.out.println("La resta de los dos valores es: "+ (num1-num2));
        System.out.println("El producto de los dos valores es: "+ num1*num2);
        System.out.println("El cociente de la division de los dos valores es: "+ num1/num2);
        System.out.println("El resto de la division de los dos valores es: "+ num1%num2);*/
        //EJERCICIO 4//
        /*double num1 = 25;
        double num2 = 25;
        double mayor;
        if (num1>num2) {
            mayor = num1;
            System.out.println("El numero mayor es " + mayor);
        }else {
            if(num2>num1){
                mayor = num2;
                System.out.println("El mayor es " + mayor);
            } else {
                System.out.println("Son iguales");
            }
        }*/
        //EJERCICIO 5//
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num = sc.nextDouble();
        if (num%2 == 0){
            System.out.println("El numero ingresado es divisible por 2");
        } else {
            System.out.println("El numero ingresado no es divisible por 2");
        }*/
        //EJERCICIO 6//
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double num = sc.nextDouble();
        double result = num + (num*21/100);
        System.out.println("El precio final con IVA es de "+ result);*/
        //EJERCICIO 7//
        /*int contador = 1;
        while(contador <= 100){
            System.out.println(contador);
            contador += 1;
        }*/
        //EJERCICIO 8//
        /*for ( int i=1;i<=100; i++ ){
            System.out.println(i); 
        }*/
        //EJERCICIO 9//
        /*int contador =1;
        while (contador <=100){
            if (contador%2 ==0){
                System.out.println(contador);
            } else if (contador%3 ==0){
                System.out.println(contador);
            }
            contador +=1;
        }*/
        //EJERCICIO 10//
        /*Scanner sc = new Scanner(System.in);
        double num;
        do { 
            System.out.println("Ingrese un numero");
            num = sc.nextDouble();
            System.out.println(num +" es mayor o igual que cero");
        } while (num < 0);*/
        //EJERCICIO 11//
        /* String password = "1234";
        Scanner sc = new Scanner(System.in);
        String contra;
        int contador = 0;
        while(contador < 3){
            System.out.println("Ingrese su contraseña");
            contra = sc.nextLine();
            if (contra.equals(password)){
                System.out.println("Acceso Correcto");
                break;
            }
            contador +=1;
        }
        //EJERCICIO 12//
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana");
        String dia = sc.nextLine();
        switch (dia) {
            case "Lunes":
                System.out.println("Dia laboral");
                break;
            case "Martes":
                System.out.println("Dia laboral");
                break;
            case "Miercoles":
                System.out.println("Dia laboral");
                break;
            case "Jueves":
                System.out.println("Dia laboral");
                break;
            case "Viernes":
                System.out.println("Dia laboral");
                break;
            case "Sabado":
                System.out.println("Dia NO laboral");
                break;
            case "Domingo":
                System.out.println("Dia NO laboral");
                break;
        }
        //EJERCICIO 13//
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num = sc.nextDouble();
        int divisores = 0;
        for (int i = 0; i <= num; i++) {
            if (num%i == 0){
                divisores += 1;
            }  
        }
        if (num <=1){
            System.out.println("El numero ingresado NO es primo");
        } else {
            if(divisores <= 2){
                System.out.println("El numero ingresado es primo");
            } else {
                System.out.println("El numero ingresado NO es primo");
            }
        }
        //EJERCICIO 14//
        int x = new Double(Math.random()*100).intValue();
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un numero entre 0 y 100");
            num = sc.nextInt();
            contador +=1;
            if (num < x){
                System.out.println("Es muy bajo");
            } else if (num > x){
                System.out.println("Es muy alto");
            } else {
                System.out.println("Correcto,numero encontrado,cantidad de intentos: " + contador);
            }
        } while (num!=x);*/
    }
}
