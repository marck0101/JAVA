package com.mycompany.atividadespoo.Eleitor.IdadeEleitoral;

/**
 *
 * @author marck
 */
public class Eleitor {

    public Eleitor(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int idade;
    public String nome;

    public void TesteEleitor() {
        if (this.idade < 16) {
            System.out.println("Não tem idade para votar, pois tem " + this.idade+" anos");
        } else if (this.idade >= 17 && this.idade <= 65) {
            System.out.println("Voto obrigatório, pois tem " + this.idade+" anos");
        }else if(this.idade > 16 && this.idade < 18 || this.idade > 65){
            System.out.println("Voto facultativo, pois tem "+ this.idade+" anos");
        }else{
            System.out.println("Deu erro Marquins");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
