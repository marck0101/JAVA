package com.mycompany.aula02;

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.cor = "azul";
        c1.ponta = 0.5f;
        // c1.tampada = false; //chamada atributo;
        c1.tampar();
        c1.rabiscar();
        c1.status(); // chamada método

        Caneta c2 = new Caneta();
        c2.cor = "azul";
        c2.ponta = 0.5f;
        c2.destampar();
        c2.rabiscar();
        c2.status(); // chamada método
    }
}
