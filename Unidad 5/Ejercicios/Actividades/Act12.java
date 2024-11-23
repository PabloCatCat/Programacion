import java.util.Scanner;

public class Act12 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int hora,minutos;

        System.out.print("Hora: ");
        hora=sc.nextInt();
        sc.next();
        minutos=sc.nextInt();

        if((hora >= 12) && (hora <= 24))
            System.out.println("Son las " + (hora-12) + ":" + minutos + "PM");
        else if(hora>=0)
            System.out.println("Son las " + hora + ":" + minutos + "AM");
        else
            System.out.println("Hora no válida");


    }
}
