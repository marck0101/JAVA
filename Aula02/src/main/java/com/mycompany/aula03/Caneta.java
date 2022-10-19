package com.mycompany.aula03;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("O modelo da caneta = " + this.modelo);
        System.out.println("uma caneta  da cor = " + this.cor);
        System.out.println("ponta = " + this.ponta);
        System.out.println("Carga = " + this.carga);
        System.out.print("Está tampada? = " + this.tampada);

    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println(" Erro, não posso rabiscar, caneta está tampada");
        } else {
            System.out.println(" Posso rabiscar, caneta está destampada");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
