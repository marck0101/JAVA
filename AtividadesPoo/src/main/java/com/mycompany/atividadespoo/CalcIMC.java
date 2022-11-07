package com.mycompany.atividadespoo;

/**
 *
 * @author marck
 */
public class CalcIMC {

    // construtor
    public CalcIMC(String nome, float peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

//  Atributos
    public String nome;
    public float peso;
    public float altura;

//   Metodos
    public void status() {
        System.out.println(this.nome + " você está com " + "this.IMC");
        System.out.println("pesando " + this.peso + "KG");
        System.out.println("pesando " + this.altura + "M");
    }

//    calculos do IMC
    public void IMC() {
        float imc;
//        imc = (this.peso / this.altura);
        imc = (float) (peso / Math.pow(altura, 2));
        if (imc <= 20) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 21 && imc <= 25) {
            System.out.println("Peso normal");
        } else if (imc >= 26 && imc <= 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 31 && imc <= 40) {
            System.out.println("Obeso");
        } else if (imc > 40) {
            System.out.println("Peso morbido");
            System.out.println("Já pensou em participar de QUILOS MORTAIS ?");
            System.out.println("Muda de estilo de vida cidadão");
        } else {
            System.out.println("erro nos calculos marquins");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
