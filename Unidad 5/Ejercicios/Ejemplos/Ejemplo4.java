import java.util.Scanner;

public class Ejemplo4{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.print("Nota: ");
        nota = sc.nextDouble();

        if(nota>10){
            System.out.println("Nota no valida.");
        }
        else if(nota>=8){
           System.out.println("Sobresaliente."); 
        }
        else if(nota>=7){
            System.out.println("Notable.");
        }
        else if(nota>=6){
            System.out.println("Bien.");
        }
        else if(nota>=5){
            System.out.println("Suficiente.");
        }
        else if(nota>=0){
            System.out.println("Insuficiente");
        }
        else {
            System.out.println("Nota no valida.");
        }
    }
}