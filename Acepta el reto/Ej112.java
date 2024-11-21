public class Ej112 {

    static java.util.Scanner sc;

    public static void main(String[] args) {

        sc = new java.util.Scanner(System.in);
        int distancia,limite,tiempo;
        double velocidad;

        do {
            distancia=sc.nextInt();
            limite= sc.nextInt();
            tiempo=sc.nextInt();

            if (distancia==0&&limite==0&&tiempo==0)
                break;

            velocidad=((distancia/(double)tiempo)*3.6);

            if (distancia<0||limite<0||tiempo<0)
                System.out.println("ERROR");
            else if (velocidad<=limite)
                System.out.println("OK");
            else if (velocidad<(limite*1.2))
                System.out.println("MULTA");
            else
                System.out.println("PUNTOS");
        }while(distancia!=0&&limite!=0&&tiempo!=0);
    }
}