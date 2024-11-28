//Realizar un programa que defina un vector llamado “vector_numeros” de 10 enteros, a continuación lo inicialice
// con valores aleatorios (del 1 al 10) y posteriormente muestre
// en pantalla cada elemento del vector junto con su cuadrado y su cubo.
public class Ejer1 {
    public static void main(String[] args) {
        Ejer1 programa=new Ejer1();
        programa.inicio();
    }

    private void inicio() {
        int[] vectorNumeros=new int[10];

        getNumeros(vectorNumeros);
        imprimirResultado(vectorNumeros);
    }

    private void imprimirResultado(int[] vectorNumeros) {//Se imprime el numero, cuadrado y cubo de cada index del array
        for (int i=0;i<vectorNumeros.length;i++){
            System.out.println(vectorNumeros[i] + " | " + (int)Math.pow(vectorNumeros[i],2) + " | " + (int)Math.pow(vectorNumeros[i],3));
        }
    }

    private void getNumeros(int[] vectorNumeros) {//Se asigna un numero aleatorio entre 1 y 10 a cada index del array, es uny metodo void porque ya se modifica el array de programa dentro del metodo getNumeros (se puede hacer porque con el array se pasan valores por referencia)
        for (int i =0;i<vectorNumeros.length;i++){
            vectorNumeros[i]=(int)(Math.random()*9+1);
        }
    }
}