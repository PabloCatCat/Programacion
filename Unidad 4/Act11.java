import java.util.Scanner;
import java.lang.Math;

public class Act11{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int kb;
        double mb;

        System.out.print("Kilobits: ");
        kb = sc.nextInt();

        mb = (double)kb/1024;

        System.out.printf("%d kilobits son %.2f megabits.%n",kb,mb);

    }
}
