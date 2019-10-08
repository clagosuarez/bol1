/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol1_4;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Bol1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce el primer número:");
        Scanner n = new Scanner(System.in);
        float numero1 = n.nextFloat();
        System.out.println("Introduce el segundo número:");
        float numero2 = n.nextFloat();
        float suma = numero1 + numero2;
        System.out.println("La suma de "+numero1+" más "+numero2+" es "+suma);
        float resta = numero1 - numero2;
        System.out.println("La resta de "+numero1+" menos "+numero2+" es "+resta);
        float multiplicacion = numero1 * numero2;
        System.out.println("La multiplicacion de "+numero1+" por "+numero2+" es "+multiplicacion);
        float division = numero1 / numero2;
        System.out.println("La division de "+numero1+" entr "+numero2+" es "+division);
        
    }
    
}
