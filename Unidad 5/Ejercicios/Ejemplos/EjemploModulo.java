import java.util.Scanner;

public class EjemploModulo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;

        do {
            System.out.print("Número: ");
            num=sc.nextInt();
        }while(num<=0);

        if (num%2==0)
            System.out.println("Par");
        else
            System.out.println("Impar");
    }
}