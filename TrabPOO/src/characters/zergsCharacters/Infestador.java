package characters.zergsCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Zergs;
public class Infestador extends Zergs{

    public Infestador(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> LadoTp, LinkedList<Guerreiro> LadoZn){
        //Fazer o primeiro a atacar

        //Segundo a atacar
        createZerg(LadoZn);
    }

    private void createZerg(LinkedList<Guerreiro> LadoZn){
        Guerreiro novoZerg = new Zergnideo(getNome(), getIdade(), getPeso());
        LadoZn.add(1, novoZerg);

    }
    
}
