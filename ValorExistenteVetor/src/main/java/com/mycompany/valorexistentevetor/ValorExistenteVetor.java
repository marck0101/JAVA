/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.valorexistentevetor;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author marck
 */
public class ValorExistenteVetor {

    public static void main(String[] args) {

        String[] a = new String[]{"teste", "teste2", "Pedro", "Maria", "João", "Rosa", "Mariel"};

        List<String> lista = Arrays.asList(a);
        String busca = "Pedro";

        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(busca)) {
                System.out.println(busca + " Está nessa posição do array");
            } else {
                System.out.println(busca + " Não está aqui nessa posição");
            }
        }
//        
//        System.out.println("3 in a = " + (lista.(teste)));
//        System.out.println("5 in a = " + (lista.(João)));
//        System.out.println("6 in a = " + (lista.(6)));

    }
}
