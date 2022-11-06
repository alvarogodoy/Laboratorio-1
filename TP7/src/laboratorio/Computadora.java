package laboratorio;

import java.util.HashSet;

public class Computadora {
    private String marca;
    private String modelo;
    private HashSet<ComponenteCPU> componentes;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, HashSet<ComponenteCPU> componentes){
        this.marca = marca;
        this.modelo = modelo;
        this.componentes = componentes;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public HashSet<ComponenteCPU> getComponentes() {
        return componentes;
    }

}
