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
        int iVal=5;
       int iResu=CalcularFactorial(iVal);
        System.out.println("Resultado: " + iResu);
    }
    public static int CalcularFactorial(int iVal){
        int iResu=1;
        
        for (int i = iVal; i >= 1; i--) {
            iResu*=i;
        }
        return iResu;
    }
    
}

