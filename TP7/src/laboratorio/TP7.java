package laboratorio;
import java.util.Scanner;
import java.util.HashMap;

public class TP7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //EJERCICIO A
        HashMap<String, Long> agenda = new HashMap<>();
        boolean flag = true;
        while (flag) {
            System.out.println("----MENU-----");
            System.out.println("1- Cargar Datos en la Agenda");
            System.out.println("2- Buscar Teléfono por Nombre");
            System.out.println("3- Listar Agenda");
            System.out.println("4- Cerrar Menu");
            int opc = sc.nextInt();
            sc = new Scanner(System.in);
            switch (opc) {
                case 1:
                    cargarAgenda(agenda);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del contacto a buscar: ");
                    String nombre = sc.nextLine();
                    if (agenda.containsKey(nombre)) System.out.println("Numero: " + agenda.get(nombre));
                    else System.out.println("No se encontro el contacto indicado");
                    break;
                case 3:
                    for (String i : agenda.keySet()) {
                        System.out.println("Nombre: " + i + "| Numero: " + agenda.get(i));
                    }
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
            }
        }
    }

    //METODO PARA CARGAR AGENDA
    public static boolean cargarAgenda(HashMap<String, Long> agenda) {
        sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del contacto: ");
        String nombre = sc.nextLine();
        while (agenda.containsKey(nombre)) {
            System.out.println("Ese contacto ya existe en la agenda");
            System.out.println("Ingrese el nombre completo del contacto: ");
            nombre = sc.nextLine();
        }
        System.out.println("Ingrese el numero del contacto: ");
        sc = new Scanner(System.in);
        Long num = sc.nextLong();
        agenda.put(nombre, num);
        System.out.println("Si desea continuar con la carga presione 1, de lo contrario presione cualquier numero ");
        int opc = sc.nextInt();
        if (opc == 1) cargarAgenda(agenda);
        return false;
    }
}
