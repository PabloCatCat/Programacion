import java.util.Scanner;

public class Aleatorio6 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num,numUser,intento=5;

        num=(int)(Math.random()*101);
        
        do {
            System.out.print("Introduce un número entre 0 y 100: ");
            numUser=sc.nextInt();
            if (numUser<0||numUser>100) {
                System.out.println("Error, el número debe estar entre 0 y 100");
            } else if (intento==1) {
                System.out.println("Lo siento, te has quedado sin intentos.");
                break;
            }else if (numUser<num) {
                intento--;
                System.out.println("Error, te quedan " + intento + " intento(s).\nEl número introducido es menor al número secreto");
                System.out.println();
            }else if (numUser>num) {
                intento--;
                System.out.println("Error, te quedan " + intento + " intento(s).\nEl número introducido es mayor al número secreto");
                System.out.println();
            }else
                System.out.println("Enhorabuena, has adivinado el número. Te han quedado " + intento + " intento(s).");
        }while(numUser!=num);
    }
}