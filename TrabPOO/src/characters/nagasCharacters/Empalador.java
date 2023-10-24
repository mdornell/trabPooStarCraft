package characters.nagasCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Nagas;
import characters.nature.Natureza;

public class Empalador extends Nagas{

    public Empalador(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
        this.setEnergia(400);
    }

    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
        int dano = 50;
        lado1.get(0).sofrerDano(dano);
        if(getEnergia() <= 100){
            lado2.remove(1);
            this.setEnergia(400);
        }
    }
    
    @Override
    public String toString() {
        return "Empalador";
    }

}
