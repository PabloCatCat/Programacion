public class Actx{
    public static void main(String[] args){

        int min=60,dias,horas,minutos;

        dias=(min/1440);
        horas=(min%1440)/60;
        minutos=(min%1440)%60;

        System.out.println(min+" minutos son "+dias+" dias, "+horas+" horas, "+minutos+" minutos.");
    }
}
