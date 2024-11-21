public class Ej108 {

    static java.util.Scanner in;

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        double desayuno=0,comida=0,merienda=0,cena=0,copa=0,num;
        byte fin=1;
        char tipo;
        do {
            do {
                tipo=in.next().charAt(0);
                num=in.nextDouble();
                switch (Character.toLowerCase(tipo)){
                    case 'd':
                        desayuno=num;
                        break;
                    case 'a':
                        comida=num;
                        break;
                    case 'm':
                        merienda=num;
                        break;
                    case 'i':
                        cena=num;
                        break;
                    case 'c':
                        copa=num;
                        break;
                    case 'n':
                        fin=(byte)num;
                        break;
                }
            }while(fin!=0);

            if (desayuno>comida && desayuno>merienda && desayuno>cena && desayuno>copa)
                System.out.print("DESAYUNOS#");
            else if (comida>merienda && comida>cena && comida>copa && comida>desayuno)
                System.out.print("COMIDAS#");
            else if (merienda>cena && merienda>copa && merienda>desayuno && merienda>comida)
                System.out.print("MERIENDAS#");
            else if (cena>copa && cena>desayuno && cena>comida && cena>merienda)
                System.out.print("CENAS#");
            else if (copa>desayuno && copa>comida && copa>merienda && copa>cena)
                System.out.print("COPAS#");
            else
                System.out.print("EMPATE#");
            if (desayuno<comida && desayuno<merienda && desayuno<cena && desayuno<copa)
                System.out.print("DESAYUNOS#");
            else if (comida<merienda && comida<cena && comida<copa && comida<desayuno)
                System.out.print("COMIDAS#");
            else if (merienda<cena && merienda<copa && merienda<desayuno && merienda<comida)
                System.out.print("MERIENDAS#");
            else if (cena<copa && cena<desayuno && cena<comida && cena<merienda)
                System.out.print("CENAS#");
            else if (copa<desayuno && copa<comida && copa<merienda && copa<cena)
                System.out.print("COPAS#");
            else
                System.out.print("EMPATE#");
            if (((desayuno+comida+merienda+cena+copa)/5)<comida)
                System.out.println("SI");
            else
                System.out.println("NO");
        }while(fin!=0);
    }
}