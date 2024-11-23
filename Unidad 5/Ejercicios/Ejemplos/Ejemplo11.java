import java.util.Scanner;

public class Ejemplo11{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int num,cont;

        System.out.print("Número: ");
        num=sc.nextInt();

        for(cont=1;cont<11;cont++){
            System.out.println(num + "*" + cont + " = " + (num*cont));
        }
    }
}
