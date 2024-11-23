import java.util.Scanner;

public class Act31 {
    public static void main(String[] args) {
        int num;

        do {
            num = getNum();
        }while(!isPositivo(num));

        if (isPrimo(num))
            imprimirResultado(num+" es par");
        else
            imprimirResultado(num + " es impar");
        }

    private static void imprimirResultado(String s) {
        System.out.println();
    }

    private static boolean isPrimo(int num) {
        int cont = (num - 1);

        while (num%cont!=0){
            cont--;
        }
        if (cont==0)
            return true;
        else
            return false;
    }

    private static boolean isPositivo(int num) {
        if (num<=0)
            return false;
        else
            return true;
    }

    private static int getNum() {
        Scanner sc=new Scanner(System.in);

        System.out.print("Número: ");
        return(sc.nextInt());
    }
}