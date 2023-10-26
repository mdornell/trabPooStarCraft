package domain.protrossCharacter;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Protoss;
import domain.nature.Machanic;
import domain.nature.Natureza;

public class Tormento extends Protoss{

    private int initialLife;

    public Tormento(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
        this.initialLife = 100;
    }

    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){

        Guerreiro atacante = lado1.get(0);
        int dano = 20;
        lado2.get(0).sofrerDano(dano);

        if(getEnergia() < (initialLife/2)){
            recuperaçãoGelada(atacante);
        }

        if(order){
            creatingClone(atacante,lado1);
        }
    }

    private void creatingClone(Guerreiro champion,LinkedList<Guerreiro> lista){
        lista.remove(champion);
        lista.addLast(champion);

        Guerreiro clone = new CloneTormento(getNome(), getIdade(), getPeso(),new Machanic());
        this.setEnergia(50);
        this.initialLife = 50;
        lista.addFirst(clone);
    }


    @Override
    public String toString() {
        return "Tormento";
    }
    
}

/*
 * Tormento: Seu ataque retira 30 pontos de energia. Se atacar primeiro, promove
 * seu ataque, gera um Clone Tormento (cujo ataque não promove dano) no inicio
 * da fila e vai para o final da fila, assim quem recebe o ataque é o Clone Tormento
 * e não o Tormento. O Clone Tormento possui energia inicial de 50 (não 100 como
 * a maioria dos Guerreiros). Se for o segundo a atacar, o Tormento apenas ataca e
 * vai para o final da fila.
 */