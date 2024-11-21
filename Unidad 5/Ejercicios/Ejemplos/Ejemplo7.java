import java.util.Scanner;

public class Ejemplo7{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int longit, cont=1;
        String letra;

        System.out.print("Longitud: ");
        longit = sc.nextInt();
        System.out.print("Letra: ");
        letra = sc.next();

        while(cont<=longit){
            System.out.print(letra);
            cont++;
        }
    }
}