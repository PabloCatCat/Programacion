import static java.lang.String.valueOf;

public class Aleatorio11 {
    public static void main(String[] args) {
        int nota,insu=0,sufi=0,bien=0,notable=0,sobre=0;
        for (int  cont=1;cont<=20;cont++){
            nota=(int)(Math.random()*11);
            switch (nota){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Insuficiente");
                    insu++;
                    break;
                case 5:
                    System.out.println("Suficiente");
                    sufi++;
                    break;
                case 6:
                    System.out.println("Bien");
                    bien++;
                    break;
                case 7:
                case 8:
                    System.out.println("Notable");
                    notable++;
                    break;
                case 9:
                case 10:
                    System.out.println("Sobresaliente");
                    sobre++;
                    break;
            }
        }
        System.out.println();
        System.out.println(insu + " insuficiente(s), " + sufi + " suficiente(s), " + bien + " bien(es), " + notable + " notable(s), " + sobre + " sobresaliente(s)");
    }
}