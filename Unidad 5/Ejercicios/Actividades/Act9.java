import java.util.Scanner;

public class Act9{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        char letra;

        System.out.print("Letra: ");
        letra = sc.next().charAt(0);

        switch(Character.toUpperCase(letra)){
            case 'A':
                System.out.println("A: Excelente");
                break;
            case 'B':
                System.out.println("B: Notable");
                break;
            case 'C':
                System.out.println("C: Suficiente");
                break;
            case 'D':
                System.out.println("D: Aprobado");
                break;
            case 'E':
                System.out.println("E: Insuficiente");
                break;
            default:
                System.out.println("Letra no válida");
        }
    }
}
