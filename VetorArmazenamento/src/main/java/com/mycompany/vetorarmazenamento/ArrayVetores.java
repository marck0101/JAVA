/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetorarmazenamento;

/**
 *
 * @author marck
 */
public class ArrayVetores {

    public ArrayVetores(int num) {
        this.num = num;
    }

    public int num;

    public void apresentaNum() {
        int n = 80; // tamanho do vetor
        int v[] = new int[n]; // declaração e alocação de espaço para o vetor "v"
        int i; // índice ou posição

// processando os "n" elementos do vetor "v"

        for (i = 0; i < n; i++) {
//            v[i] = i; // na i-ésima posição do vetor "v" armazena o valor da variável "i"
//            System.out.println(v[i] + i);
            System.out.println(v[i] = i++);

        }

    }
}
