/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.concat;

/**
 *
 * @author marck
 */
public class Concat {

    public static void main(String[] args) {

        String txt1 = "Marcão ";
        String txt2 = "Tecnologias";
        String txt3 = " ao Java";

        System.out.printf("Concatenando: %s%n", txt1.concat(txt2).concat(txt3));
    }
}
