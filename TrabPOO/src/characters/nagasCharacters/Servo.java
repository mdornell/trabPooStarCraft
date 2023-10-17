package characters.nagasCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Nagas;
import characters.nature.Natureza;
import characters.nature.Organic;

public class Servo extends Nagas {

    public Servo(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
    }


    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        invenenar(lado1.get(0), lado2);
    }

    public void invenenar(Guerreiro individuo,LinkedList<Guerreiro> LadoTp){
        if(individuo.getType() instanceof Organic){
            Organic natureza = (Organic) individuo.getType();
            natureza.envenenar();
        }
    }
    
}

/*
 * . Servo: unidade básica dos Naga. Não possuem ataque mas colocam um “broto de
 * veneno” em seus adversários. Esse “broto de veneno” retira 1 ponto de energia
 * toda vez que é ativado. Os “brotos de veneno” não afetam unidades mecânicas
 * (Endiabrado, Ambunave, Cruzador de Batalha, Colosso e Transportadora). A
 * ativação de “brotos de veneno” ocorre toda vez que o adversário ataca. Não há
 * limite para a quantidade de “brotos de veneno”
 */
