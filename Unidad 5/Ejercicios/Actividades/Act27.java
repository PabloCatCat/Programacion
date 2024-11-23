import java.util.Scanner;

public class Act27 {
    public static void main(String[] args) {
        Act27 programa=new Act27();
        programa.inicio();


    }

    private void inicio() {
        int num,max,min;
        boolean fin=false;

        max=min=num=getNumero();
        if (isPositivo(num)){
            do {
                num = getNumero();
                if (isPositivo(num)){
                    max=getMayor(num,max);
                    min=getMenor(num,min);

                }else
                    fin=true;
            }while(!fin);
            imprimirPantalla("Mayor: " + max + "\n");
            imprimirPantalla("Menor: " + min + "\n");
        }else
            imprimirPantalla("No se ha introducido ningún número\n");


    }

    private int getMenor(int num, int min) {
        return Math.min(num, min);

    }

    private int getMayor(int num, int max) {
        return Math.max(num, max);
    }

    private static int getNumero() {
        Scanner sc=new Scanner(System.in);

        imprimirPantalla("Introduce un número: ");
        return sc.nextInt();
    }

    private static void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private static boolean isPositivo(int num){
        return num >= 0;
    }
}