package domain.terransCharacters;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Terrans;
import domain.nature.Natureza;
import domain.nature.Organic;

public class Ambunave extends Terrans{

    public Ambunave(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
    }

    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
        int remedio = 50;
        for (Guerreiro Individuo : lado1){
            if(champion.getType() instanceof Organic){
                Individuo.regenerat(remedio);
            }
        }
    }

    @Override
    public String toString() {
        return "Ambunave";
    }
    
}

/*
 * Ambunave: não possui ataque, ou seja, não consegue ferir unidades adversárias.
 * Na sua vez de atacar passa pela fila aliada recuperando até 50 pontos de energia
 * das unidades não mecânicas (Soldado, Fanaticus e Tormento).
 */