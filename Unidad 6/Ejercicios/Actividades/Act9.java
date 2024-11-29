import java.util.Scanner;

public class Act9 {
    public static void main(String[] args) {
        Act9 programa=new Act9();
        programa.inicio();
    }

    private void inicio() {
        int[] numArray=new int[8];

        getNumArray(numArray);
        printResultado(numArray);

    }

    private void printResultado(int[] numArray) {
        for (int i=0;i< numArray.length;i++){
            printParImpar(numArray,i);
        }
    }

    private void printParImpar(int[] numArray, int i) {
        if (numArray[i]%2==0)
            System.out.print(numArray[i] + " Par | ");
        else
            System.out.print(numArray[i] + " Impar | ");

    }

    private void getNumArray(int[] numArray) {
        for (int i=0;i< numArray.length;i++){
            numArray[i]=getValor(i);
        }
    }

    private int getValor(int i) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Número " + (i+1) + ": ");
        return sc.nextInt();
    }
}