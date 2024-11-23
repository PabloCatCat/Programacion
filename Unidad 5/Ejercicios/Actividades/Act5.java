import java.util.Scanner;

public class Act5{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        char letra;

        System.out.print("Introduce una letra: ");
        letra = sc.next().charAt(0);

        switch(letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letra + " es una vocal.");
               break;
            default:
                System.out.println(letra + " no es una vocal");
        }
    }
}
