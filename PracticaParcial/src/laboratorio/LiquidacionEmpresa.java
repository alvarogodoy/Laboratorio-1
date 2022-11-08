package laboratorio;

import java.util.ArrayList;
import java.util.Scanner;

public class LiquidacionEmpresa {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<Integer> legajosUsados = new ArrayList<>();
    static NivelAcademico secCompleto = new NivelAcademico(10,"Secundario Completo",10.0);
    static NivelAcademico univCompleto = new NivelAcademico(20,"Universitario Completo",30.0);
    static NivelAcademico masterCompleto = new NivelAcademico(30,"Maestria Completo",40.0);
    static NivelAcademico docCompleto = new NivelAcademico(40,"Doctorado Completo",50.0);

    static NivelAcademico[] niveles = {secCompleto,univCompleto,masterCompleto,docCompleto};
    static ArrayList<Double> salarios = new ArrayList<>();


    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        cargarEmpresa(empresa);

        System.out.println("Empresa: " + empresa.getRazonSocial());
        System.out.println("CUIT: " + empresa.getCuit());
        System.out.println("----------------EMPLEADOS------------------------------");

        for (Empleado e : empresa.getEmpleados()) {
            mostrarEmpleado(e);
        }
        double sumaPromedio = 0.0;
        for (double salario : salarios) {
            sumaPromedio += salario;
        }
        System.out.println("Resumen");
        System.out.println("El promedio de los salarios de la empresa es: " + sumaPromedio/salarios.size());
        System.out.println("El empleado con mejor salario es: ");
        int mejorSalarioIndice = mejorSalario();
        mostrarEmpleado(empresa.getEmpleados().get(mejorSalarioIndice));
    }
    public static void cargarEmpresa(Empresa e) {
        while (true) {
            System.out.println("Ingrese la razon social de la empresa: ");
            String razonSocial = sc.nextLine();
            if (razonSocial.equals("")) {
                System.out.println("La razon social no puede estar vacia, intente nuevamente");
                continue;
            }
            e.setRazonSocial(razonSocial);
            break;
        }
        sc = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese el CUIT de la empresa: ");
            String cuit = sc.nextLine();
            if (cuit.length() != 11) {
                System.out.println("El CUIT debe contener 11 numeros");
                continue;
            }
            e.setCuit(cuit);
            break;
        }
        ArrayList<Empleado> empleados = new ArrayList<>();
        System.out.println("Carga de empleados:");
        String opc;
        do {
            Empleado empleado = crearEmpleado();
            empleados.add(empleado);
            System.out.println("Si desea seguir cargando empleados presione 1, de lo contrario presione cualquier tecla");
            sc = new Scanner(System.in);
            opc = sc.nextLine();
        } while (opc.equals("1"));
        e.setEmpleados(empleados);
    }

    public static Empleado crearEmpleado(){
        Empleado empleado = new Empleado();
        System.out.println("Ingrese el nombre completo del empleado: ");
        String nombre = sc.nextLine();
        empleado.setNombreCompleto(nombre);
        sc = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese el legajo del empleado: ");
            int legajo = sc.nextInt();
            if (String.valueOf(legajo).equals("")){
                System.out.println("El legajo no puede estar vacio");
                continue;
            }
            if (legajosUsados.contains(legajo)){
                System.out.println("El legajo ingresado ya fue utilizado, ingrese uno nuevo");
                continue;
            }
            empleado.setLegajo(legajo);
            legajosUsados.add(legajo);
            break;
        }
        while(true){
            System.out.println("Ingrese el salario: ");
            double salario = sc.nextDouble();
            if (salario <= 0) {
                System.out.println("El salario no puede ser menor o igual a 0");
                continue;
            }
            empleado.setSalario(salario);
            break;
        }
        asignarNivel(empleado);
        double salarioTotal = empleado.salarioTotalCalculado();
        salarios.add(salarioTotal);

        return empleado;
    }

    public static void asignarNivel(Empleado e) {
        out:
        while (true) {
            System.out.println("Ingrese el codigo del nivel academico: ");
            int codigo = sc.nextInt();
            for (NivelAcademico nivel : niveles) {
                if (codigo == nivel.getCodigo()) {
                    e.setNivelAcademico(nivel);
                    break out;
                }
            }
            System.out.println("El codigo ingresado no es valido");
        }
    }

    public static void mostrarEmpleado(Empleado e){
        System.out.println("Nombre Completo: " + e.getNombreCompleto());
        System.out.println("Salario: " + e.salarioTotalCalculado());
        System.out.println("Nivel Educativo: " + e.getNivelAcademico().getNivel() + " (Porcentaje Aumento: )" + e.getNivelAcademico().getPorcentajeAumento()+ "%");
        System.out.println("-------------------------------------------------------");
    }

    public static int mejorSalario(){
        double mejorSalario = salarios.get(0);
        for (double salario : salarios) {
            if (salario > mejorSalario) mejorSalario = salario;
        }
        return salarios.indexOf(mejorSalario);
    }
}
