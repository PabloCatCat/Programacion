public class Ej105 {

    static java.util.Scanner in;

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        double martes,miercoles,jueves,viernes,sabado,domingo;
        do {
            martes=in.nextDouble();
            if (martes==-1)
                break;
            miercoles=in.nextDouble();
            jueves=in.nextDouble();
            viernes=in.nextDouble();
            sabado=in.nextDouble();
            domingo=in.nextDouble();

            if (martes>miercoles && martes>jueves && martes>viernes && martes>sabado && martes>domingo)
                System.out.print("MARTES ");
            else if (miercoles>martes && miercoles>jueves && miercoles>viernes && miercoles>sabado && miercoles>domingo)
                System.out.print("MIERCOLES ");
            else if (jueves>martes && jueves>miercoles && jueves>viernes && jueves>sabado && jueves>domingo)
                System.out.print("JUEVES ");
            else if (viernes>martes && viernes>miercoles && viernes>jueves && viernes>sabado && viernes>domingo)
                System.out.print("VIERNES ");
            else if (sabado>martes && sabado>miercoles && sabado>jueves && sabado>viernes && sabado>domingo)
                System.out.print("SABADO ");
            else if (domingo>martes && domingo>miercoles && domingo>jueves && domingo>viernes && domingo>sabado)
                System.out.print("DOMINGO ");
            else
                System.out.print("EMPATE ");
            if (martes<miercoles && martes<jueves && martes<viernes && martes<sabado && martes<domingo)
                System.out.print("MARTES ");
            else if (miercoles<martes && miercoles<jueves && miercoles<viernes && miercoles<sabado && miercoles<domingo)
                System.out.print("MIERCOLES ");
            else if (jueves<martes && jueves<miercoles && jueves<viernes && jueves<sabado && jueves<domingo)
                System.out.print("JUEVES ");
            else if (viernes<martes && viernes<miercoles && viernes<jueves && viernes<sabado && viernes<domingo)
                System.out.print("VIERNES ");
            else if (sabado<martes && sabado<miercoles && sabado<jueves && sabado<viernes && sabado<domingo)
                System.out.print("SABADO ");
            else if (domingo<martes && domingo<miercoles && domingo<jueves && domingo<viernes && domingo<sabado)
                System.out.print("DOMINGO ");
            else
                System.out.print("EMPATE ");
            if (((martes+miercoles+jueves+viernes+sabado+domingo)/6)<domingo)
                System.out.println("SI");
            else
                System.out.println("NO");
        }while(martes!=-1);
    }
}