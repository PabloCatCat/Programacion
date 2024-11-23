import java.util.Scanner;

public class Act14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1,num2,resto;

        do {
            System.out.print("Número 1: ");
            num1 = sc.nextInt();
            System.out.print("Número 2: ");
            num2 = sc.nextInt();
            if (num1<=0||num2<=0)
                System.out.println("Error, los números deben ser positivos.");
        }while(num1<=0||num2<=0);
        if (num1>=num2)
            resto=num1-((num1/num2)*num2);
        else
            resto=num2-((num2/num1)*num1);
        System.out.println("Resto: " + resto);
    }
}
