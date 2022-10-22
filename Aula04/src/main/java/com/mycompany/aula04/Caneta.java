package com.mycompany.aula04;

public class Caneta {

    public  Caneta() { // esse é o metodo construtor
        this.tampar();
        this.cor = "azul";
    }

    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void destampada() {

    }

    public void status() {
        System.out.println("SOBRE A CANETA ");
        System.out.println("Modelo " + this.getModelo());
        System.out.println("Ponta " + this.getPonta());
        System.out.println("A cor da caneta " + this.cor); //o ideal seria adicionar o acessor e o modificador
        System.out.println("A caneta está tampada? " + this.tampada);
    }
}
