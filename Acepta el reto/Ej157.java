public class Ej157 {

    static java.util.Scanner in;

    public static void casoDePrueba() {
        int dia,mes,numMes=0;
        do {
            dia=in.nextInt();
            mes=in.nextInt();
        }while(dia>31||dia<1||mes<1||mes>12);
        switch (mes){
            case 1:
                numMes=31;
                mes=31;
                break;
            case 2:
                numMes=59;
                mes=28;
                break;
            case 3:
                numMes=90;
                mes=31;
                break;
            case 4:
                numMes=120;
                mes=30;
                break;
            case 5:
                numMes=151;
                mes=31;
                break;
            case 6:
                numMes=181;
                mes=30;
                break;
            case 7:
                numMes=212;
                mes=31;
                break;
            case 8:
                numMes=243;
                mes=31;
                break;
            case 9:
                numMes=273;
                mes=30;
                break;
            case 10:
                numMes=304;
                mes=31;
                break;
            case 11:
                numMes=334;
                mes=30;
                break;
            case 12:
                numMes=365;
                mes=31;
                break;
        }
        System.out.println(365-(numMes - (mes-dia)));
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}