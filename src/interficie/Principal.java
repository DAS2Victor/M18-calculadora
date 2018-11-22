package interficie;

import funcions.Calculadora;
import funcions.Expressions;
import funcions.Operacions;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        String text;
        Scanner s = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("|CALCULADORA SIMPLE|");
        System.out.println("-------------------");
        System.out.println("Realiza la operación o escribe q para salir");
        text = s.nextLine();
        while (!text.equals("q")) {
            text = Expressions.eliminarEspacios(text);
            if (text.matches("[xX]+")) {
                // És una equació

            } else {
                // És una operació
                while (!Expressions.esCorrecte(text)) {//si no es correcto seguimos recoriendo el programa
                    System.out.println("Inserte una operación: ");
                    text = s.nextLine();
                    text = Expressions.eliminarEspacios(text);
                }
                System.out.printf("El resultado es: %.2f \n" ,Calculadora.calculOperacionsEnters(text));
            }
            
            text=s.nextLine();

        }

    }
}
