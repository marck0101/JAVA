package com.mycompany.aula07;

public class Lutador {
// atributos 

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //construtor
    public Lutador(
            String no,
            String na,
            int id,
            float al,
            float pe,
            int vi,
            int de,
            int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }

    //metodos especiais
    public String getNome() {
        return nome;

    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria(nome);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String ca) {
        this.categoria = ca;
        if (this.getPeso() < 52.2) {
            System.out.println("Inválido, muito leve para categoria " + this.categoria);
        } else if (getPeso() >= 70.3) {
            this.categoria = " Leve";
        } else if (getPeso() <= 83.9) {
            this.categoria = " Médio";
        } else if (getPeso() <= 120) {
            this.categoria = " Pesado";
        } else {
            System.out.println("Inválido");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
        this.setVitorias(this.getVitorias() + 1);
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
        this.setEmpates(getEmpates() + 1);
    }

    //metodo abstrato
    public void apresentar() {
        System.out.println("-----------------------");
        System.out.println("Lutador " + this.getNome());
        System.out.println("Origem" + this.getNacionalidade());
        System.out.println("Idade " + this.getIdade() + " anos e " + this.getAltura() + " altura");
        //System.out.println("Altura " + this.getAltura());
        System.out.println("Pesando " + this.getPeso()+"kg");
        System.out.println("Ganhou " + this.getVitorias());
        System.out.println("Perdeu " + this.getDerrotas());
        System.out.println("Empatou " + this.getEmpates());

    }

    public void status() {
        System.out.println("" + this.getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
    }

    public void ganharLuta() {

    }

    public void perderLuta() {

    }

    public void empatarLuta() {

    }
}
