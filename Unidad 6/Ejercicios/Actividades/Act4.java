public class Act4 {
    public static void main(String[] args) {
        Act4 programa=new Act4();
        programa.inicio();
    }

    private void inicio() {
        int[] numero=new int[20],cuadrado=new int[20], cubo=new int[20];

        asignarNum(numero);
        asignarCuadrado(numero,cuadrado);
        asignarCubo(numero,cubo);
        imprimirInterfaz();
        imprimirResultado(numero,cuadrado,cubo);

    }

    private void imprimirInterfaz() {
        System.out.println("Número | Cuadrado | Cubo\n");
    }

    private void imprimirResultado(int[] numero, int[] cuadrado, int[] cubo) {
        String resultado;
        resultado=getResultado(numero,cuadrado,cubo);
        System.out.println(resultado);
    }

    private String getResultado(int[] numero, int[] cuadrado, int[] cubo) {
        String resultado="";
        for (int i=0;i< numero.length;i++){
            resultado+=numero[i] + " | " + cuadrado[i] + " | " + cubo[i] + "\n";
        }
        return resultado;
    }

    private void asignarCubo(int[] numero, int[] cubo) {
        for (int i=0;i< cubo.length;i++){
            cubo[i]=(int)Math.pow(numero[i],3);
        }
    }

    private void asignarCuadrado(int[] numero, int[] cuadrado) {
        for (int i=0;i< cuadrado.length;i++){
            cuadrado[i]=(int)Math.pow(numero[i],2);
        }
    }

    private void asignarNum(int[] numero) {
        for (int i=0;i< numero.length;i++){
            numero[i]=(int)(Math.random()*101);
        }
    }


}