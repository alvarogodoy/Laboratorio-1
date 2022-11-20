package parcial;

import java.util.ArrayList;

public class Edificio {
    private String nombre;
    private String domicilio;
    private ArrayList<Departamento>departamentos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    
    public double totalMetrosCuadradosEdificio(){
        double total = 0.0;
        for (Departamento depto : this.departamentos){
            double metroCuadradoDepto = depto.totalMetrosCuadradosDepartamento();
            total+=metroCuadradoDepto;
        }
        return total;
    }
    
}