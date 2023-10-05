package characters.terransCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Organic;
import characters.abstracts.TerransMechanic;

public class Ambunave extends TerransMechanic{

    public Ambunave(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> LadoTp, LinkedList<Guerreiro> LadoZn){
        int remedio = 50;
        for (Guerreiro Individuo : LadoTp){
            if(champion instanceof Organic){
                Individuo.regenerat(remedio);
            }
        }
    }
    
}
