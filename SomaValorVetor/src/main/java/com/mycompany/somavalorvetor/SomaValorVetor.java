/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.somavalorvetor;

/**
 *
 * @author marck
 */
public class SomaValorVetor {

    public static void main(String[] args) {
        int a[] = {2, 4, 2, 4, 2};
//        int a[] = {1, 1, 1, 1, 1};

        int soma = 0;

        for (int i = 0; i < a.length; i++) {
//            soma += a[i];
            System.out.print("posição " + a[i] + " e a soma até aqui é ");
            System.out.println(soma += a[i]);
//            System.out.print(soma = a[i] + a[i]);
        }
        System.out.println("a soma do array é " + soma);

    }

}
