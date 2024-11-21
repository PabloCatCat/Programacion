import java.util.Scanner;

public class Ejemplo5{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double num1, num2;
        String decision;

        System.out.print("Numero 1: ");
        num1 = sc.nextDouble();
        System.out.print("Numero 2: ");
        num2 = sc.nextDouble();
        System.out.print("Escribe que operacion quieres hacer: sumar, restar, multiplicar o dividir: ");
        decision = sc.next();

        switch(decision.toLowerCase()){
            case "sumar":
                System.out.println("La suma de " + num1 + " + " + num2 + " es " + (num1+num2));
                break;
            case "restar":
                System.out.println("La resta de " + num1 + " - " + num2 + " es " + (num1-num2));
                break;
            case "multiplicar":
                System.out.println("La multiplicacion de " + num1 + " * " + num2 + " es " + (num1*num2));
                break;
            case "dividir":
                System.out.println("La division de " + num1 + " / " + num2 + " es " + (num1/num2));
                break;
            default:
                System.out.println("Operación no valida");
        }
    }
}