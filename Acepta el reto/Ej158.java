import java.util.Scanner;

public class Ej158 {

    static Scanner in;

    public static void casoDePrueba() {
        int muros,arriba=0,abajo=0,salto,altura = 0;

        do {
            muros=in.nextInt();

        }while(muros<=0||muros>=Math.pow(10,9));
        for (int leerMur=1;leerMur<=muros;leerMur++){
            if (leerMur==1)
                altura=in.nextInt();
            else{
                salto= in.nextInt();
                if (altura>salto){
                    abajo++;
                    altura=salto;
                }else if (altura<salto){
                    arriba++;
                    altura=salto;
                }
            }
        }
        System.out.println(arriba + " " + abajo);
    }

    public static void main(String[] args) {

        in = new Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}