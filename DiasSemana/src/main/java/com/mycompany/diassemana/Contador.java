/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diassemana;

/**
 *
 * @author marck
 */
public class Contador {

    public int num;

    public Contador(int num) {
        this.num = num;
    }

    public void contadorDia() {
        System.out.println("DOMINGO 1");
        System.out.println("SEGUNDA 2");
        System.out.println("TERÇA 3");
        System.out.println("QUARTA 4");
        System.out.println("QUINTA 5");
        System.out.println("SEXTA 6");
        System.out.println("SÁBADO 7");

        System.out.println("você estolheu o numero " + this.getNum());

        if (this.num == 1) {
            System.out.println("O dia da semana correspondente é Domingo ");
        } else if (this.num == 2) {
            System.out.println("O dia da semana correspondente é Segunda");
        } else if (this.num == 3) {
            System.out.println("O dia da semana correspondente é Terça");
        } else if (this.num == 4) {
            System.out.println("O dia da semana correspondente é Quarta");
        } else if (this.num == 5) {
            System.out.println("O dia da semana correspondente é  Quinta");
        } else if (this.num == 6) {
            System.out.println("O dia da semana correspondente é Sexta");
        } else if (this.num == 7) {
            System.out.println("O dia da semana correspondente é Sábado");
        } else if (this.num < 1 || this.num > 7) {
            System.out.println("dia da semana inválido");
            System.out.println("Nosso calendário possui apenas  7 dias por semana");
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
