import java.util.Scanner;

public class Act16 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num,contP=0,contN=0;

        do {
            System.out.print("Número: ");
            num=sc.nextInt();
            if (num>0)
                contP++;
            else if (num<0)
                contN++;

        }while(num!=0);
        System.out.println("Has introducido " + contP + " números positivos y " + contN + " números negativos.");
    }
}
