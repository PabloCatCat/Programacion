import java.util.Scanner;
import java.lang.Math;

public class Act14{
    public static void main (String [] args){

        final double Iva=0.21;
        double precioCoche, precioIva;
        Scanner leer=new Scanner(System.in);


        System.out.println("Introduce el precio del coche: ");
        precioCoche=leer.nextDouble();
        precioIva=(precioCoche+(precioCoche*iva));
        System.out.println("El precio con IVA es "+Math.round(precioIva)+ "€");
    }
}
