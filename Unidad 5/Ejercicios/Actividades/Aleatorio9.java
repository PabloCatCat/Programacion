public class Aleatorio9 {
    public static void main(String[] args) {

        int num,cont=0;

        do {
           num=(int)(Math.random()*101);
           if (num%2==0){
               System.out.println(num);
                cont++;
           }
           if (num==24) {
               System.out.println("Se han imprimido " + cont + " número(s)");
           }
        }while(num!=24);
    }
}
