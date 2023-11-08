package domain.protrossCharacter;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Protoss;
import domain.nature.Natureza;

public class Colosso extends Protoss{

    public Colosso(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
    }

    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
        int dano = 20;
        for (Guerreiro Individuo : lado2){
            Individuo.sofrerDano(dano);
        }

        if(getEnergia() < (getEnenergiaMaxima()/2)){
            recuperaçãoGelada(champion);
        }
    }

    @Override
    public String toString() {
        return "Colosso";
    }
}

/*
 * Colosso: Seu ataque retira 20 pontos de energia de todos os inimigos da fila
 * adversária. É importante notar que todo inimigo que morrer deve sair da fila
 * imediatamente.
 */
