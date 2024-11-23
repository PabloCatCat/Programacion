package Olimpiadas;

import java.util.Scanner;

public class Tesoro {
    public static void main(String[] args) {
        Tesoro programa=new Tesoro();
        programa.inicio();
    }

    private void inicio() {
        int vampiro, tesoro,posicion=0;
        String respuesta;

        vampiro=getNumero();
        do {
            tesoro=getNumero();
        }while(tesoro==vampiro);

        do {
            respuesta = getRespuesta(posicion);

        }while(posicion!=vampiro||posicion!=tesoro);
    }

    private String getRespuesta(int posicion) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Estás en la habitación: " + posicion);
        if (posicion==0){
            System.out.println();
        }
    }

    private int getNumero() {
        return (int)(Math.random()*6);
    }
}
