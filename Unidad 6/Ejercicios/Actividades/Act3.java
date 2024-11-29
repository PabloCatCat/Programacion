import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Act3 programa=new Act3();
        programa.inicio();
    }

    private void inicio() {
        int[] numsArray=new int[10];

        getNumsArray(numsArray);
        imprimirResultado(numsArray);
    }

    private void imprimirResultado(int[] numsArray) {
        for (int i= numsArray.length-1;i>=0;i--){
            imprimirArray(numsArray,i);
        }
    }

    private void imprimirArray(int[] numsArray, int i) {
        System.out.print(numsArray[i]+" | ");
    }

    private void getNumsArray(int[] numsArray) {

        for (int i=0;i< numsArray.length;i++){
            getRespuesta(numsArray,i);
        }
    }

    private void getRespuesta(int[] numsArray, int i) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Número: ");
        numsArray[i]=sc.nextInt();
    }
}