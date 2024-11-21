public class Ej116 {

    static java.util.Scanner in;

    public static void casoDePrueba() {
        System.out.println("Hola mundo.");
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}