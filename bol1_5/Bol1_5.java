/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol1_5;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Bol1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce el valor en millas:");
        Scanner mi = new Scanner(System.in);
        float millas = mi.nextFloat();
        final float valor = 1852;
        float metros = millas * valor;
        System.out.println(millas+" millas son "+metros+" metros");
    }
    
}
