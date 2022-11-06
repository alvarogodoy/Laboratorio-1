package Laboratorio;


public class Parte6 {
    public static void main(String[] args) {
        //EJERCICIO 3 EN CLASE CLIENTE
        //EJERCICIO 4
        Cliente instancia1 = new Cliente();
        instancia1.apellido = "Alonso";
        instancia1.nombre = "Eugenia";
        instancia1.dni = 27456987;
        instancia1.sueldo = 2698.85;
        instancia1.nroCliente = 13654;
        Cliente instancia2 = new Cliente();
        instancia2.apellido = "Pereira";
        instancia2.nombre = "Victor";
        instancia2.dni = 26987456 ;
        instancia2.sueldo = 3695.45;
        instancia2.nroCliente = 12852;
        //EJERCICIO 5
        System.out.println("Instancia 1: ");
        System.out.println("Apellido: "+instancia1.apellido);
        System.out.println("Nombre: "+instancia1.nombre);
        System.out.println("DNI: "+instancia1.dni);
        System.out.println("Sueldo: "+instancia1.sueldo);
        System.out.println("Numero de cliente: "+instancia1.nroCliente);
        System.out.println("Instancia 2: ");
        System.out.println("Apellido: "+instancia2.apellido);
        System.out.println("Nombre: "+instancia2.nombre);
        System.out.println("DNI: "+instancia2.dni);
        System.out.println("Sueldo: "+instancia2.sueldo);
        System.out.println("Numero de cliente: "+instancia2.nroCliente);
        //EJERCICIO 6
        //INTERFAZ
        /**Una interfaz en Java es una colección de métodos abstractos y propiedades constantes.
         *  En las interfaces se especifica qué se debe hacer pero no su implementación **/
        //CLASE ABSTRACTA
        /** Una clase abstracta no es más que una clase común la cual posee atributos, métodos, constructores y por lo menos un método abstracto.
         *  Una clase abstracta no puede ser instanciada, solo heredada.**/
        //CLASE CONCRETA
        /**una clase concreta en Java es un tipo de subclase, que implementa todo el método abstracto de su clase súper abstracta a la que se extiende.
         *También tiene implementaciones de todos los métodos de interfaces que implementa. **/
    }
}

