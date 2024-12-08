import java.util.Scanner;

public class Act16 {
    public static void main(String[] args) {
        Act16 programa=new Act16();
        programa.inicio();
    }

    private void inicio() {
        int[] personas=getArray(10);
        boolean fin=false;
        int numPersonas;

        asignarPersonas(personas);
        do {
            if (!fin){
                printInterfaz(personas);
                numPersonas=getNum();
                if(numPersonas==-1)
                    fin=true;
                else {
                    asignarMesa(numPersonas,personas);
            }

            }

        }while(!fin);
    }

    private void printInterfaz(int[] personas) {
        printLineasArriba();
        printNumMesas(personas);
        printLineasMedio();
        printMesas(personas);
        printLineasAbajo();
        System.out.println();
    }

    private void printLineasAbajo() {
        printPantalla("└");
        for (int i=1;i<=59;i++){
            printPantalla("─");
        }
        System.out.println("┘");
    }

    private void printLineasMedio() {
        printPantalla("├");
        for (int i=1;i<=59;i++){
            printPantalla("─");
        }
        System.out.println("┤");
    }

    private void printMesas(int[] personas) {
        printPantalla("|Ocupación| ");
        for (int i=0;i<personas.length;i++){
            System.out.printf("%2d | ",personas[i]);
        }
        System.out.println();
    }

    private void printNumMesas(int[] personas) {
        printPantalla("| Mesa Nº | ");
        for (int i=0;i< personas.length;i++){
            System.out.printf("%2d | ",(i+1));
        }
        System.out.println();
    }

    private void printLineasArriba() {
        printPantalla("┌");
        for (int i=1;i<=59;i++){
            printPantalla("─");
        }
        System.out.println("┐");
    }

    private void asignarPersonas(int[] personas) {
        for(int i=0;i< personas.length;i++){
            personas[i]=getAleatorio();
        }
    }

    private int getAleatorio() {
        return (int)(Math.random()*5);
    }

    private void asignarMesa(int numPersonas, int[] personas) {
        boolean cambio=false,cambio2=false;

        for (int i=0;i<personas.length;i++){
            if (personas[i]==0){
                personas[i]+=numPersonas;
                printPantalla("Por favor, siéntese en la mesa número " + (i+1) + ".\n\n");
                cambio=true;
                break;
            }
        }
        if (!cambio){
            for (int i=0;i< personas.length;i++){
                if ((personas[i]+numPersonas)<=4){
                    personas[i]+=numPersonas;
                    printPantalla("Por favor, siéntese en la mesa número " + (i+1) + ".\n\n");
                    cambio2=true;
                    break;
                }
            }
        }
        if (!cambio&&!cambio2)
            printPantalla("Lo siento, en estos momentos no queda sitio.\n");
    }

    private int getNum() {
        Scanner sc=new Scanner(System.in);
        int num;
        do {
            printPantalla("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            num = sc.nextInt();
            if (num!=-1&&num<0||num>4)
                printPantalla("Lo siento, no admitimos grupos de " + num + ", haga grupos de 4 personas como máximo e intente de nuevo\n");
        }while(num!=-1&&num<0||num>4);
        return num;
    }

    private void printPantalla(String s) {
        System.out.print(s);
    }

    private int[] getArray(int l) {
        return new int[l];
    }
}