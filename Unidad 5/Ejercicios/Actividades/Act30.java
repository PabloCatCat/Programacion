import java.util.Scanner;

public class Act30 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double peso,ligeroP,medioP,pesadoP,muyPesadoP;
        int ligero=0,medio=0,pesado=0,muyPesado=0;

        do {
            System.out.print("Peso: ");
            peso=sc.nextDouble();
            if (peso<50)
                ligero++;
            else if (peso>=50&&peso<=65)
                medio++;
            else if (peso>=66&&peso<=80)
                pesado++;
            else if (peso>80)
                muyPesado++;
        }while(peso>=0);

        System.out.println();
        System.out.printf("Alumnos <50kg: %d%nAlumnos entre 50 y 65kg: %d%nAlumnos entre 66 y 80kg: %d%nAlumnos >80kg: %d%n",ligero,medio,pesado,muyPesado);

        ligeroP=(ligero*100.0)/(ligero+medio+pesado+muyPesado);
        medioP=(medio*100.0)/(ligero+medio+pesado+muyPesado);
        pesadoP=(pesado*100.0)/(ligero+medio+pesado+muyPesado);
        muyPesadoP=(muyPesado*100.0)/(ligero+medio+pesado+muyPesado);
        //media=ligero+medio+pesado+muyPesado;

        System.out.println();
        System.out.printf("Alumnos <50kg: %.2f%%%nAlumnos entre 50 y 65kg: %.2f%%%nAlumnos entre 66 y 80kg: %.2f%%%nAlumnos >80kg: %.2f%%%n",ligeroP,medioP,pesadoP,muyPesadoP);

    }
}