package com.mycompany.projeto01;
//Nome da classe

public class Caneta {
//Atributos

    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta) { // método construtor
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }
    //depois de criar os atributos, pressionar Alt + insert ele gera contrutor, get e set
    //ou Ctrl + i

    public String getModelo() {//o get não precisa receber parametro, ele simplismente retorna o que foi solicitado
        return modelo;
    }

    public void setModelo(String modelo) { //o set precisa receber parametros para executar
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status() {
        System.out.println("Modelo " + this.getModelo());
        System.out.println("Cor " + this.getCor());
        System.out.println("Ponta" + this.getPonta());

    }

}
