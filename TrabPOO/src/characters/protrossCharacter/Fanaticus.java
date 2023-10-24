package characters.protrossCharacter;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Protoss;
import characters.nature.Natureza;

public class Fanaticus extends Protoss{

    
    public Fanaticus(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
    }
    
    @Override
    public void setEnergia(int energia) {
        if(energia > 200){
            super.setEnergia(200);
        }else{
            super.setEnergia(energia);
        }
    }

    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){        
        int dano = 20;
        lado2.get(0).sofrerDano(dano);

        if(getEnergia() < (getEnenergiaMaxima()/2)){
            recuperaçãoGelada(champion);
        }
    }

    @Override
    public String toString() {
        return "Fanaticus";
    }

}

/*
 *  Fanaticus: unidade básica dos Protons. Seu ataque retira 30 pontos de energia.
 *  Apesar de começarem com 100 pontos de energia podem chegar a 200 pontos de
 * energia (seu limite) se curados por Ambunaves.
 */