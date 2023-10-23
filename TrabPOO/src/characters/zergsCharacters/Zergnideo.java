package characters.zergsCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Zergs;
import characters.nature.Natureza;

public class Zergnideo extends Zergs{

    public Zergnideo(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
        this.setEnergia(50);
    }

    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
        int dano = 5;
        lado1.get(0).sofrerDano(dano);
    }
    
}


/*
 * Zergnideo: unidade básica dos Zerg. Seu ataque retira apenas 5 pontos de
 * energia. Nasce com apenas 50 pontos de energia.
 */