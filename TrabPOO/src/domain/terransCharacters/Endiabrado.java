package domain.terransCharacters;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Terrans;
import domain.nature.Natureza;

public class Endiabrado extends Terrans {

    public Endiabrado(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
    }
    
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
        int dano = 15;
        this.gerarDano(lado2, 0, dano);
        this.gerarDano(lado2, 1, dano-5);
        this.gerarDano(lado2, 2, dano-10);
    }

    private void gerarDano(LinkedList<Guerreiro> fila, int indice, int dano){
        int ind = fila.size();
        if(ind > indice){
            fila.get(indice).sofrerDano(dano);
        }
    }

    @Override
    public String toString() {
        return "Endiabrado";
    }
}

/*
 * Endiabrado: unidade mecânica que dispara um feixe de fogo que afeta os três
 * primeiros inimigos da fila adversária. Seu ataque afeta o primeio inimigo da fila
 * adversária em 15 pontos, o segundo da fila em 10 pontos e o terceiro da fila em 5
 * pontos.
 */