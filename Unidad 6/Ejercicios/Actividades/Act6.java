import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        Act6 programa=new Act6();
        programa.inicio();
    }

    private void inicio() {
        int[] num=new int[15];

        asignarNums(num);
        doRotacion(num);
        imprimirResultado(num);
    }

    private void imprimirResultado(int[] num) {
        for (int i=0;i< num.length;i++){
            imprimirPantalla(num[i] + " | ");
        }
    }

    private void doRotacion(int[] num) {
        int indexCero=num[0];
        for (int i=0;i< num.length;i++){
            if (i==num.length-1)
                num[i]=indexCero;
            else
                num[i]=num[i+1];
        }
    }

    private void asignarNums(int[] num) {
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