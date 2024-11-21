import java.util.Scanner;

public class Aleatorio14 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num ,intentos=5,min=0,max=100;
        String respuesta1,respuesta2;

        do {

            //Generación de número
            num=(int)(Math.random()*(max-min+1)+min);

            //Repetir pregunta si la respuesta es incorrecta
            do {
                System.out.println("¿Es " + num + " el número que estás pensando?");
                respuesta1=sc.next();
                if (!respuesta1.equalsIgnoreCase("si")&&!respuesta1.equalsIgnoreCase("no"))
                    System.out.println("No te he entendido, dime sí o no.");
            }while (!respuesta1.equalsIgnoreCase("si")&&!respuesta1.equalsIgnoreCase("no"));

            //Resolución en función de la respuesta
            if (respuesta1.equalsIgnoreCase("no")) {
                intentos--;
                if (intentos==0) {
                    System.out.println("Se me acabaron los intentos.");
                    break;
                }
                do {
                    System.out.println("¿El número que estas pensando es mayor o menor a " + num + " ?");
                    respuesta2=sc.next();
                    if (!respuesta2.equalsIgnoreCase("mayor")&&!respuesta2.equalsIgnoreCase("menor"))
                        System.out.println("No te he entendido, escribe mayor o menor. ");
                }while (!respuesta2.equalsIgnoreCase("mayor")&&!respuesta2.equalsIgnoreCase("menor"));
                if (respuesta2.equalsIgnoreCase("mayor"))
                    min=num;
                else
                    max=num;
                System.out.println("Me quedan " + intentos + " intento(s).");
                System.out.println();
            } else
                System.out.println("Lo adiviné :D");
        }while(!respuesta1.equalsIgnoreCase("si"));

    }
}
