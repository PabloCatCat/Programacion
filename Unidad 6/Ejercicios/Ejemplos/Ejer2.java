import java.util.Scanner;

//Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10).
// A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor.
public class Ejer2 {
    public static void main(String[] args) {
        Ejer2 programa= new Ejer2();
        programa.inicio();
    }

    private void inicio() {
        double[] notas=new double[5];

        getNotas(notas);
        imprimirResultado(notas);
    }

    private void imprimirResultado(double[] notas) {
        imprimirNotas(notas);
        imprimirMedia(notas);
        imprimirMayor(notas);
        imprimirMenor(notas);
    }

    private void imprimirMenor(double[] notas) {
        System.out.println(getMenor(notas));
    }

    private double getMenor(double[] notas) {
        double menor=11;
        for (int i=0;i< notas.length;i++){
            if (notas[i]<menor)
                menor=notas[i];
        }
        return menor;
    }

    private void imprimirMayor(double[] notas) {
        System.out.println(getMayor(notas));
    }

    private void imprimirMedia(double[] notas) {
        System.out.printf("%.2f%n",getMedia(notas));
    }

    private double getMedia(double[] notas) {
        double suma=0;
        for (int i=0;i< notas.length;i++){
            suma+=notas[i];
        }
        return (suma / notas.length);
    }

    private double getMayor(double[] notas) {
        double mayor=-1;
        for (int i=0;i< notas.length;i++){
            if (notas[i]>mayor)
                mayor=notas[i];
        }
        return mayor;
    }

    private void imprimirNotas(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (i== notas.length-1)
                System.out.print(notas[i]);
            else
                System.out.print(notas[i] + " | ");
        }
        System.out.println();
    }
    private void getNotas(double[] notas) {
        Scanner sc=new Scanner(System.in);

        for (int i=0;i< notas.length;i++){
            do {
                System.out.print("Nota: ");
                notas[i]=sc.nextDouble();
                if (notas[i]>10||notas[i]<0)
                    System.out.println("Error, la nota debe estar entre 0 y 10");
            }while(notas[i]>10||notas[i]<0);
        }
    }
}