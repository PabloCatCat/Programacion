import java.util.Scanner;

public class Figura {
    public static void main(String[] args) {
        Figura programa=new Figura();
        programa.inicio();
    }

    private void inicio() {
        int altura;

        altura = getAltura();
        imprimirFigura(altura);
    }

    private static void imprimirFigura(int altura) {
        int alturaAct;

        for (alturaAct=1;alturaAct<=altura;alturaAct++){
            if (alturaAct>=(altura/2)+1){
                imprimirSegundaMitad(alturaAct,altura);
            }else if (altura%2==0){
                imprimirMitadPar(alturaAct,altura);
            }else {
                imprimirMitadImpar(altura,alturaAct);
            }
        }
    }

    private static void imprimirMitadImpar(int altura, int alturaAct) {
        for (int asteriscos = 1; asteriscos <= altura/2-alturaAct+2; asteriscos++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void imprimirMitadPar(int alturaAct, int altura) {
        for (int asteriscos=1;asteriscos<=altura/2-alturaAct+1;asteriscos++){
            System.out.print("*");
        }
        System.out.println();
    }

    private static void imprimirSegundaMitad(int alturaAct, int altura) {
        for (int asteriscos=1;asteriscos<=alturaAct-altura/2;asteriscos++){
            System.out.print("*");
        }
        System.out.println();
    }

    private static int getAltura() {
        Scanner sc=new Scanner(System.in);
        int altura;

        do {
            System.out.print("Número: ");
            altura = sc.nextInt();
        }while(altura<=0);
        return altura;
    }
}