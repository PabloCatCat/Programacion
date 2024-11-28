public class Act1 {
    public static void main(String[] args) {
        Act1 programa=new Act1();
        programa.inicio();
    }

    private void inicio() {
        int[] numsArray= crearArrayEntero(12);
    }

    private int[] crearArrayEntero(int l) {
        return new int[l];
    }
}