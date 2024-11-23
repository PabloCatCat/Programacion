import java.util.Scanner;

public class Act18 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num1,num2,cont;

        do {
            System.out.print("Número 1: ");
            num1=sc.nextInt();
            System.out.print("Número 2: ");
            num2=sc.nextInt();
            if (num1>=num2)
                System.out.println("Error, número 1 debe ser menor que número 2.");
        }while(num1>=num2);
        cont=num1;
        while(cont<=num2){
            if (cont%num1==0)
                System.out.print(cont + " ");
            cont++;
        }
        cont=num2;
        System.out.println();
        while(cont>=num1){
            if (cont%num1==0)
                System.out.print(cont + " ");
            cont--;
        }
    }
}