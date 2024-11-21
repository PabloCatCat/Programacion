import java.util.Scanner;

public class Ej155 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base,altura;

        do {
            base=sc.nextInt();
            altura=sc.nextInt();
            if (altura<0||base<0||altura>Math.pow(10,8)||base>Math.pow(10,8))
                break;
            System.out.println((altura*2)+(base*2));
        }while(1==1);
    }
}