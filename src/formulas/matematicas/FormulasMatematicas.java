/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formulas.matematicas;

/**
 *
 * @author Aluno
 */
public class FormulasMatematicas {
    public static void main(String[] args) {
        double x = 10; // Exemplo de valor para x
        double y = 5;  // Exemplo de valor para y
        double z = 8;  // Exemplo de valor para z
        
        double a = Math.sqrt(x * 5 - 64);
        double b = (x * y) / (y - 6 * x);
        double c = 4 * Math.pow(z, 5) - Math.sin(x * x / 2);
        double d = Math.pow(x, 4) - (6 * x) - Math.pow(y, 3);
        double e = (1 / y) - (1 / x) - (2 / y);
        double f = 7 * (Math.pow(z, 7) * (Math.pow(5 - Math.sin(x * x / 3), Math.sqrt(3 * x) - 4)));

        System.out.println("a. a = " + a);
        System.out.println("b. b = " + b);
        System.out.println("c. c = " + c);
        System.out.println("d. d = " + d);
        System.out.println("e. e = " + e);
        System.out.println("f. f = " + f);
    }
}

