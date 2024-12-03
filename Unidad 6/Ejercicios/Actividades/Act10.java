public class Act10 {
    public static void main(String[] args) {
        Act10 programa=new Act10();
        programa.inicio();
    }

    private void inicio() {
        int[] num = getArray(20);
        int[] numOrdenado = getArray(20);

        getNumArray(num);
        printArray(num);
        getArrayOrdenado(num,numOrdenado);
        printArray(numOrdenado);
    }

    private void getArrayOrdenado(int[] num, int[] numOrdenado) {
        int cont=0;
        for (int i=0;i< num.length;i++){
            if (num[i]%2==0) {
                numOrdenado[cont]=num[i];
                cont++;
            }
        }
        for (int i=0;i<num.length;i++){
            if (num[i]%2!=0){
                numOrdenado[cont]=num[i];
                cont++;
            }
        }
    }

    private void printArray(int[] num) {
        for (int i=0;i< num.length;i++){
            printPantalla(num[i] + " ");
        }
        System.out.println();
    }

    private void printPantalla(String s) {
        System.out.print(s);
    }

    private void getNumArray(int[] num) {
        for (int i=0;i< num.length;i++){
            num[i] = getRandom();
        }
    }

    private int getRandom() {
        return (int)(Math.random()*101);
    }

    private int[] getArray(int l) {
        return new int[l];
    }
}