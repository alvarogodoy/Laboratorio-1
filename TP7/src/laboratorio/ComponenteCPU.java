package laboratorio;

public class ComponenteCPU {
    private String componente;
    private String marca;
    private int cantidad;
    private double precio;

    public ComponenteCPU(String componente, String marca, int cantidad, double precio){
        this.componente = componente;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getComponente() {
        return componente;
    }

    public int getCantidad() {
        return cantidad;
    }
    public double getPrecio() {
        return precio;
    }
}
