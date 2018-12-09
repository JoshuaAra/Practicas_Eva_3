/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ival = 5;
        //int iResu = calcularFactorial (ival);
        System.out.println("Resultado bro "+ calcularFactorial (ival));
    }
    public static int calcularFactorial(int ival){
        int iResu = 1;
        for (int i = ival; i >= 1; i--) {
            iResu *= i; // iResu = iResu * i;
            
            
        }
        return iResu;
    }
}
