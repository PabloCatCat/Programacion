import java.util.Scanner;

public class Ejemplo1_2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num;
        String mensaje;

        System.out.print("Número: ");
        num = sc.nextInt();

        mensaje = (num%2==0) ? num + " es par." : num + " es impar.";
        
        System.out.println(mensaje);
    }
}