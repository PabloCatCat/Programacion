import java.util.Scanner;

public class Act13{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double nota1, notaF, nota2;

        System.out.print("Introduce la nota del primer examen: ");
        nota1 = sc.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        notaF = sc.nextDouble();

        nota2 = (notaF - nota1*0.4) / 0.6;

        System.out.printf("Para tener un %.0f en la nota final necesitas sacar un %.2f en el segundo examen.%n",notaF,nota2);

    }
}
