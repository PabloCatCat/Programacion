import java.util.Scanner;

public class Ejemplo9{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num,cont=0;


        do{
           System.out.print("Número: ");
            num = sc.nextInt();
            cont++;

        }while(num<1||num>10);

        if(cont==1){
            System.out.println("Lo has intentado " + cont + " vez.");
        }else{
            System.out.println("Lo has intentado " + cont + " veces.");
        }
    }
}
