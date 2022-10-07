package ejer3guia11;

import java.util.Scanner;

public class Ejer3guia11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String num1 = leer.next();
        String num2 = leer.next();
        int numint1 = 0;
        int numint2 = 0;
        try {
            numint1 = Integer.parseInt(num1);
            numint2 = Integer.parseInt(num2);
            System.out.println(numint1 / numint2);
        } catch (ArithmeticException a) {
            System.out.println("No se puede dividir por 0");
        } catch (NumberFormatException a) {
            System.out.println("Se ingresaron letras");
        }
    }
}
