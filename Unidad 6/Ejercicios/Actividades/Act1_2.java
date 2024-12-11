public class Act1_2 {
    public static void main(String[] args) {
        Act1_2 programa=new Act1_2();
        programa.inicio();
    }

    private void inicio() {
        int[][] num= getArrayBi(3,6);
        asignarNums(num);
        printArray(num);
    }

    private void printArray(int[][] num) {
        printInterfaz(num);
        for (int i=0;i< num.length;i++){
            printPantalla("Fila " + i + "    | ");
            for (int j=0;j<num[i].length;j++){
                System.out.printf("%9d | ",num[i][j]);
            }
            System.out.println();
        }
    }

    private void printInterfaz(int[][] num) {
        printPantalla("Array num | ");
        for (int i=0;i< num[0].length;i++){
            printPantalla("Columna " + i + " | ");
        }
        System.out.println();
    }

    private void printPantalla(String s) {
        System.out.print(s);
    }

    private void asignarNums(int[][] num) {
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

    }

    private int[][] getArrayBi(int filas, int columnas) {
        return new int[filas][columnas];
    }
}