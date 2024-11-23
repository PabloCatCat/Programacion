import java.util.Scanner;

public class Act20 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num,cont,numOp;

        System.out.print("Número: ");
        num=sc.nextInt();

        if (num!=0){
            for (cont=0, numOp=num;numOp>0;cont++)
                numOp=numOp/10;

        }else
            cont=1;
        if (cont==1)
            System.out.println(num + " tiene " + cont + " cifra.");
        else
            System.out.println(num + " tiene " + cont + " cifras.");
    }
}
