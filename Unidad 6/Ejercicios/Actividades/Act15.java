import java.util.Scanner;

public class Act15 {
    public static void main(String[] args) {
        Act15 programa=new Act15();
        programa.inicio();
    }

    private void inicio() {
        int[] num = getArray();
        
        getNumsArray(num);
        double mediaPositivos = getMediaPositivos(num);
        double mediaNegativos = getMediaNegativos(num);
        int numCeros = getCeros(num);
        System.out.println();
        System.out.printf("Media positivos: %.2f%nMedia negativos: %.2f%nCantidad de ceros: %d",mediaPositivos,mediaNegativos,numCeros);
    }

    private int getCeros(int[] num) {
        int ceros=0;
        for (int i=0;i< num.length;i++){
            if (num[i]==0){
                ceros++;
            }
        }
        return ceros;
    }

    private double getMediaNegativos(int[] num) {
        int totalNegativos=0, numNegativos=0;


        for (int i=0;i< num.length;i++){
            if (num[i]<0){
                totalNegativos+=num[i];
                numNegativos++;
            }
        }
        return ((double)totalNegativos/numNegativos);
    }

    private double getMediaPositivos(int[] num) {
        int totalPositivos=0, numPositivos=0;


        for (int i=0;i< num.length;i++){
            if (num[i]>0){
                totalPositivos+=num[i];
                numPositivos++;
            }
        }
        return ((double)totalPositivos/numPositivos);
    }

    private void getNumsArray(int[] num) {
        Scanner sc=new Scanner(System.in);
        
        for (int i=0;i< num.length;i++){
            printPantalla("Número " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }
    }

    private int[] getArray() {
        return new int[getLongitud()];
    }

    private int getLongitud() {
        Scanner sc=new Scanner(System.in);
        printPantalla("Cantidad de números a leer: ");
        return sc.nextInt();
    }

    private void printPantalla(String s) {
        System.out.print(s);
    }
}