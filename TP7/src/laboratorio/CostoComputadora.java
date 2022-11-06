package laboratorio;

import java.util.HashSet;
import java.util.Scanner;

public class CostoComputadora {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String opc = "SI";
        while (opc.equals("SI")){
            Computadora pc = new Computadora();
            pc = cargarPC(pc);
            System.out.println("--------Computadora----------");
            System.out.println("Marca: " + pc.getMarca());
            System.out.println("Modelo: " + pc.getModelo());
            System.out.println("Componentes: ");
            HashSet<ComponenteCPU> componentes = pc.getComponentes();
            for (ComponenteCPU c : componentes){
                System.out.println(
                        c.getComponente()+
                        "  " + c.getMarca()+
                                "  X"+ c.getCantidad()+ "  Subtotal: " + c.getCantidad()*c.getPrecio());
            }
            double costo = calcularCosto(pc);
            sc = new Scanner(System.in);
            System.out.println("Precio sugerido: " + costo);
            System.out.println("Si desea cotizar otra computadora tipee 'SI'");
            opc = sc.nextLine();
        }
    }
    public static Computadora cargarPC(Computadora pc){
        HashSet<ComponenteCPU> componentes = new HashSet<>();
        System.out.println("Ingrese la marca de la computadora: ");
        String marca = sc.nextLine();
        System.out.println("Ingrese el modelo: ");
        String modelo = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de componentes: ");
        int cantComp = sc.nextInt();
        for (int i = 0; i < cantComp; i++) {
            sc = new Scanner(System.in);
            System.out.println("Nombre del componente: ");
            String nombre = sc.nextLine();
            System.out.println("Marca: ");
            String marcaComp = sc.nextLine();
            sc = new Scanner(System.in);
            System.out.println("Cantidad: ");
            int cant = sc.nextInt();
            System.out.println("Precio por unidad: ");
            int precio = sc.nextInt();
            ComponenteCPU componente = new ComponenteCPU(nombre,marcaComp,cant,precio);
            componentes.add(componente);
        }
        pc = new Computadora(marca,modelo,componentes);
        return pc;
    }

    public static double calcularCosto(Computadora pc){
        HashSet<ComponenteCPU> componentes = pc.getComponentes();
        double costo = 0.0;
        for (ComponenteCPU c : componentes){
            costo += (c.getPrecio()*c.getCantidad());
        }
        if (costo < 50000.0) {
            costo = costo + (costo*40)/100;
        }
        else {
            costo = costo + (costo*30)/100;
        }
        return costo;
    }
}
