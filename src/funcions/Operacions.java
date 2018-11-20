
package funcions;

public class Operacions {
    
    
    public static int suma (int num1, int num2){
        int resultat;
        
        resultat = num1+num2;
        
        return resultat;
    }
    
    public static int multiplicacio (int num1, int num2){
        int resultat;
        
        resultat = num1*num2;
        
        return resultat;
    }
    public static int resta(int numero1, int numero2){
         int resultado;
        resultado=numero1-numero2;
        return resultado;
    }
    public static double division(int numero1, int numero2){
        double resultado;
        resultado=(double)numero1/numero2;
        return resultado;
    }
    public static int potencia(int base, int potencia){
        int resultado=1;
        int i;
        for(  i=1; i<=potencia; i++){
           resultado=resultado*base;
        }
        return resultado;
    }
}
