public class Aleatorio12 {
    public static void main(String[] args) {
        while (1 == 1) {
            for (int i=1;i<=200;i++) {
                char letra = (char)((int)(Math.random() * (126 - 32 + 1) + 32));

                System.out.print(letra);
                if (i==200)
                    System.out.println();
            }
        }
    }
}