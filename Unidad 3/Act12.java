import java.util.Scanner;
import java.lang.Math;

public class Act12{
    public static void main (String [] args){

        double valor,result,peseta;
        peseta=166.39;
        Scanner leer=new Scanner(System.in);

        System.out.println("Introduce la cantida de euros: ");
        valor=leer.nextDouble();
        result=(valor*peseta);
        System.out.println(valor+"€ son "+Math.round(result)+" pesetas.");
    }
}
