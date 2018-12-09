
import java.util.Scanner;


public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingresa tu edad ");
        System.out.println("Tu edad es "+ iEdad(1));
         System.out.println("Ahora tu nombre ");
        System.out.println("Tu nombre es "+ sName(""));
         System.out.println("Valor boleano "+ bBoolean(true));
         System.out.println("Da tu tamaño");
         System.out.println("Tu tamaño es " +dSize (0.5));
         
    }
    public static int iEdad(int iNum){
        Scanner input = new Scanner(System.in);
        iNum = input.nextInt();
        
        
    return iNum;
    
    }
        public static String sName(String iNum){
        Scanner input = new Scanner(System.in);
        iNum = input.nextLine();
        
        
    return iNum;
    
    }
         public static boolean bBoolean(boolean iNum){
        Scanner input = new Scanner(System.in);
        iNum = true;
        
        
    return iNum;
    
    } public static double dSize(double dNum){
        Scanner input = new Scanner(System.in);
        dNum = input.nextDouble();
        
        
    return dNum;
    
    }
}
