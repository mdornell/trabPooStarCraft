package characters.terransCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.TerransOrganic;

public class Soldado extends TerransOrganic {

    public Soldado(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void setEnergia(int energia) {
        if(energia > 100){
            super.setEnergia(100);
        }else{
            super.setEnergia(energia);
        }
    }

    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> LadoTp, LinkedList<Guerreiro> LadoZn){
        int dano = 20;
        LadoZn.get(0).sofrerDano(dano);
    }
    
    
}
