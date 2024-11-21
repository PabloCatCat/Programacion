public class Act20{
    public static void main (String [] args){
        double normales=160, extras=40,dineroN, dineroE,nominaB,nominaN,retencion=0.18;

        dineroN=normales*12.5;
        dineroE=extras*22.5;
        nominaB=dineroN+dineroE;
        nominaN=nominaB-(nominaB*retencion);

        System.out.println("La nómina en bruto son "+nominaB + "€\nLa nómina neta son "+nominaN + "€");

    }
}
