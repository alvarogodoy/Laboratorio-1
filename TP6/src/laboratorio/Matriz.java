package laboratorio;
import java.util.ArrayList;
import java.util.Scanner;

public class Matriz {
    static ArrayList<Celda> matrizCuadrada = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String val;
        while(true) {
            System.out.println("Ingrese un valor para la celda(cadena de texto) ");
            val = sc.next();
            if (val.equals("FIN")) break;
            System.out.println("Ingrese la fila "); int fila = sc.nextInt();
            System.out.println("Ingrese la columna "); int columna = sc.nextInt();
            Celda c = new Celda();
            c.setValor(val);
            c.setFila(fila);
            c.setColumna(columna);
            matrizCuadrada.add(c);
        }
        for (Celda celda : matrizCuadrada) {
            System.out.println(celda.getValor());
        }
        System.out.println("Ingrese la fila de la celda "); int buscFila = sc.nextInt();
        System.out.println("Ingrese la columna de la celda "); int buscCol = sc.nextInt();
        String valor = encontrarValor(buscFila, buscCol,matrizCuadrada);
        if (valor != null) System.out.println("El valor de la celda es: "+ valor);
        else System.out.println("La fila y la columna indicada no ha sido asignada");
    }
    //Metodo para buscar la celda
    public static String encontrarValor(int fila, int columna, ArrayList<Celda> matriz){
        for (Celda c : matriz){
            if (c.getFila() == fila && c.getColumna() == columna){
                return c.getValor();
            }
        }
        return null;
    }
}
