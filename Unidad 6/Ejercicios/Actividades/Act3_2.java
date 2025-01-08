import java.util.Scanner;

public class Act3_2 {
    public static void main(String[] args) {
        Act3_2 programa=new Act3_2();
        programa.inicio();
    }

    private void inicio() {
        int[][] tablero=getArrayBi(8,8);
        String posicion;
        posicion = getPosicion();
    }

    private String getPosicion() {

        printPantalla("Posición del alfil: ");
        return getString();

    }

    private String getString() {
        Scanner sc=new Scanner(System.in);
        return sc.next();
    }

    private void printPantalla(String s) {
        System.out.print(s);
    }

    private int[][] getArrayBi(int filas, int columnas) {
        return new int[filas][columnas];
    }
}