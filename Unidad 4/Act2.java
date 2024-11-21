import java.util.Scanner;

public class Act2{
    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    double euros;
    int pesetas;

    System.out.print("Introduce los euros: ");
    euros=sc.nextDouble();

    pesetas=(int)Math.round(euros)*166;

    System.out.println(euros+"€ son "+pesetas+" pesetas.");
    }
}
