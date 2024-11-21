import java.util.Scanner;
import java.lang.Math;

public class Ejemplo8{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double radio, perimetro, area, diametro;

        do{
            System.out.print("Radio: ");
            radio = sc.nextDouble();
        }while(radio<=0);

        diametro = (radio*2);
        perimetro = (Math.PI*diametro);
        area = (Math.PI*radio*radio);

        System.out.println("El diametro es " + diametro + ", el area es " + area + " y el perimetro es " + perimetro);


    }
}