package characters.protrossCharacter;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Protoss;
import characters.nature.Natureza;

public class CloneTormento extends Protoss {

    public CloneTormento(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
    }

    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        
    }

    @Override
    public String toString() {
        return "Clone Tormento";
    }
    
}
