/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcsaldo;

/**
 *
 * @author marck
 */
public class SaldoMedio {

    public SaldoMedio(int saldo) {
        this.saldo = saldo;
    }

    
                
    public int saldo;

    public void calculoSaldo() {
        if (this.saldo >= 0 && this.saldo <= 500) {
            System.out.println("Nenhum valaor de saldo para o valor de " + this.saldo);
        } else if (this.saldo >= 501 && this.saldo <= 1000) {
            System.out.println("você tem 30% do valor do saldo médio para o valor de " + this.saldo);
        } else if (this.saldo >= 1001 && this.saldo <= 3000) {
            System.out.println("você tem 40% do valor do saldo médio para o valor de " + this.saldo);

        }else if (this.saldo > 3001) {
            System.out.println("você tem 50% do valor do saldo médio para o valor de " + this.saldo);

        }else{
            System.out.println("Deu erro nos calculos marquins");
        }
    }
}
