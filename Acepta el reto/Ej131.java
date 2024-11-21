import java.util.Scanner;

public class Ej131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int piscina, cubo, perdida, piscinaV, cuboV, perdidaV, litros, litrosV, intento = 0, intentoV = 0;

        do {
            do {
                piscina = sc.nextInt();
                cubo = sc.nextInt();
                perdida = sc.nextInt();
                piscinaV = sc.nextInt();
                cuboV = sc.nextInt();
                perdidaV = sc.nextInt();
            } while (perdida > cubo && perdidaV > cuboV);

            if (piscina <= 0 || piscinaV <= 0 || piscina > Math.pow(10, 9) || piscinaV > Math.pow(10, 9) ||
                    cubo <= 0 || cuboV <= 0 || cubo > Math.pow(10, 9) || cuboV > Math.pow(10, 9))
                break;

            if (cubo > perdida && cuboV <= perdidaV) {
                for (litros = 0; litros < piscina; intento++) {
                    litros += cubo;
                    litros -= perdida;
                }
                for (litrosV = 0; litrosV < piscinaV; intentoV++) {
                    if (intentoV > intento)
                        break;
                    litrosV += cuboV;
                    litrosV -= perdidaV;
                }
            } else {
                for (litrosV = 0; litrosV < piscinaV; intentoV++) {
                    litrosV += cuboV;
                    litrosV -= perdidaV;
                }
                for (litros = 0; litros < piscina; intento++) {
                    if (intento > intentoV)
                        break;
                    litros += cubo;
                    litros -= perdida;
                }

                if (intento > intentoV)
                    System.out.println("VECINO " + intentoV);
                else if (intento < intentoV)
                    System.out.println("YO " + intento);
                else
                    System.out.println("EMPATE " + intento);
            }
        }while (piscina >= 1 || piscinaV >= 1 || piscina <= Math.pow(10, 9) || piscinaV <= Math.pow(10, 9)) ;
    }
}