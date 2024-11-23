import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num, divisor, divisorPrimo;

        System.out.print("Número: ");
        num=sc.nextInt();

        for (divisor=num;divisor>0;divisor--){

            if (num%divisor==0) {
                if (divisor!=1)
                    divisorPrimo=(divisor-1);
                else
                    divisorPrimo=divisor;
                while (divisor%divisorPrimo !=0)
                    divisorPrimo--;
                if (divisorPrimo==1)
                    System.out.print(divisor + " ");
            }
        }
    }
}