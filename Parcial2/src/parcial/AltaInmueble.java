package parcial;

import java.util.Scanner;
import java.util.ArrayList;

public class AltaInmueble {
    static Scanner sc = new Scanner(System.in);
    
    static ArrayList<Departamento> deptosIngresados = new ArrayList<>();
    
    public static void main(String[] args) {
        Edificio edificio = new Edificio();
        cargarEdificio(edificio);
        
        System.out.println("Edificio: " + edificio.getNombre());
        System.out.println("Domicilio: " + edificio.getDomicilio());
        System.out.println("------------Departamento----------------");
        for (Departamento depto : deptosIngresados){
            mostrarDepartamento(depto);
        }
        System.out.println("Total metros cuadrados del edificio: " + edificio.totalMetrosCuadradosEdificio());        
    }
    
    public static void cargarEdificio(Edificio e){
        ArrayList<Departamento> departamentos = new ArrayList<>();
        String domicilio;
        String nombre;
        while(true){
            System.out.println("Ingrese el nombre del edificio: ");
            nombre = sc.nextLine();
            if (nombre.equals("")){
                System.out.println("El nombre del edificio no puede estar vacio");
                continue;
            }
            break;
        }
        e.setNombre(nombre);
         while(true){
            System.out.println("Ingrese el domicilio del edificio: ");
            domicilio = sc.nextLine();
            if (domicilio.equals("")){
                System.out.println("El domicilio del edificio no puede estar vacio");
                continue;
            }
            break;
        }
        e.setDomicilio(domicilio);
        System.out.println("Carga de departamentos");
        while (true){
            Departamento depto = cargarDepto();
            departamentos.add(depto);
            System.out.println("Si desea seguir cargando departamentos presione 1, de lo contrario presione cualquier tecla: ");
            String opc = sc.nextLine();
            if (!opc.equals("1")) break;
        }
        e.setDepartamentos(departamentos);     
    }
    
    public static Departamento cargarDepto(){
        ArrayList<Ambiente> ambientes = new ArrayList<>();
        boolean flag = true;
        Departamento depto = new Departamento();
        int piso;
        String letra;
        while (flag){
            while(true){
                System.out.println("Ingrese el piso: ");
                piso = sc.nextInt();
                if (String.valueOf(piso).equals("")){
                    System.out.println("El piso no puede ser vacio");
                    continue;
                }
                break;
            }
            sc = new Scanner(System.in);
            while(true){
                System.out.println("Ingrese la letra: ");
                letra = sc.nextLine();
                if (letra.equals("")){
                    System.out.println("La letra no puede ser vacio");
                    continue;
                }
                break;
            }
            depto.setPiso(piso);
            depto.setLetra(letra);
            flag = validarDepto(depto);
            if (flag){
                System.out.println("El departamento ya fue cargado anteriormente, intente nuevamente");
                continue;
            }
            break;
        }
        System.out.println("Carga de ambientes");
        sc = new Scanner(System.in);
        while (true){
            Ambiente amb = cargarAmbiente();
            ambientes.add(amb);
            sc = new Scanner(System.in);
            System.out.println("Si desea seguir cargando ambientes presione 1, de lo contrario presione cualquier tecla: ");
            String opc = sc.nextLine();
            if (!opc.equals("1")) break;
        }
        depto.setHabitaciones(ambientes);
        deptosIngresados.add(depto);
        return depto;
    }
    
    public static boolean validarDepto(Departamento depto){
        for (Departamento d : deptosIngresados){
            if (d.getPiso() == depto.getPiso() && d.getLetra().equals(depto.getLetra())){
                return true;
            }
        }
        return false;
    }
    
    public static Ambiente cargarAmbiente(){
        Ambiente ambiente = new Ambiente();
        String tipo;
        double metros;
        while (true){
            System.out.println("Ingrese el tipo de ambiente: ");
            tipo = sc.nextLine();
            ambiente.setTipo(tipo);
            boolean flag = validarAmbiente(ambiente);
            if (flag){
                System.out.println("El ambiente ingresado no es valido");
                continue;
            }
            break;
        }
        ambiente.setTipo(tipo);
        sc = new Scanner(System.in);
        while (true){
            System.out.println("Ingrese los metros cuadrados:");
            metros = sc.nextDouble();
            if (metros <= 0.0) {
                System.out.println("La cantidad de metros debe ser mayor a 0");
                continue;
            }
            break;
        }
        ambiente.setMetrosCuadrados(metros);
        return ambiente;
    }
    
    public static boolean validarAmbiente(Ambiente amb){
        String[] ambientes = {"C", "CC", "B", "BS", "E", "H"};
        for (String ambiente: ambientes){
            if (ambiente.equals(amb.getTipo())) return false;
        }
        return true;
    }
    
    public static void mostrarDepartamento(Departamento depto){
        System.out.println("Piso: " + depto.getPiso());
        System.out.println("Letra: " + depto.getLetra());
        System.out.println("------------Ambientes----------------");
        for (Ambiente amb : depto.getHabitaciones()){
            mostrarAmbiente(amb);
        }
        System.out.println("Total metros cuadrados del departamento: " + depto.totalMetrosCuadradosDepartamento());
        System.out.println("-------------------------------------");
    }
    
    public static void mostrarAmbiente(Ambiente amb){
        System.out.println("Tipo Ambiente: " + amb.getTipo());
        System.out.println("Metros Cuadrados: " + amb.getMetrosCuadrados());
        System.out.println("-------------------------------------");
    }
}