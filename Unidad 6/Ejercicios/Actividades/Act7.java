import com.sun.scenario.animation.shared.ClipEnvelope;

import java.util.Scanner;

public class Act7 {
    public static void main(String[] args) {
        Act7 programa = new Act7();
        programa.inicio();

    }

    private void inicio() {
        int[] num = new int[100];
        int valor1,valor2;

        asignNumArray(num);
        printArray(num);
        valor1=getValor("Valor 1: ");
        valor2=getValor("Valor 2: ");
        doCambio(num,valor1,valor2);
    }

    private void doCambio(int[] num, int valor1, int valor2) {
        for (int i=0;i< num.length;i++){
            if (num[i]==valor1)
                printPantalla("\""+valor2+"\" | ");
            else if (num[i]/10==valor1&&num[i]%10==valor1)
                printPantalla("\""+valor2+valor2+"\" | ");
            else if (num[i]/10==valor1)
                printPantalla("\""+valor2+(num[i]%10)+"\" | ");
            else if (num[i]%10==valor1)
                printPantalla("\""+(num[i]/10)+valor2+"\" | ");
            else
                printPantalla(num[i]+ " | ");
        }
    }

    private int getValor(String s) {
        Scanner sc=new Scanner(System.in);

        System.out.print(s);
        return sc.nextInt();
    }

    private void printArray(int[] num) {
        for (int i = 0; i < num.length; i++){
            printPantalla(num[i] + " | ");
        }
        System.out.println();
    }

    private void printPantalla(String s) {
        System.out.print(s);
    }

    private void asignNumArray(int[] num) {
        for (int i = 0; i < num.length; i++){
            num[i] = (int) (Math.random() * 21);
        }
    }
}