import java.util.Scanner;

public class Act23 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num,cont,acum;

        System.out.print("Número: ");
        num=sc.nextInt();

        for (cont=1;cont<=num;cont++){
            for (acum=1;acum<=cont;acum++) {
                System.out.print("a");
            }
            System.out.println();
        }
    }
}
