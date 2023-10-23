package characters.terransCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Terrans;
import characters.nature.Natureza;

public class CruzadorDeBatalha extends Terrans{

    private int ataqueFinal = 0;

    public CruzadorDeBatalha(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
        this.setEnergia(1000);
    }

    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
        int dano = 50;
        if(ataqueFinal == 3){
            int life = lado2.get(0).getEnergia();
            lado2.get(0).sofrerDano(life);;
            this.ataqueFinal = 0;
        }else{
            lado2.get(0).sofrerDano(dano);
            this.ataqueFinal += 1;
        }
    }   
}

/*
 * Ambunave: não possui ataque, ou seja, não consegue ferir unidades adversárias.
 * Na sua vez de atacar passa pela fila aliada recuperando até 50 pontos de energia
 * das unidades não mecânicas (Soldado, Fanaticus e Tormento).
 */