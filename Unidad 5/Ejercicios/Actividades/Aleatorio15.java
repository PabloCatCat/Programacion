public class Aleatorio15 {
    public static void main(String[] args) {

        //Definición de variables
        int longitudMelodia,longitudAct,notaNum;
        String nota="",notaInicial = "";

        //Generación de la longitud de la melodia
        do {
            longitudMelodia = (int) (Math.random() * (28-4+1) + 4);
        }while (longitudMelodia % 4 != 0);

        for (longitudAct=1; longitudAct<= longitudMelodia; longitudAct++){
            notaNum=(int)(Math.random()*7+1);
            //En caso de ser la última nota, se imprime la inicial
            if (longitudAct==longitudMelodia){
                System.out.print(notaInicial + " ||");
                break;
            }else {
                switch (notaNum) {
                    case 1:
                        nota = "do";
                        break;
                    case 2:
                        nota = "re";
                        break;
                    case 3:
                        nota = "mi";
                        break;
                    case 4:
                        nota = "fa";
                        break;
                    case 5:
                        nota = "sol";
                        break;
                    case 6:
                        nota = "la";
                        break;
                    case 7:
                        nota = "si";
                        break;
                }
                //Asignación de la primera nota a otra variable
                if (longitudAct==1)
                    notaInicial=nota;

                System.out.print(nota + " ");
                if (longitudAct%4==0)
                    System.out.print("| ");
            }
        }
    }
}

