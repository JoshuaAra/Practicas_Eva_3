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
        System.out.println(new Main());
        int k;
        Main mObjeto = new Main();
        System.out.println(mObjeto);
        //UnaClase ucObjeto =new UnaClase();
        //System.out.println("");
        int iValor=5;
        Incremento(iValor);
        System.out.println("Su Valor es " + iValor);
        //
        Valor vObjetoValor = new Valor(); //--> WTF 
        vObjetoValor.iValor=5;
        Incremento(vObjetoValor);
        System.out.println("Tu segundo valor es " + vObjetoValor );
    }
    public static void Incremento (int iVal){
        iVal++;
 
    }
    public static void Incremento (Valor vVal){
        vVal.iValor++;
    }
 
    }
   class UnaClase{}
   class Valor{
        int iValor; 
}
