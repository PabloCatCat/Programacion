public class Aleatorio2 {
    public static void main(String[] args) {
        int paloNum,carta;
        String palo="";
        char  cartaP='a';

        paloNum=(int)(Math.random()*(4-1+1)+1);
        switch(paloNum){
            case 1:
                palo="picas";
                break;
            case 2:
                palo="corazones";
                break;
            case 3:
                palo="diamantes";
                break;
            case 4:
                palo="tréboles";
                break;
        }
        carta =(int)(Math.random()*(13-1+1)+1);
        switch(carta){
            case 1:
                cartaP='A';
                break;
            case 11:
                cartaP='J';
                break;
            case 12:
                cartaP='Q';
                break;
            case 13:
                cartaP='K';
        }
        if (carta==1||carta>=11&&carta<=13)
            System.out.println(cartaP + " de " + palo);
        else
            System.out.println(carta + " de " + palo);
    }
}