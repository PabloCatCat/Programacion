import java.util.Scanner;

public class Act6{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        double precioProd, precioMax;

        do{
            System.out.print("Precio producto: ");
            precioProd = sc.nextDouble();
            System.out.print("Precio máximo: ");
            precioMax = sc.nextDouble();
            if(precioProd<0.01||precioMax<0.01){
                System.out.println("Error, los precios deben ser números positivos");
            }
        }while(precioProd<0.01||precioMax<0.01);

        if(precioProd>precioMax){
            System.out.printf("Descuento del 10%%, el precio total es %.2f€%n",(precioProd*0.90));
        }else{
            System.out.printf("Descuento del 5%%. El precio total es %.2f€%n",(precioProd*0.95));
        }
    }
}
