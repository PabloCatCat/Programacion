public class Aleatorio1 {
    public static void main(String[] args) {
        int acum=0,tir;
        for (int i=1;i<4;i++){
            tir=(int)(Math.random()*(6-1+1)+1);
            acum+=tir;
            System.out.println("Tirada " + i + ": " + tir);
        }
        System.out.println("La suma es " + acum);
    }
}