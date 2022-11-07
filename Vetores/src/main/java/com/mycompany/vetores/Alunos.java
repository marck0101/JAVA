/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetores;

/**
 *
 * @author marck
 */
public class Alunos {
// atributos 

    private String aluno;
    private String materia;
    private float nota;

    //construtor
    public Alunos(String nome, String materia, float nota) {
        this.aluno = nome;
        this.materia = materia;
        this.nota = nota;

    }

    //metodos especiais
    public String getAluno() {
        return aluno;
    }

    public void setNome(String aluno) {
        this.aluno = aluno;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    //metodo abstrato
    public void calculaMedia() {
        int media = 7;
        if (this.getNota() < media) {
            System.out.println("Aluno reprovado, pois nota " + this.getNota() + " é menor que a média " + media);
        }else {
            System.out.println("Aprovado com nota média "+ this.getNota());
        }
    }

    public void status() {
        System.out.println("Aluno " + this.getAluno());
        System.out.println(this.getMateria() + " Materia");
        System.out.println(this.getNota() + " Média");

    }

}
