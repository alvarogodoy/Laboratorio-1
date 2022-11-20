package parcial;

import java.util.ArrayList;

public class Departamento {
     private int piso;
     private String letra;
     private ArrayList<Ambiente> habitaciones;

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public ArrayList<Ambiente> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Ambiente> habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    public double totalMetrosCuadradosDepartamento(){
        double total = 0.0;
        for (Ambiente amb : this.habitaciones){
            total += amb.getMetrosCuadrados();
        }
        return total;
    }
     
}