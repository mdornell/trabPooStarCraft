package characters.zergsCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Zergs;

public class TatuBomba extends Zergs{

    public TatuBomba(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }


    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> LadoTp, LinkedList<Guerreiro> LadoZn){
        int dano = 100;
        LadoTp.get(0).sofrerDano(dano);

        LadoZn.remove(0);
    }
    
}
