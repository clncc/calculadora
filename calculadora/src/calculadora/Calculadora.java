/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Joan de Canyamars
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 2;
        int numero2 = 5;

        System.out.println(sumar(numero, numero2));
        System.out.println(restar(numero, numero2));
        System.out.println(sumar(6, 9));
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }
}
