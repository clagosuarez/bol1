/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol1_3;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Bol1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce el valor en euros:");
        Scanner e = new Scanner(System.in);
        float euros = e.nextFloat();
        System.out.println("Introduce el cambio de euros a dolares:");
        float cambio = e.nextFloat();
        float dolares = euros * cambio;
        System.out.println(euros+" euros son "+dolares+" dolares");
    }
    
}
