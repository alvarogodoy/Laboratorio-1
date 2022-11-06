package laboratorio;

public class OperacionMatematica {
    //ATRIBUTOS
    float valor1, valor2;
    String operacion;
    //GETTERS AND SETTERS
    public float getValor1() {
        return valor1;
    }
    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }
    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public String getOperacion() {
        return operacion;
    }
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    //METODOS
    private double sumarNumeros(){
        return valor1 + valor2;
    }
    private double restarNumeros(){
        return valor1 - valor2;
    }
    private double multiplicarNumeros(){
        return valor1 * valor2;
    }
    private double dividirNumeros(){
        return valor1 / valor2;
    }
    public double aplicarOperacion(String operacion){
        double result;
        if (operacion == "+"){
            result = sumarNumeros();
        }
        else if (operacion =="-"){
            result = restarNumeros();
        } 
        else if (operacion =="*") {
            result = multiplicarNumeros();
        }
        else if (operacion =="/") {
            result = dividirNumeros();
        }
        else {
            System.out.println("La operacion ingresada no es valida");
            result = 0.0;
        }
        System.out.println(result);
        return result;
    }
}
