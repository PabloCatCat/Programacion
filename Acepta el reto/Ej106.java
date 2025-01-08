import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Ej106 {
    public static void main(String[] args) {
        Ej106 programa=new Ej106();
        programa.inicio();
    }

    private void inicio() {
        boolean fin=false;
        String codigo;

        do {
           codigo = getCodigoBarras();
           codigo = getCodigoCompleto(codigo);
           printPantalla(codigo);
           if (!isCorrecto(codigo))
               printPantalla("NO");
        }while(!fin);

    }

    private boolean isCorrecto(String codigo) {
        int total = 0, ultimoDigito;

        ultimoDigito = (codigo.charAt(codigo.length()-1))-'0';

        for (int i = codigo.length()-2; i >=0 ; i--) {

        }
        return true;
    }

    private String getCodigoCompleto(String codigo) {
        int longitud = codigo.length();

        if (codigo.length()<8){
            for (int i = 0; i < 8-longitud ; i++) {
                codigo = '0' + codigo;
            }
        }else if (codigo.length()>8&&codigo.length()<13){
            for (int i = 0; i <13-longitud ; i++) {
                codigo = '0' + codigo;
            }
        }
        return codigo;
    }

    private void printPantalla(String s) {
        System.out.println(s);
    }

    private String getCodigoBarras() {
        String codigo;

        do {
            codigo = getString();
        }while(isDigitos(codigo)&&codigo.length()>13);
        return codigo;
    }

    private String getString() {
        Scanner sc=new Scanner(System.in);
        return sc.next();
    }

    private boolean isDigitos(String codigo){
        int i=0;
        while(i<codigo.length()&&(codigo.charAt(i)>='0'&&codigo.charAt(i)<='9')){
            i++;
        }
        return i==codigo.length();
    }
}