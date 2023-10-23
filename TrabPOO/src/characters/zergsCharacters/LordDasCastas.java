package characters.zergsCharacters;

import java.util.LinkedList;
import java.util.Random;

import characters.abstracts.Guerreiro;
import characters.abstracts.Zergs;
import characters.nature.Natureza;
import characters.nature.Organic;

public class LordDasCastas extends Zergs{

    public LordDasCastas(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
        this.setEnergia(200);
    }

    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
        Random random = new Random();
        int type = random.nextInt(2);
        createZerg(type, lado2);
    }
    

    private void createZerg(int type, LinkedList<Guerreiro> lista){
        if(type == 0){
            for(int i = 0; i < 3; i++){
                Guerreiro novoZerg = new Zergnideo(getNome(), 0, 0, new Organic());
                lista.add(1, novoZerg);
            }
        }else if(type == 1){
            for(int i = 0; i < 2; i++){
                Guerreiro novoZerg = new TatuBomba(getNome(), 0, 0, new Organic());
                lista.add(1, novoZerg);
            }
        }else{
            Guerreiro novoZerg = new Infestador(getNome(), 0, 0, new Organic());
            lista.add(1, novoZerg);
        }
    }
    
}

/*
 * . Lord das Castas: possui energia inicial de 200 e não possui ataque direto. Quando
 * ataca produz, aleatoriamente e com a mesma chance de seleção; ou três
 * Zergnideos, ou dois Tatus-bomba ou um Infestador. Os Zerg criados pelo Lord
 * das Castas recebem seu nome e o peso e altura ficam com valor 0 (zero).
 */
