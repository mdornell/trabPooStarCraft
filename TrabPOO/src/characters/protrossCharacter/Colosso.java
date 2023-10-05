package characters.protrossCharacter;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.ProtossMechanic;

public class Colosso extends ProtossMechanic{

    public Colosso(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> LadoTp, LinkedList<Guerreiro> LadoZn){
        int dano = 20;
        for (Guerreiro Individuo : LadoZn){
            Individuo.sofrerDano(dano);
        }
    }
}
