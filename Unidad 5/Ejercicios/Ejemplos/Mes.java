import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numMes;

        System.out.println("Número de mes: ");
        numMes = sc.nextInt();

        if(numMes==1){
            System.out.println("Enero");
        }else if(numMes==2){
            System.out.println("Febrero");
        }else if(numMes==3){
            System.out.println("Marzo");
        }else if(numMes==4){
            System.out.println("Abril");
        }else if(numMes==5){
            System.out.println("Mayo");
        }else if(numMes==6){
            System.out.println("Junio");
        }else if(numMes==7){
            System.out.println("Julio");
        }else if(numMes==8){
            System.out.println("Agosto");
        }else if(numMes==9){
            System.out.println("Septiembre");
        }else if(numMes==10){
            System.out.println("Octubre");
        }else if(numMes==11){
            System.out.println("Noviembre");
        }else if(numMes==12){
            System.out.println("Diciembre");
        }else{
            System.out.println("Número no válido");
        }












    }
}
