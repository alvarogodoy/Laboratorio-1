package laboratorio;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class CalculoBonoSueldo {
    static String [][]  haberes = {{"100","Presentismo", "9"} , {"101"," Titulo Profesional" , "9"} , {"102","Horas Extraordinarias", "M"} , {"103","Horas Nocturnas", "M"} , {"104"," Otros Haberes", "M"}};
    static String [][]  deducciones = {{"200"," Obra Social", "3"} , {"201","Jubilacion", "11"} , {"202","Sindicato", "2"} , {"203"," Seguro", "1.5"} , {"204","Otros", "M"}};
    static List<Integer> codigosIngresados = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        cargarEmpleado(empleado);
    }
    public static void cargarEmpleado(Empleado e) {
        int anioActual = 2022;
        System.out.println("Ingrese el nombre del empleado: ");
        e.setNombreEmpleado(sc.nextLine());
        System.out.println("Ingrese el CUIL del empleado: ");
        sc = new Scanner(System.in);
        e.setCuil(sc.nextLong());
        int anioIng = 3000;
        while (anioIng > anioActual){
            System.out.println("Año de ingreso: ");
            anioIng = sc.nextInt();
            if (anioIng > anioActual){
                System.out.println("El año de ingreso no es valido, ingreselo nuevamente");
                continue;
            }
            e.setAnioIngreso(anioIng);
        }
        System.out.println("Sueldo basico: ");
        e.setSueldoBasico(sc.nextInt());
        int opc;
        while (true) {
            codigosIngresados = new ArrayList<>();
            BonoSueldo bono = new BonoSueldo();
            cargarBono(bono, e);
            int antiguedad = (bono.getAnioLiquidacion()) - anioIng;
            double montoAntiguedad = (antiguedad * 0.02) * e.getSueldoBasico();
            e.setMontoAntiguedad(montoAntiguedad);
            String[][] bonoCalculado = new String[11][4];
            bonoCalculado[0][0] = "Codigo Item";
            bonoCalculado[0][1] = "Denominacion";
            bonoCalculado[0][2] = "Haberes";
            bonoCalculado[0][3] = "Deducciones";
            cargaHaberes(bonoCalculado, e);
            cargaDeducciones(bonoCalculado, e);
            double montoALiquidar = calcularLiquidacion(bonoCalculado, e);
            bono.setMontoLiquidacion(montoALiquidar);
            bono.setBonoCalculado(bonoCalculado);
            e.addBono(bono);
            System.out.println("Si desea cargar otro bono presione 1: ");
            opc = sc.nextInt();
            if (opc != 1) {
                System.out.println("Carga de bonos finalizada");
                for (BonoSueldo b : e.getBonos()){
                    mostrarBono(b.getBonoCalculado(),e,b);
                }
                break;
            }
        }
    }

    public static void cargarBono(BonoSueldo b, Empleado e){
        b.setEmpleado(e);
        int anioActual = 2022;
        int anioLiqui = 3000;
        while (anioLiqui > anioActual){
            System.out.println("Año de liquidacion: ");
            anioLiqui = sc.nextInt();
            if (anioLiqui > anioActual){
                System.out.println("El año de liquidacion no es valido, ingreselo nuevamente");
                continue;
            }
            b.setAnioLiquidacion(anioLiqui);
        }
        System.out.println("Mes de liquidacion: ");
        b.setMesLiquidacion(sc.nextInt());
    }

    public static void cargaHaberes(String [][] b, Empleado e){
        sc = new Scanner(System.in);
        System.out.println("Ingrese los haberes del empleado");
        String codItem;
        int i = 1;
        int contador = 0;
        while(true){
            System.out.println("Ingrese el codigo del item: ");
            codItem = sc.nextLine();
            if (codItem.equals("000")){
                if (contador == 0) {
                    System.out.println("Debe ingresar al menos un haber");
                    continue;
                }
                System.out.println("Carga de haberes finalizada");
                break;
            }
            if (codigosIngresados.contains(Integer.parseInt(codItem))) {
                System.out.println("El codigo ya fue cargado, ingrese otro codigo");
                continue;
            }
            boolean encontrado = false;
            for (String[] h:haberes){
                if (h[0].equals(codItem)){
                    b[i][0] = codItem;
                    b[i][1] = h[1];
                    double porcentaje;
                    if (h[2].equals("M")){
                        System.out.println("Ingrese el porcentaje del sueldo basico del item: ");
                        porcentaje = sc.nextDouble();
                    } else porcentaje = Double.parseDouble(h[2]);
                    b[i][2] = String.valueOf((porcentaje/100)*e.getSueldoBasico());
                    codigosIngresados.add(Integer.parseInt(codItem));
                    encontrado = true;
                    contador++;
                    i++;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El codigo ingresado no es valido, ingrese otro codigo");
            }
            sc = new Scanner(System.in);
        }

    }

    public static void cargaDeducciones(String [][] b, Empleado e){
        sc = new Scanner(System.in);
        System.out.println("Ingrese las deducciones del empleado");
        String codItem;
        int i = 1;
        int contador = 0;
        while(true){
            System.out.println("Ingrese el codigo del item: ");
            codItem = sc.nextLine();
            if (codItem.equals("000")){
                if (contador == 0) {
                    System.out.println("Debe ingresar al menos una deduccion");
                    continue;
                }
                System.out.println("Carga de descuentos finalizada");
                break;
            }
            if (codigosIngresados.contains(Integer.parseInt(codItem))) {
                System.out.println("El codigo ya fue cargado, ingrese otro codigo");
                continue;
            }
            boolean encontrado = false;
            for (String[] h: deducciones){
                if (h[0].equals(codItem)){
                    double porcentaje;
                    if (h[2].equals("M")){
                        System.out.println("Ingrese el porcentaje del sueldo basico del item: ");
                        porcentaje = sc.nextDouble();
                    } else porcentaje = Double.parseDouble(h[2]);
                    b[i][3] = String.valueOf((porcentaje/100)*e.getSueldoBasico());
                    codigosIngresados.add(Integer.parseInt(codItem));
                    encontrado = true;
                    contador++;
                    i++;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El codigo ingresado no es valido, ingrese otro codigo");
            }
            sc = new Scanner(System.in);
        }
    }
    public static double calcularLiquidacion(String[][] b, Empleado e){
        double monto = e.getSueldoBasico()+ e.getMontoAntiguedad();
        for (int i = 1; i < b.length; i++) {
            for (int j = 2; j < b[0].length; j++) {
                String valor = b[i][j];
                if(valor == null) continue;
                if (j == 2)  {
                        monto += Double.parseDouble(valor);
                }
                else if (j == 3) {
                        monto -= Double.parseDouble(valor);
                }
            }
        }

        return monto;
    }
    public static void mostrarBono(String[][] b, Empleado e,BonoSueldo bono){
        System.out.print("Nombre: ");
        System.out.println(e.getNombreEmpleado());
        System.out.print("CUIL: ");
        System.out.println(e.getCuil());
        System.out.print("Mes Liquidacion: ");
        System.out.print(bono.getMesLiquidacion() + "  ");
        System.out.print("Año Liquidacion: ");
        System.out.println(bono.getAnioLiquidacion());
        System.out.print("Sueldo Basico: ");
        System.out.print(e.getSueldoBasico()+ "  ");
        System.out.print("Año ingreso:  ");
        System.out.println(e.getAnioIngreso());
        for (int i=0; i< b.length; i++){
            if (b[i][0] != null)System.out.print(b[i][0]+ "  |");
        }
        System.out.println("");
        for (int i=0; i< b.length; i++){
            if (b[i][1] != null)System.out.print(b[i][1]+ "  |");
        }
        System.out.println("");
        for (int i=0; i< b.length; i++){
            if (b[i][2] != null)System.out.print(b[i][2]+ "  |");
        }
        System.out.println("");
        for (int i=0; i< b.length; i++){
            if (b[i][3] != null)System.out.print(b[i][3]+ "  |");
        }
        System.out.println("");
        System.out.println("El monto neto a liquidar es: " + bono.getMontoLiquidacion());
    }
}
