import java.util.Scanner;

public class Act16 {
    public static void main(String[] args) {
        Act16 programa=new Act16();
        programa.inicio();
    }

    private void inicio() {
        int[] personas=getArray(10);
        boolean fin=false;
        int numPersonas;

        asignarPersonas(personas);
        do {
            printInterfaz(personas);
            numPersonas=getNum();
            if(numPersonas==-1)
                fin=true;
            else if (numPersonas>=0){
                asignarMesa(numPersonas,personas);
            }

        }while(!fin);
    }

    private void printInterfaz(int[] personas) {
        printLineas();
        printNumMesas(personas);
        printLineas();
        printMesas(personas);
    }

    private void printMesas(int[] personas) {
        printPantalla("|Ocupación| ");
        for (int i=0;i<personas.length;i++){
            printPantalla(personas[i] + " | ");
        }
        System.out.println("\n");
    }

    private void printNumMesas(int[] personas) {
        printPantalla("| Mesa Nº | ");
        for (int i=0;i< personas.length;i++){
            printPantalla((i+1) + " | ");
        }
        System.out.println();
    }

    private void printLineas() {
        for (int i=1;i<=52;i++){
            printPantalla("_");
        }
        System.out.println();
    }

    private void asignarPersonas(int[] personas) {
        for(int i=0;i< personas.length;i++){
            personas[i]=getAleatorio();
        }
    }

    private int getAleatorio() {
        return (int)(Math.random()*5);
    }

    private void asignarMesa(int numPersonas, int[] personas) {
        for (int i=0;i<personas.length;i++){

        }

    }

    private int getNum() {
        Scanner sc=new Scanner(System.in);
        printPantalla("¿Cuántos son? (Introduzca -1 para salir del programa): ");
        return sc.nextInt();
    }

    private void printPantalla(String s) {
        System.out.print(s);
    }

    private int[] getArray(int l) {
        return new int[l];
    }
}