import java.util.Scanner;

public class Act11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia, ano, mesNum = 0;
        String mes;

        System.out.print("Fecha: ");
        dia = sc.nextInt();
        sc.next();
        mes = sc.next();
        sc.next();
        ano = sc.nextInt();

        switch (mes.toLowerCase()){
            case "enero":
                mesNum = 1;
                break;
            case "febrero":
                mesNum = 2;
                break;
            case "marzo":
                mesNum = 3;
                break;
            case "abril":
                mesNum = 4;
                break;
            case "mayo":
                mesNum = 5;
                break;
            case "junio":
                mesNum = 6;
                break;
            case "julio":
                mesNum = 7;
                break;
            case "agosto":
                mesNum = 8;
                break;
            case "septiembre":
                mesNum = 9;
                break;
            case "octubre":
                mesNum = 10;
                break;
            case "noviembre":
                mesNum = 11;
                break;
            case "diciembre":
                mesNum = 12;
                break;
            default:
                System.out.println("Mes no válido");
        }
        if (mesNum>=1&&mesNum<=12)
            System.out.println(dia+"/"+mesNum+"/"+ano);
    }
}
