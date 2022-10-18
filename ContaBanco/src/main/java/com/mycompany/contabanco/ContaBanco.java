package com.mycompany.contabanco;

public class ContaBanco {
    
    public static void main(String[] args) {
        //objeto p1 sendo criado
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.sacar(150);
        p1.fechaConta();
        
        Conta p2 = new Conta();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(1000);
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
