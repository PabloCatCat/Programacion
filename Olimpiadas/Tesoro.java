package Olimpiadas;

import java.util.Scanner;

public class Tesoro {
    public static void main(String[] args) {
        Tesoro programa=new Tesoro();
        programa.inicio();
    }

    private void inicio() {
        int vampiro, tesoro,posicion=0;

        vampiro=getNumero();
        do {
            tesoro=getNumero();
        }while(tesoro==vampiro);

        do {
            posicion = getPosicion(posicion);

        }while(posicion!=vampiro&&posicion!=tesoro);
        imprimirResultado(posicion,vampiro);
    }

    private void imprimirResultado(int posicion, int vampiro) {
        if (posicion==vampiro)
            System.out.println("Te ha mordido el vampiro");
        else
            System.out.println("Has encontrado el tesoro!!");
    }

    private int getPosicion(int posicion) {
        char cardinal;

        System.out.println("Estás en la habitación: " + posicion);
        if (posicion==0){
            cardinal=getRespuesta(posicion,'N','E');
            if (Character.toLowerCase(cardinal)=='n'){
                imprimirDireccion("Norte",3);
                return 3;
            }else{
                imprimirDireccion("Este",1);
                return 1;
            }
        }else if (posicion==1){
            cardinal=getRespuesta(posicion,'O','E');
            if (Character.toLowerCase(cardinal)=='o'){
                imprimirDireccion("Oeste",0);
                return 0;
            }else{
                imprimirDireccion("Este",2);
                return 2;
            }
        }else if (posicion==2){
            cardinal=getRespuesta(posicion,'O','N');
            if (Character.toLowerCase(cardinal)=='o'){
                imprimirDireccion("Oeste",1);
                return 1;
            }else{
                imprimirDireccion("Norte",5);
                return 5;
            }
        }else if (posicion==3){
            cardinal=getRespuesta(posicion,'S','E');
            if (Character.toLowerCase(cardinal)=='s'){
                imprimirDireccion("Sur",0);
                return 0;
            }
            else{
                imprimirDireccion("Este",4);
                return 4;
            }
        }else if (posicion==4){
            cardinal=getRespuesta(posicion,'E','E');
            return 3;
        }else{
            cardinal=getRespuesta(posicion,'S','S');
            return 2;
        }
    }

    private void imprimirDireccion(String direccion, int posicion) {
        System.out.println("Has escogido la dirección: " + direccion + "\nY te mueves a la habitación: " + posicion + "\n");
    }

    private char getRespuesta(int posicion, char pos1,char pos2) {
        Scanner sc=new Scanner(System.in);
        char cardinal;

        if (posicion==4||posicion==5){
            do {
                System.out.print("¿A dónde quieres ir? [\"" + pos1 + "\"] > ");
                cardinal=sc.next().charAt(0);
            }while(Character.toUpperCase(cardinal)!=pos1);
        }else{
            do {
                System.out.print("¿A dónde quieres ir? [\"" + pos1 + "\", \"" + pos2 + "\"] > ");
                cardinal=sc.next().charAt(0);
            }while(Character.toUpperCase(cardinal)!=pos1&&Character.toUpperCase(cardinal)!=pos2);
        }
        return cardinal;


    }

    private int getNumero() {
        return (int)((Math.random()*5)+1);
    }
}