package characters.protrossCharacter;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.ProtossMechanic;

public class Transpotadora extends ProtossMechanic {

    private int intecepitadores = 0;

    public Transpotadora(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setEnergia(500);
    }

    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> LadoTp, LinkedList<Guerreiro> LadoZn){
        int dano = 25;
        if(intecepitadores < 8){
            intecepitadores++;
        }

        LadoZn.get(0).sofrerDano(dano * intecepitadores);
    }
    
}
