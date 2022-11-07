/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.vetores;

/**
 *
 * @author marck
 */
public class Vetores {

    public static void main(String[] args) {
        Alunos vet[] = new Alunos[5];

        vet[0] = new Alunos("Marcos", "Portuges", 10f);
        vet[1] = new Alunos("Alex", "Estatistica", 7.5f);
        vet[2] = new Alunos("Roberto", "Programação", 6f);
        vet[3] = new Alunos("Mário", "Security", 5f);
        vet[4] = new Alunos("Neymar", "Educação Física", 9.5f);

        int i = 0;
        for (i = 0; i < 4; i++) {
            vet[i].status();
            vet[i].calculaMedia();

        }

//        vet[0].status();
//        vet[0].calculaMedia();
//
//        vet[1].status();
//        vet[1].calculaMedia();
//
//        vet[2].status();
//        vet[2].calculaMedia();
//
//        vet[3].status();
//        vet[3].calculaMedia();
//
//        vet[4].status();
//        vet[4].calculaMedia();

    }

}
