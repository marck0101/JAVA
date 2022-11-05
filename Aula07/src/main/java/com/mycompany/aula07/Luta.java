package com.mycompany.aula07;

public class Luta {
// atributos

    private Lutador desafiado;
    private Lutador desafiante;
    private float rounds;
    private boolean aprovada;

    public void Luta() {

    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = l1;
            this.desafiante = l2;
        }
    }

    public void lutar() {

    }

// metodos especiais
    public String getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(String desafiado) {
        this.desafiado = desafiado;
    }

    public String getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }

    public float getRounds() {
        return rounds;
    }

    public void setRounds(float rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
