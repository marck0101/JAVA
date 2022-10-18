package com.mycompany.contabanco;

public class Conta {

    //atributos
    public int numConta;
    protected String tipo; // CC conta corrente ganha 50,00|| CP conta poupança ganha 150
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

//métodos
    public void abrirConta(String t) {
        //consta corrente ganha 50,00
        //conta poupança ganha 150,00
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") { // "CC".equals(t)
            this.setSaldo(50f);
        } else if (t == "CP") {
            this.setSaldo(150f);
        }
    }

    public void fechaConta() {
        if (this.getSaldo() > 0f) {
            System.out.println("TRANSIÇÃO INVÁLIDA, CONTA COM DINHEIRO");
        } else if (this.getSaldo() < 0f) {
            System.out.println("TRANSIÇÃO INVÁLIDA, CONTA NEGATIVADA");
        } else {
            this.setStatus(false);
            System.out.println("conta fechada com sucesso");
        }
    }

    public void depositar(float v) {
        if (this.getStatus() == true) {
            //saldo = saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depositado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Não foi possível depositar em conta fechada");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado" + this.getDono());
            } else {
                System.out.println("saldo insuficiente para saque");
            }
        } else {
            System.out.println("Não possivel debitar, conta ainda não foi aberta");
        }
    }

    public void pagarMensalidade() {
        //12 rais de mensalidade conta corrente
        //poupança 20 reais
        //aqui vou criar uma variavel, os atributos estão embaixo da classe
        int v = 0;

        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }

        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            }
        } else {
            System.out.println("impossível pagar uma conta fechada");
        }
    }

    //construtor
    public Conta() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public float getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

}
