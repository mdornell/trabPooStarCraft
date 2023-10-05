package characters.protrossCharacter;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.ProtossOrganic;

public class Tormento extends ProtossOrganic{

    public Tormento(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> LadoTp, LinkedList<Guerreiro> LadoZn){
        int dano = 20;
        LadoZn.get(0).sofrerDano(dano);

        creatingClone(LadoTp);
    }

    private void creatingClone(LinkedList<Guerreiro> LadoTp){
        Guerreiro clone = new Tormento(getNome(), getIdade(), getPeso());
        this.setEnergia(50);
        LadoTp.addFirst(clone);
    }
    
}
