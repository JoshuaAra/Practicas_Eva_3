import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {
    
    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int iNum=input.nextInt();
         System.out.println("El mes es " + Numero(iNum));
    }
    public static String Numero(int iNum){
        String Smes = "";
        
        switch (iNum){
            case 1:Smes = "Enero" ;
           
             break; 
            case 2:Smes = "Febrero" ;        
            
             break;
            case 3:Smes = "Marzo" ;
             
             break; 
            case 4:Smes = "Abril" ;
             
             break; 
            case 5:Smes = "Mayo" ;
           
             break;  
            case 6:Smes = "Junio" ;
            
             break; 
            case 7:Smes = "Julio" ;
            
             break;
            case 8:Smes = "Agosto" ;
             
             break;
            case 9:Smes = "Sept" ;
             
             break;
            case 10:Smes = "Oct" ;
            
             break;
            case 11:Smes = "Nov" ;
        
             break; 
            case 12:Smes = "Dic" ;
          
             break; 
            default:
             
        }
        return Smes;
    }
}

  
