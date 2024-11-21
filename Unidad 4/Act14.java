import java.util.Scanner;

public class Act14{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int niños,niñas;
        double niñosP, niñasP;

        System.out.print("Niños: ");
        niños = sc.nextInt();
        System.out.print("Niñas: ");
        niñas = sc.nextInt();

        niñosP = niños*100/((double)niños+niñas);
        niñasP = 100 - niñosP;

        System.out.printf("Un %.2f%% son niños y un %.2f%% son niñas.%n",niñosP,niñasP);

    }
}
