package com.mycompany.aula02;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("O modelo da caneta = " + this.modelo);
        System.out.println("uma caneta  da cor = " + this.cor);
        System.out.println("ponta = " + this.ponta);
        System.out.println("Carga = " + this.carga);
        System.out.print("Está tampada? = " + this.tampada);

    }

    void rabiscar() {
if(this.tampada == true){
    System.out.println(" Erro, não posso rabiscar, caneta está tampada");
}else{
    System.out.println(" Posso rabiscar, caneta está destampada");
}
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
