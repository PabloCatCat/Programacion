import java.util.Scanner;

public class Act8{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double horas, salarioB, salarioN;
        final double Irpf=0.12;

        System.out.print("Horas trabajadas: ");
        horas = sc.nextDouble();

        salarioB = (horas*12);
        salarioN = salarioB-(salarioB*Irpf);

        System.out.println("El salario neto son: " + salarioN + "€");

    }
}
