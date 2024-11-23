import java.util.Scanner;

public class Act10{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int num;

        do {
            System.out.print("Número del 1 al 3: ");
            num = sc.nextInt();
            if(num<1||num>3){
                System.out.println("Error");
            }
        }while(num<1||num>3);


        switch(num){
            case 1:
                System.out.println("Turismo\nImpuesto: 500€");
                break;
            case 2:
                System.out.println("Autobús\nImpuesto: 3000€");
                break;
            case 3:
                System.out.println("Motocicleta\nImpuesto: 300€");
                break;
        }
    }
}
