package characters.protrossCharacter;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Protoss;
import characters.nature.Natureza;

public class Colosso extends Protoss{

    private int initialLife;

    public Colosso(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
        this.initialLife = 100;
    }

    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        int dano = 20;
        for (Guerreiro Individuo : lado2){
            Individuo.sofrerDano(dano);
        }

        if(getEnergia() < (initialLife/2)){
            recuperaçãoGelada(champion);
        }
    }
}

/*
 * Colosso: Seu ataque retira 20 pontos de energia de todos os inimigos da fila
 * adversária. É importante notar que todo inimigo que morrer deve sair da fila
 * imediatamente.
 */
