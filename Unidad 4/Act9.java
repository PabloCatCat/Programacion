import java.util.Scanner;
import java.lang.Math;

public class Act9{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double radio, altura, volumen;


        System.out.print("Radio: ");
        radio = sc.nextDouble();
        System.out.print("Altura: ");
        altura = sc.nextDouble();


        volumen = (Math.PI*radio*radio*altura)/3;

        System.out.printf("Volumen: %1$.1f%n",volumen);

    }
}
