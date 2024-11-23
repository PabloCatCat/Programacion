import java.util.Scanner;

public class Act5_19 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num,cont;

        do {
            System.out.print("Número: ");
            num=sc.nextInt();
            if (num<=1)
                System.out.println("Error, el número debe ser mayor a 1");
        }while (num<=1);
        for (cont=num;num%cont!=0||cont==num;cont--){}
        if (cont!=1)
            System.out.println(cont);
        else
            System.out.println("No tiene divisores diferentes a 1");
    }
}
