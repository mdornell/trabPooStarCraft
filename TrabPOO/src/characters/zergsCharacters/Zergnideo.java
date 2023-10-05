package characters.zergsCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Zergs;

public class Zergnideo extends Zergs{

    public Zergnideo(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setEnergia(50);
    }

    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> LadoTp, LinkedList<Guerreiro> LadoZn){
        int dano = 5;
        LadoTp.get(0).sofrerDano(dano);
    }
    
}
