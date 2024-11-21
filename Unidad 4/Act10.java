import java.util.Scanner;
import java.lang.Math;

public class Act10{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int mb, kb;

        System.out.print("Megabits: ");
        mb = sc.nextInt();

        kb = mb*1024;

        System.out.printf("%d megabits son %d kilobits. %n",mb,kb);

    }
}
