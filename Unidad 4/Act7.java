import java.util.Scanner;
import java.lang.Math;

public class Act7{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double precio, precioIva;
        final double Iva=0.21;

        System.out.print("Precio: ");
        precio = sc.nextDouble();

        precioIva = precio+(precio*Iva);

        System.out.println("Factura: " + Math.round(precioIva));



    }
}
