import java.util.Scanner;

public class Act22 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num1,num2,cont;

        do {
            System.out.print("Número 1: ");
            num1=sc.nextInt();
            System.out.print("Número 2: ");
            num2=sc.nextInt();
            if (num1>=num2)
                System.out.println("Error, número 1 debe ser menor a número 2");
        }while (num1>=num2);

        for (cont=num1;cont<=num2;cont++){
            if (cont%2==0)
                System.out.print(cont + " ");
        }
    }
}
