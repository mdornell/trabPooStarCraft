package characters.nagasCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Nagas;

public class Empalador extends Nagas{

    public Empalador(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setEnergia(400);
    }

    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> LadoTp, LinkedList<Guerreiro> LadoZn){
        int dano = 50;
        LadoTp.get(0).sofrerDano(dano);
        if(getEnergia() <= 100){
            LadoZn.remove(1);
            this.setEnergia(400);
        }
    }
    
}
