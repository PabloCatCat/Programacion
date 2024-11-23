public class Aleatorio5 {
    public static void main(String[] args) {
        int suma=0,cont,num,max=100,min=199;

        for (cont=1;cont<=50;cont++){
            num=(int)(Math.random()*(199-100+1)+100);
            suma+=num;
            if (num>max)
                max=num;
            if (num<min)
                min=num;
            System.out.println(num);
        }
        System.out.println("Max: " + max + "\nMin: " + min + "\nMedia: " + (suma/50));
    }
}