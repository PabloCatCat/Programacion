public class Act1 {
    public static void main(String[] args) {
        Act1 programa=new Act1();
        programa.inicio();
    }

    private void inicio() {
        int[] numArray=new int[12];

        asignarNums(numArray);
        imprimirArray(numArray);
    }

    private void imprimirArray(int[] numArray) {
        String resultado="";
        resultado = getResultado(numArray);
        imprimirResultado(resultado);
    }

    private void imprimirResultado(String resultado) {
        System.out.println(resultado);
    }

    private String getResultado(int[] numArray) {
        String resultado="";
        for (int i=0;i<numArray.length;i++){
            resultado+=numArray[i]+" | ";
        }
        return resultado;
    }

    private void asignarNums(int[] numArray) {
        numArray[0]=39;
        numArray[1]=-2;
        numArray[6]=14;
        numArray[8]=5;
        numArray[9]=120;
    }
}