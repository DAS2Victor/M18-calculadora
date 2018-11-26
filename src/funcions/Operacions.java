
package funcions;

public class Operacions {
    
    
    public static double suma (double num1, double num2){
        double resultat;
        
        resultat = num1+num2;
        
        return resultat;
    }
    
    public static double multiplicacio (double num1, double num2){
        double resultat;
        
        resultat = num1*num2;
        
        return resultat;
    }
    public static double resta(double numero1, double numero2){
         double resultado;
        resultado=numero1-numero2;
        return resultado;
    }
    public static double division(double numero1, double numero2){
        double resultado;
        resultado=numero1/numero2;
        return resultado;
    }
    public static double potencia(double base, double potencia){
        double resultado=1;
        int i;
        for(  i=1; i<=potencia; i++){
           resultado=resultado*base;
        }
        return resultado;
    }
}
