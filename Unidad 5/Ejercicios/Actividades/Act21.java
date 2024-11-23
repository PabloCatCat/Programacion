import java.util.Scanner;

public class Act21 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num,cont,acum = 0;

        System.out.print("Número: ");
        num=sc.nextInt();

        for (cont=0;acum<num;cont++) {
            System.out.print(cont + " ");
            acum += cont;
            if (acum + (cont + 1) > num) {
                System.out.println();
                break;
            }
        }
        System.out.println("La suma es " + acum);
    }
}
