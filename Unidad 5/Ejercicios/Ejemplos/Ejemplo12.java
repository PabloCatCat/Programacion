public class Ejemplo12{
    public static void main(String[] args){

    int num=1,cont;

    for(cont=1;num<6;cont++){
            System.out.println(num + "*" + cont + " = " + (num*cont));
            if(cont==10){
                num++;
                cont=0;
                System.out.print("\n");
            }
        }
    }
}
