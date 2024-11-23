import java.util.Scanner;

public class Act17 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num1,num2;

        do {
            System.out.print("Número 1: ");
            num1=sc.nextInt();
            System.out.print("Número 2: ");
            num2=sc.nextInt();
            if (num1>=num2)
                System.out.println("Error, número 1 debe ser menor que número 2.");
        }while(num1>=num2);
        //Impresión ascendente
        for(int cont=num1;cont<=num2;cont++){
            System.out.print(cont + " ");
        }
        System.out.println();
        //Impresión descendente
        for(int cont=num2;cont>=num1;cont--){
            System.out.print(cont + " ");
        }
    }
}