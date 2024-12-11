public class Act2_2 {
    public static void main(String[] args) {
        Act2_2 programa=new Act2_2();
        programa.inicio();
    }

    private void inicio() {
        int[][] num = getArrayBi(4,5);
        int[] suma = getArray(num[0].length);

        rellenarArray(num);
        printArray(num);
    }

    private int[] getArray(int longitud) {
        return new int[longitud];
    }

    private void printArray(int[][] num) {
        int suma;

        for (int i=0;i< num.length;i++){
            for (int j=0;j<num[i].length;j++){
                printPantalla
            }
        }
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