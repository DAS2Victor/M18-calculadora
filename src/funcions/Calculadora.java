/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcions;

/**
 *
 * @author victor
 */
public class Calculadora {
    public static double calculOperacionsEnters(String s){
        //Rep una cadena de text amb una operació i retorna el resultat
        double resultado=0;
        String []num=s.split("[\\+\\-\\*/^]");
        int x = Integer.parseInt(num[0]);
        int y = Integer.parseInt(num[1]);
        String []oper=s.split("[0-9]+");
        String simbolo=oper[1];// es la posicion el []
        if(oper[1].equals("+")){
            resultado=Operacions.suma(x, y);
        }else if(oper[1].equals("-")){
            resultado=Operacions.resta(x, y);
        }else if(oper[1].equals("*")){
            resultado=Operacions.multiplicacio(x, y);
        }else if (oper[1].equals("/")){
            resultado=Operacions.division(x, y);
        }else if (oper[1].equals("^")){
            resultado=Operacions.potencia(x, y);
        }
            
        
        return resultado;
    } 
}
