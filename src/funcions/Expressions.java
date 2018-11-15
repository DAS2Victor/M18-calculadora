/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcions;

/**
 *
 * @author Marc
 */
public class Expressions {
    public static boolean esCorrecte(String s){
        
        return s.matches("[0-9]+[\\+\\-\\*/][0-9]+");
    }
    public static String eliminarEspacios(String s){
        return s.replaceAll("\\s", "");
    }
}
