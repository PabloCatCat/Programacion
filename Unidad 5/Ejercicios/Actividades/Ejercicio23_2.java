import java.util.Scanner;

public class Ejercicio23_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int valor;

        System.out.print("Valor: ");
        valor=sc.nextInt();

        for (int linea=1;linea<=valor;linea++){
            if ((valor/2)+1==linea){
                for (;linea<=valor;linea++){
                    for (int blanco=1;blanco<=linea-1;blanco++){
                        System.out.print(" ");
                    }
                    for (int letra=1;letra<=valor-linea+1;letra++){
                        System.out.print("a");
                    }
                    System.out.println();
                }
                break;
            }
            for (int blanco = 1; blanco <= (valor-linea); blanco++) {
                System.out.print(" ");
            }
            for (int letra= 1;letra<=linea;letra++){
                System.out.print("a");
            }
            System.out.println();
        }
    }
}