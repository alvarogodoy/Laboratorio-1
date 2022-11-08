package laboratorio;

public class Empleado {
    private String nombreCompleto;
    private int legajo;
    private double salario;
    private NivelAcademico nivelAcademico;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public NivelAcademico getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(NivelAcademico nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public double salarioTotalCalculado(){
        double porcentajeASumar = this.nivelAcademico.getPorcentajeAumento()/100;
        return this.salario + porcentajeASumar*this.salario;
    }
}
