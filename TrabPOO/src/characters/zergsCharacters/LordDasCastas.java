package characters.zergsCharacters;

import java.util.LinkedList;
import java.util.Random;

import characters.abstracts.Guerreiro;
import characters.abstracts.Zergs;

public class LordDasCastas extends Zergs{

    public LordDasCastas(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setEnergia(200);
    }

    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> LadoTp, LinkedList<Guerreiro> LadoZn){
        Random random = new Random();
        int type = random.nextInt(2);
        createZerg(type, LadoZn);
    }
    


    private void createZerg(int type, LinkedList<Guerreiro> LadoZn){
        if(type == 0){
            for(int i = 0; i < 3; i++){
                Guerreiro novoZerg = new Zergnideo(getNome(), 0, 0);
                LadoZn.add(1, novoZerg);
            }
        }else if(type == 1){
            for(int i = 0; i < 2; i++){
                Guerreiro novoZerg = new TatuBomba(getNome(), 0, 0);
                LadoZn.add(1, novoZerg);
            }
        }else{
            Guerreiro novoZerg = new Infestador(getNome(), 0, 0);
            LadoZn.add(1, novoZerg);
        }
    }
    
}
