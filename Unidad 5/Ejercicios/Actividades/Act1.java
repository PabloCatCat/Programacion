import java.util.Scanner;

public class Act1{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        double num1, num2;

        System.out.print("Número 1: ");
        num1=sc.nextDouble();
        System.out.print("Número 2: ");
        num2=sc.nextDouble();

        if(num1==num2){
            System.out.println(num1 + " y " + num2 + " son iguales.");
        }else{
            System.out.println(num1 + " y " + num2 + " no son iguales.");
        }

    }
}
