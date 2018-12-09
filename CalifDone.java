
import java.util.Scanner;

public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el numero de tu calificacion solo de 6 a 10");
        int iCalifa = input.nextInt();
        
        System.out.println("Tu calificacion es " + ConvertirCalificacion(iCalifa));
        
    }
    public static String ConvertirCalificacion (int iCalif){
String Calif = "";

 switch (iCalif) {
     
     case 10: Calif = "A" ;break;
     case 9: Calif = "B" ;break;
     case 8: Calif = "C" ;break;
     case 7: Calif = "D" ;break;
     case 6: Calif = "F" ;break;    
 }

  return Calif ;
    
    }
}
