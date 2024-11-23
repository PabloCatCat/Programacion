package Olimpiadas;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Piramide programa=new Piramide();
        programa.inicio();
    }

    private void inicio() {
        int altura;

        altura = getAltura();
        imprimirPiramide(altura);
    }

    private static void imprimirPiramide(int altura) {
        for (int i=1;i<=altura;i++){
            imprimirBlancos(i,altura);
            imprimirCaracteres(i);
            System.out.println();
        }
    }

    private static void imprimirCaracteres(int i) {
        for (int caracter=1;caracter<=i*2-1;caracter++){
            if (caracter%2==0){
                System.out.print("o");
            }else
                System.out.print("*");
        }
    }

    private static void imprimirBlancos(int i, int altura) {
        for (int blancos=1;blancos<=altura-i;blancos++){
            System.out.print(" ");
        }
    }

    private static int getAltura() {
        Scanner sc=new Scanner(System.in);
        int altura;

        do {
            System.out.print("Altura: ");
            altura = sc.nextInt();
            if (altura<=0)
                System.out.print("Error, mínimo 1.");
        }while(altura<=0);
        return altura;
    }
}
