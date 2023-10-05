package characters.terransCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.TerransMechanic;

public class Endiabrado extends TerransMechanic {

    public Endiabrado(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }
    
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> LadoTp, LinkedList<Guerreiro> LadoZn){
        int dano = 15;
        LadoZn.get(0).sofrerDano(dano);
        LadoZn.get(1).sofrerDano(dano-5);
        LadoZn.get(2).sofrerDano(dano-10);
    }

}
