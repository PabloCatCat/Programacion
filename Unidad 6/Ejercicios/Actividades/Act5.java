import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Act5 programa=new Act5();
        programa.inicio();
    }

    private void inicio() {
        int[] num=new int[10];

        asignarNumsArray(num);
        imprimirNumArray(num);
    }

    private void imprimirNumArray(int[] num) {
        int mayor=getMayor(num);
        int menor=getMenor(num);

        for (int i=0;i< num.length;i++){
            if (num[i]==mayor)
                imprimirPantalla("Max: " + num[i] + " | ");
            else if (num[i]==menor)
                imprimirPantalla("Min: " + num[i] + " | ");
            else
                imprimirPantalla(num[i] + " | ");
        }
    }

    private int getMenor(int[] num) {
        int menor=Integer.MAX_VALUE;

        for (int i=0;i< num.length;i++){
            if (num[i]<menor)
                menor=num[i];
        }
        return menor;
    }

    private int getMayor(int[] num) {
        int mayor=Integer.MIN_VALUE;
        for(int i=0;i< num.length;i++){
            if (num[i]>mayor)
                mayor=num[i];
        }
        return mayor;
    }

    private void asignarNumsArray(int[] num) {
        for (int i=0;i< num.length;i++){
            num[i]=getNum(i);
        }
    }

    private int getNum(int i) {
        Scanner sc=new Scanner(System.in);

        imprimirPantalla("Número " + (i+1) + ": ");
        return sc.nextInt();
    }

    private void imprimirPantalla(String s) {
        System.out.print(s);
    }
}