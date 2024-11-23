import java.util.Scanner;

public class Act38 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int altura, alturaAct,asterisco;

        System.out.print("Altura: ");
        altura=sc.nextInt();

        for (alturaAct=1;alturaAct<=altura;alturaAct++){
            if (alturaAct==altura){
                for (asterisco=1;asterisco<=(altura/2)+1;asterisco++){
                    System.out.print("* ");
                }
                break;
            }
            System.out.println("*");
        }
        System.out.println();
    }
}