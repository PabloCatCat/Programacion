import java.util.Scanner;

public class Ejemplo3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.print("Hora: ");
        hora = sc.nextInt();

        if(hora>24){
            System.out.println("Hora no valida.");
        }
        else if(hora>20){
           System.out.println("Buenas noches."); 
        }
        else if(hora>12){
            System.out.println("Buenas tardes.");
        }
        else if(hora>6){
            System.out.println("Buenos dias.");
        }
        else if(hora>=0){
            System.out.println("Buenas noches.");
        }
        else {
            System.out.println("Hora no valida");
        }
    }
}