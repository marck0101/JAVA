package com.mycompany.aula07;

public class Aula07 {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "frança", 31, 1.75f, 68.9f, 11, 3, 1);
        l[1] = new Lutador("PutScript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snap Shadow", "EUA", 31, 1.75f, 68.9f, 11, 3, 1);
        l[3] = new Lutador("DeadCode", "Australia", 29, 1.68f, 57.8f, 14, 2, 3);
        l[4] = new Lutador("UFOCobol", "Brasil", 31, 1.75f, 68.9f, 11, 3, 1);
        l[5] = new Lutador("Nerdaart", "EUA", 31, 1.75f, 68.9f, 11, 3, 1);

        l[0].apresentar();

    }

}
