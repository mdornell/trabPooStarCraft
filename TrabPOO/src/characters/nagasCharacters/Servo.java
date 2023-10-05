package characters.nagasCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Nagas;
import characters.abstracts.Organic;

public class Servo extends Nagas {

    public Servo(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }


    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> LadoTp, LinkedList<Guerreiro> LadoZn){
        invenenar(LadoTp.get(0), LadoTp);
    }

    public void invenenar(Guerreiro individuo,LinkedList<Guerreiro> LadoTp){
        if(individuo instanceof Organic){
            ((Organic)individuo).envenedado();
        }
    }
    
}
