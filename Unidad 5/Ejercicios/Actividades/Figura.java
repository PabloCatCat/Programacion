import java.util.Scanner;

public class Figura {
    public static void main(String[] args) {
        int altura;

        altura = getAltura();
        imprimirFigura(altura);
    }

    private static void imprimirFigura(int altura) {
        int alturaAct,asteriscos;

        for (alturaAct=1;alturaAct<=altura;alturaAct++){
            if (alturaAct>=(altura/2)+1){
                for (asteriscos=1;asteriscos<=alturaAct-altura/2;asteriscos++){
                    System.out.print("*");
                }
                System.out.println();
            }else if (altura%2==0){
                for (asteriscos=1;asteriscos<=altura/2-alturaAct+1;asteriscos++){
                    System.out.print("*");
                }
                System.out.println();
            }else {
                for (asteriscos = 1; asteriscos <= altura/2-alturaAct+2; asteriscos++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
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