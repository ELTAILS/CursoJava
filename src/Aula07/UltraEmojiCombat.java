package Aula07;

import java.util.Random;

public class UltraEmojiCombat {

    static void main(String[] args) throws Exception {
        Lutador [] lutadores = new Lutador[6];

        lutadores[0] = new Lutador("Pretty Boy", "França", 31,1.75,69.8,11,2,1);
        lutadores[1] = new Lutador("Putscript","Brasil",29,1.68,57.8,14,2,3);
        lutadores[2] = new Lutador("Snapshadow","EUA",35,1.65,80.9,12,2,1);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 1.93,81.6,13,0,3);
        lutadores[4] = new Lutador("UfoCobol", "Brasil", 37,1.70,119.3,5,4,3);
        lutadores[5] = new Lutador("Nerdaart", "EUA",30,1.81,105.7,12,2,4);


            Luta UEC01 = new Luta();
            UEC01.marcarLuta(lutadores[0],lutadores[1]);
            UEC01.luta();


    }


}
