/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola_mundo;

/**
 *
 * @author MiguelFrejoMarañón
 */
public class esPrimo {
    public static boolean esPrimo(int n){
        int i=3;
        while(i<n)
        {
            if(n%1==0)
                return false;
            i++;
        }
        return true;
    }
    
}
