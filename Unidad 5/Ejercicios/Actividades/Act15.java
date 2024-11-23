import java.util.Scanner;

public class Act15 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double num;

        System.out.print("Número: ");
        num=sc.nextDouble();

        if (num>=0)
            System.out.println(num + " es positivo.");
        else
            System.out.println(num + " es negativo.");

    }
}
