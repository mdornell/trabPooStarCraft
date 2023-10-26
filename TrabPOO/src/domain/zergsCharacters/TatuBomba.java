package domain.zergsCharacters;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Zergs;
import domain.nature.Natureza;

public class TatuBomba extends Zergs{

    public TatuBomba(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
    }


    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
        int dano = 100;
        lado1.get(0).sofrerDano(dano);

        lado2.remove(0);
    }

    @Override
    public String toString() {
        return "Tatu Bomba";
    }
    
}

/*
 * Tatu-bomba: unidade suicida dos Zerg. Quando ataca morre, mas retira 100
 * pontos de energia do adversário atacado 
 */
