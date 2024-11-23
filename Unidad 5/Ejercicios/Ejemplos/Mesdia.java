import java.util.Scanner;

public class Mesdia {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int mes;

        System.out.println("Número de mes: ");
        mes = sc.nextInt();

        if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
            System.out.println("31 días");
        }else if(mes==2||mes==4||mes==6||mes==9||mes==11){
            System.out.println("30 días");
        }else{
            System.out.println("Número incorrecto");
        }

    }
}
