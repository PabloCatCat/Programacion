import java.util.Scanner;

public class Act40 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int cont=1,suma=0,num,numOp;

        System.out.print("Número: ");
        num=sc.nextInt();

        for (numOp=num;numOp!=0;numOp/=10) {
            if ((numOp/10)==0)
                break;
            cont*=10;
        }
        System.out.print("Pares: ");
        for (numOp=num;cont!=0;cont/=10) {
            if (numOp/cont!=0)
                if ((numOp / cont) % 2 == 0) {
                    System.out.print((numOp / cont) + " ");
                    suma += numOp / cont;
                }

            numOp %= cont;
        }
        System.out.println();
        System.out.println("Suma: " + suma);
    }
}