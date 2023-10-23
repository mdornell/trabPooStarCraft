package characters.protrossCharacter;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Protoss;
import characters.nature.Natureza;

public class Transpotadora extends Protoss {

    private int intecepitadores;

    public Transpotadora(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
        this.setEnergia(500);
        this.setInitialLife(getEnergia());
        this.intecepitadores = 0;
    }

    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
        int dano = 25;
        if(intecepitadores < 8){
            intecepitadores++;
        }
        lado2.get(0).sofrerDano(dano * intecepitadores);
        
        if(getEnergia() < (getInitialLife()/2)){
            recuperaçãoGelada(champion);
        }
    }
    
}

/*
 * Transportadora: Produz interceptadores que possuem ataque de 25 pontos de
 * energia. A cada vez que a Transportadora ataca cria um novo interceptador, ou
 * seja, no primeiro ataque possui um interceptador, no segundo dois
 * interceptadores, no terceiro três e assim sucessivamente até o limite de oito
 * interceptadores. As Transportadoras começam com 500 pontos de energia.
 * Quando a Transportadora é eliminada seus interceptadores também o são. Os
 * interceptadores não são atacados a Transportadora que é.
 */
