import java.util.Scanner;

public class Ej180 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int casos=sc.nextInt();
        for (int i=1;i<=casos;i++){
            prueba();
        }
    }
    private static void prueba(){
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;


        num1=sc.nextInt();
        num2=sc.nextInt();
        num3= sc.nextInt();
        if (num1>=(Math.pow(2,15)-1)||num2>=(Math.pow(2,15)-1)||num3>=(Math.pow(2,15)-1)||num1<0||num2<0||num3<0)
            return;


        if (Math.pow(num1,2)==(Math.pow(num2,2))+(Math.pow(num3,2))||
            Math.pow(num2,2)==(Math.pow(num1,2))+(Math.pow(num3,2))||
            Math.pow(num3,2)==(Math.pow(num2,2))+(Math.pow(num1,2)))
            System.out.println("RECTANGULO");
        else if (num1==num2||num1==num3||num2==num3)
            System.out.println("ACUTANGULO");
    }
}