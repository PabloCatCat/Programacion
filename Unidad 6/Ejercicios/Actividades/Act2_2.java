public class Act2_2 {
    public static void main(String[] args) {
        Act2_2 programa=new Act2_2();
        programa.inicio();
    }

    private void inicio() {
        int[][] num = getArrayBi(4,5);
        int[] sumaFilas = getArray(4), sumaColumnas=getArray(5);
        int total=0;

        rellenarArray(num);
        total=getSumas(num,sumaColumnas,sumaFilas,total);
        printArray(num,sumaFilas,sumaColumnas,total);
    }

    private int getSumas(int[][] num, int[] sumaColumnas, int[] sumaFilas, int total) {
        getSumaFilasColumnas(num,sumaFilas,sumaColumnas);
        total=getTotal(total,sumaFilas,sumaColumnas);
        return total;
    }

    private int getTotal(int total, int[] sumaFilas, int[] sumaColumnas) {
        for (int i = 0; i < sumaFilas.length; i++) {
            total+=sumaFilas[i];
        }
        for (int i = 0; i < sumaColumnas.length; i++) {
            total+=sumaColumnas[i];
        }
        return total;
    }

    private void getSumaFilasColumnas(int[][] num, int[] sumaFilas, int[] sumaColumnas) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sumaFilas[i] += num[i][j];
                sumaColumnas[j] += num[i][j];
            }

        }
    }


    private int[] getArray(int longitud) {
        return new int[longitud];
    }

    private void printArray(int[][] num,int[] sumaFilas, int[] sumaColumnas, int total) {

        for (int i=0;i< num.length;i++){
            for (int j=0;j<num[i].length;j++){
            printPantalla(num[i][j] + " | ");
            }
            printPantalla(sumaFilas[i] + " |\n");
        }
        for (int i = 0; i < sumaColumnas.length; i++) {
            printPantalla(sumaColumnas[i] + " | ");
        }
        printPantalla(total +" |\n");
    }

    private void printPantalla(String s) {
        System.out.print(s);
    }

    private void rellenarArray(int[][] num) {
        for (int i=0;i< num.length;i++){
            for (int j=0;j<num[i].length;j++){
                num[i][j] = getAleatorio();
            }
        }
    }

    private int getAleatorio() {
        int num;

        do {
            num=(int)(Math.random()*101);
        }while(num%2!=0);
        return num;
    }

    private int[][] getArrayBi(int filas, int columnas) {
        return new int[filas][columnas];
    }
}