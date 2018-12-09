
import java.util.Scanner;


public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int annio = input.nextInt();
        System.out.println(Gohan(annio));
    }
    public static String Gohan(int annio){
        String anio = "";
        if((annio % 4 == 0) && ((annio % 100 != 0) || (annio % 400 == 0))){
        anio = "Bisiesto";
        return anio;
        } else 
            anio = "No bisiesto";
    return anio; }
           
    }


