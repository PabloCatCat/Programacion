import java.util.Scanner;
import java.lang.Math;

public class Act18{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double cat1,cat2,hip;

        System.out.print("Cateto 1: ");
        cat1 = sc.nextDouble();
        System.out.print("Cateto 2: ");
        cat2 = sc.nextDouble();

        hip=Math.sqrt(cat1*cat1+cat2*cat2);


        System.out.printf("La hipotenusa es %.2f%n",hip);

    }
}
