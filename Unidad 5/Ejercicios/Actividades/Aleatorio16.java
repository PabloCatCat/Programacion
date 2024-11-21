import java.util.Scanner;

public class Aleatorio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int figuraNum, euros;
        String figura = "", figura1 = "", figura2 = "", figura3 = "", respuesta = "";

        do {
            System.out.print("Introduce euros: ");
            euros = sc.nextInt();
        }while(euros<=0);

        System.out.println();

        do {
            euros--;
            for (int tir = 1; tir <= 3; tir++) {
                figuraNum = (int) (Math.random() * 5 + 1);
                switch (figuraNum) {
                    case 1:
                        figura = "corazón";
                        break;
                    case 2:
                        figura = "diamante";
                        break;
                    case 3:
                        figura = "herradura";
                        break;
                    case 4:
                        figura = "campana";
                        break;
                    case 5:
                        figura = "limón";
                        break;
                }
                if (tir == 1)
                    figura1 = figura;
                else if (tir == 2)
                    figura2 = figura;
                else
                    figura3 = figura;
            }
            System.out.println(figura1 + " " + figura2 + " " + figura3);
            if (figura1.equals(figura2) && figura1.equals(figura3)){
                System.out.println("Enhorabuena, has ganado 10 euros");
                euros+=10;
            }
            else if (figura1.equals(figura2) || figura1.equals(figura3) || figura2.equals(figura3)) {
                System.out.println("Bien, has recuperado tu euro.");
                euros++;
            }
            else{
                System.out.println("Lo siento, ha perdido");
            }
            System.out.println("Tienes " + euros + "€");
            if(euros>0){
                do {
                    System.out.println("¿Quieres continuar?");
                    respuesta=sc.next();
                    if (!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no"))
                        System.out.println("Error, escribe si o no");
                }while(!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no"));
                System.out.println();
            }
        }while (euros > 0&&respuesta.equalsIgnoreCase("si"));
        System.out.println("Has acabado con " + euros + "€");
    }
}