public class Aleatorio10 {
    public static void main(String[] args) {

        char caracter='c';

        for (int linea=1;linea<=10;linea++){
            int caracterNum=(int)(Math.random()*(6-1+1)+1);
            switch(caracterNum){
                case 1:
                    caracter='*';
                    break;
                case 2:
                    caracter='-';
                    break;
                case 3:
                    caracter='=';
                    break;
                case 4:
                    caracter='.';
                    break;
                case 5:
                    caracter='|';
                    break;
                case 6:
                    caracter='@';
                    break;
            }
            int longitud=(int)(Math.random()*(40-1+1)+1);
            for (int longitudAct=1;longitudAct<=longitud;longitudAct++){

                System.out.print(caracter);
                if (longitudAct==longitud)
                    System.out.println();
            }
        }

    }
}
