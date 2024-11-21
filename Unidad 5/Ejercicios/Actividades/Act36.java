import java.util.Scanner;

public class Act36 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num;


        System.out.print("Número: ");
        num=sc.nextInt();

        for (;num!=0;num/=10)
            System.out.print(num%10);
    }
}