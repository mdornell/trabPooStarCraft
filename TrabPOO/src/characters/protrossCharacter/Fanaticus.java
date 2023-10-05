package characters.protrossCharacter;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.ProtossOrganic;

public class Fanaticus extends ProtossOrganic{

    public Fanaticus(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }
    
    @Override
    public void setEnergia(int energia) {
        if(energia > 200){
            super.setEnergia(200);
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
