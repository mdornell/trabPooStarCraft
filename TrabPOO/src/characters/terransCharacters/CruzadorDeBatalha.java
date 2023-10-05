package characters.terransCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.TerransMechanic;

public class CruzadorDeBatalha extends TerransMechanic{

    private int ataqueFinal = 0;

    public CruzadorDeBatalha(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setEnergia(1000);
    }

    public void atacar(Guerreiro champion, LinkedList<Guerreiro> LadoTp, LinkedList<Guerreiro> LadoZn){
        int dano = 50;
        if(ataqueFinal == 3){
            int life = LadoZn.get(0).getEnergia();
            LadoZn.get(0).sofrerDano(life);;
            this.ataqueFinal = 0;
        }else{
            LadoZn.get(0).sofrerDano(dano);
            this.ataqueFinal += 1;
        }
    }
    
}
