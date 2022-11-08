/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.vetorarmazenamento;

import java.util.Scanner;

/**
 *
 * @author marck
 */
public class VetorArmazenamento {

    public static void main(String[] args) {
//        ArrayVetores vet[] = new ArrayVetores[40];
//        vet[] 
//        int i = 0;
//        for (i = 0; i < 40; i = i + 1) {
//            vet[i].apresentaNum();
//        }

        int n = 80; // tamanho do vetor
        int v[] = new int[n]; // declaração e alocação de espaço para o vetor "v"
        int i; // índice ou posição

// processando os "n" elementos do vetor "v"
        for (i = 0; i < n; i++) {
//            v[i] = i; // na i-ésima posição do vetor "v" armazena o valor da variável "i"
//            System.out.println(v[i] + i);
            System.out.print(" par ");
            System.out.println(v[i] = i++);
        }
    }
}
