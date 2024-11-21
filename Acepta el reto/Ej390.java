public class Ej390 {

    static java.util.Scanner in;

    public static void casoDePrueba() {
        int num,cont,suma=0;

        num=in.nextInt();

        for (cont=1;cont<=num;cont++){
            suma+=cont;
        }
        if (suma%3==0)
            System.out.println("SI");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}