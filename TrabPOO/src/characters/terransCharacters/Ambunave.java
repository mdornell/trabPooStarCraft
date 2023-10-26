package characters.terransCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Terrans;
import characters.nature.Natureza;
import characters.nature.Organic;

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