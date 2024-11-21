import java.util.Scanner;
import java.lang.Math;

public class Act19{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double fact, factF;
        int años, infl;

        System.out.print("Factura de este año: ");
        fact = sc.nextDouble();
        System.out.print("¿Dentro de cuántos años quieres ver la factura? ");
        años = sc.nextInt();

        infl = años*3;
        factF = fact + fact * (infl/100.0);

        System.out.printf("Dentro de %d años pagarás %.2f€%n",años,factF);
    }
}
