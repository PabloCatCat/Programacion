import java.util.Scanner;

public class Act7{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        double x, y;

        System.out.print("Coordenada x: ");
        x = sc.nextDouble();
        System.out.print("Coordenada y: ");
        y = sc.nextDouble();

        if(x>0&&y>0){
            System.out.println("Las coordenadas " + x + "," + y + " pertenecen al cuadrante 1.");
        }else if(x<0&&y>0){
            System.out.println("Las coordenadas " + x + "," + y + " pertenecen al cuadrante 2.");
        }else if(x<0&&y<0){
            System.out.println("Las coordenadas " + x + "," + y + " pertenecen al cuadrante 3.");
        }else if(x>0&&y<0){
            System.out.println("Las coordenadas " + x + "," + y + " pertenecen al cuadrante 4.");
        }else{
            System.out.println("Las coordenadas " + x + "," + y + " no pertenecen a ningún cuadrante dado que una de ellas es 0.");
        }
    }
}
