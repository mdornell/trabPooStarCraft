package characters.terransCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Terrans;
import characters.nature.Natureza;

public class Endiabrado extends Terrans {

    public Endiabrado(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
    }
    
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        int dano = 15;
        lado2.get(0).sofrerDano(dano);
        lado2.get(1).sofrerDano(dano-5);
        lado2.get(2).sofrerDano(dano-10);
    }

}

/*
 * Endiabrado: unidade mecânica que dispara um feixe de fogo que afeta os três
 * primeiros inimigos da fila adversária. Seu ataque afeta o primeio inimigo da fila
 * adversária em 15 pontos, o segundo da fila em 10 pontos e o terceiro da fila em 5
 * pontos.
 */