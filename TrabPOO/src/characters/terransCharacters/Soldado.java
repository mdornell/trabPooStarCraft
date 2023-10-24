package characters.terransCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Terrans;
import characters.nature.Natureza;

public class Soldado extends Terrans {

    public Soldado(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
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
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
        int dano = 20;
        lado2.get(0).sofrerDano(dano);
    }
    
    @Override
    public String toString() {
        return "Soldado";
    }
    
}

/*
 * Soldado: unidade básica dos Terranos. Seu ataque retira 20 pontos de energia.
 */
