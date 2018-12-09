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
        System.out.println("Tu califa  es " + sCalifa(iNum));
    }
    
    public static String sCalifa(int iCalif){
        String sCalif = "";
        
        switch (iCalif){
            case 10:sCalif = "A" ;
           
             break; 
            case 9:sCalif = "B" ;        
            
             break;
            case 8:sCalif = "C" ;
             
             break; 
            case 7:sCalif = "D" ;
             
             break;
            
            case 6:sCalif="F";
            
             break;
            case 5:sCalif = "F" ;
           
             break; 
            default:System.out.println("Try again");
             
        }
        return sCalif;
    }
}
