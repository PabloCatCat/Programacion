import java.util.Scanner;

public  class Act8 {
    public static void main(String[] args) {
        Act8 programa=new Act8();
        programa.inicio();
    }

    private void inicio() {
        double[] temperaturas = getArray(12);
        getTemperaturas(temperaturas);
        imprimirDiagrama(temperaturas);
    }

    private void imprimirDiagrama(double[] temperaturas) {
        String mes;

        for (int i=0;i< temperaturas.length;i++){
            mes=getMes(i);
            printPantalla(mes + "\n");
            imprimirlineas(temperaturas,i);
            System.out.println();
        }
    }

    private void imprimirlineas(double[] temperaturas, int i) {
        for (int l=1;l<=3;l++){
            imprimirCaracteres(temperaturas,i);
            System.out.println();
        }
    }

    private void imprimirCaracteres(double[] temperaturas,int i) {
        for (int linea=1;linea<=temperaturas[i];linea++){
            printPantalla("*");
        }
    }

    private void getTemperaturas(double[] temperaturas) {
        String mes;
        for (int i=0;i< temperaturas.length;i++){
            mes=getMes(i);
            temperaturas[i] = getRespuesta(mes);
        }
    }

    private double getRespuesta(String mes) {
        Scanner sc=new Scanner(System.in);
        printPantalla("Temperatura media " + mes + ": ");
        return sc.nextDouble();
    }

    private void printPantalla(String s) {
        System.out.print(s);
    }

    private String getMes(int i) {
        switch (i){
            case 0:
               return "enero";
            case 1:
                return "febrero";
            case 2:
                return "marzo";
            case 3:
                return "abril";
            case 4:
                return "mayo";
            case 5:
                return "junio";
            case 6:
                return "julio";
            case 7:
                return "agosto";
            case 8:
                return "septiembre";
            case 9:
                return "octubre";
            case 10:
                return "noviembre";
            default:
                return "diciembre";

        }
    }

    private double[] getArray(int l) {
        return new double[l];
    }
}