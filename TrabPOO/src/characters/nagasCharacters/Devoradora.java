package characters.nagasCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Nagas;

public class Devoradora extends Nagas{

    public Devoradora(String nome, int idade, double peso) {
        super(nome, idade,peso);
    }
    
    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> LadoTp, LinkedList<Guerreiro> LadoZn){
        int dano = 0;
        if(LadoZn.get(1) instanceof Empalador){
            for(int i = 4;i < 4; i++){
                Guerreiro novoNaga = new Servo(getNome(), getIdade(), getPeso());
                LadoZn.add(1,novoNaga);
            }
            LadoZn.remove(0);
        }else{
            dano = LadoZn.get(1).getEnergia();
            LadoZn.remove(1);
        }
        

        LadoTp.get(0).sofrerDano(dano*2);
    }   

}
