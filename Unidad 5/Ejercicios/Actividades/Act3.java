import java.util.Scanner;

public class Act3{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        double num1,num2,num3;

        System.out.print("Numero 1: ");
        num1 = sc.nextDouble();
        System.out.print("Numero 2: ");
        num2 = sc.nextDouble();
        System.out.print("Numero 3: ");
        num3 = sc.nextDouble();

        if(num1>num2&&num1>num3){
            System.out.println(num1 + " es el mayor.");
        }else if(num2>num1&&num2>num3){
            System.out.println(num2 + " es el mayor");
        }else if(num3>num1&&num3>num2){
            System.out.println(num3 + " es el mayor");
        }else if(num1==num2&&num2==num3){
            System.out.println("Los tres números son iguales");
        }else{
            System.out.println("El número mayor se repite dos veces");
        }
    }
}
