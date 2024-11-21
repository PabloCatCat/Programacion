public class Aleatorio13 {
    public static void main(String[] args) {
        int num1,num2,intentos=0;
        do {
            num1=(int)(Math.random()*(6-1+1)+1);
            num2=(int)(Math.random()*(6-1+1)+1);
            intentos++;
            System.out.println("Dado 1: " + num1 + "\nDado 2: " + num2);
            System.out.println();
        }while(num1!=num2);
        System.out.println("Intentos: " + intentos);
    }
}
