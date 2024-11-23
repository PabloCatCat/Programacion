import java.util.Scanner;

public class Act4{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        double num1,num2;

        System.out.print("Dividendo: ");
        num1 = sc.nextDouble();
        System.out.print("Divisor: ");
        num2 = sc.nextDouble();

        if(num1%num2==0){
            System.out.println(num1 + " es divisible entre " + num2);
        }else{
            System.out.println(num1 + " no es divisible entre " + num2);
        }
    }
}
