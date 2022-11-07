package com.mycompany.atividadespoo;

/**
 *
 * @author marck
 */
public class AtividadesPoo {

    public static void main(String[] args) {
// aqui cria o objeto 
//   aqui eu vou chama a classe que vai conter os calculos
        CalcIMC c1 = new CalcIMC( "marcos", 68, 1.68f);

        c1.status();
        c1.IMC();

//        c1.IMC();
    }
}
