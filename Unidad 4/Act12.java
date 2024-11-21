import java.util.Scanner;

public class Act12{
    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    String nombre;
    int año, edad;

    System.out.print("Nombre: ");
    nombre=sc.nextLine();
    System.out.print("Año de nacimiento: ");
    año=sc.nextInt();

    edad = 2024-año;

    System.out.println("Tienes " + edad + " o " + edad-- + " años.");

    }
}
