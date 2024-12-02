import java.util.Scanner;

public class Aleatorio16 {
    public static void main(String[] args) {
        Aleatorio16 programa=new Aleatorio16();
        programa.inicio();
    }

    private void inicio() {
        int euros;
        String figura1 = "", figura2 = "", figura3 = "", respuesta = "";

        euros=getEuros();

        System.out.println();

        do {
            euros--;
            for (int tir = 1; tir <= 3; tir++) {
                if (tir == 1)
                    figura1 = getFigura();
                else if (tir == 2)
                    figura2 = getFigura();
                else
                    figura3 = getFigura();
            }
            System.out.println(figura1 + " " + figura2 + " " + figura3);
            euros = getResultado(euros,figura1,figura2,figura3);

            if(euros>0){
                do {
                    System.out.println("Tienes " + euros + "€");
                    respuesta=getRespuesta();
                }while(!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no"));
                System.out.println();
            }
        }while (euros > 0 && respuesta.equalsIgnoreCase("si"));
        if (euros>0)
            System.out.println("Has acabado con " + euros + "€");
        else
            System.out.println("Te has quedado sin dinero.");
    }

    private int getResultado(int euros, String figura1, String figura2, String figura3) {
        if (figura1.equals(figura2) && figura1.equals(figura3)){
            System.out.println("Enhorabuena, has ganado 10 euros");
           return  euros+=10;
        }
        else if (figura1.equals(figura2) || figura1.equals(figura3) || figura2.equals(figura3)) {
            System.out.println("Bien, has recuperado tu euro.");
            return euros+=1;
        }
        else{
            System.out.println("Lo siento, ha perdido");
            return euros;
        }
    }

    private static String getRespuesta() {
        Scanner sc=new Scanner(System.in);


        System.out.println("¿Quieres continuar?");
        String respuesta=sc.next();
        if (!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no"))
            System.out.println("Error, escribe si o no");
        return respuesta;
    }

    private static String getFigura() {
        int figuraNum = (int) (Math.random() * 5 + 1);
        switch (figuraNum) {
            case 1:
                return "corazón";
            case 2:
                return "diamante";
            case 3:
                return "herradura";
            case 4:
                return "campana";
            default:
                return "limón";
        }
    }

    private static int getEuros() {
        Scanner sc=new Scanner(System.in);
        int euros;

        do {
            System.out.print("Introduce euros: ");
            euros = sc.nextInt();
        }while(euros<=0);
        return euros;
    }
}