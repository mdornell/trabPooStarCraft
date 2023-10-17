package characters.nagasCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Nagas;
import characters.nature.Natureza;
import characters.nature.Organic;

public class Devoradora extends Nagas{

    public Devoradora(String nome, int idade, double peso, Natureza type) {
        super(nome, idade,peso, type);
    }
    
    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        int dano = 0;
        if(lado2.get(1) instanceof Empalador){
            for(int i = 4;i < 4; i++){
                Guerreiro novoNaga = new Servo(getNome(), getIdade(), getPeso(),new Organic());
                lado2.add(1,novoNaga);
            }
            lado2.remove(0);
        }else{
            dano = lado2.get(1).getEnergia();
            lado2.remove(1);
        }
        

        lado1.get(0).sofrerDano(dano*2);
    }   

}

/*
 * Devoradora: devora o aliado que está na sequencia na fila (o segundo da fila
 * Naga ou Zerg, não importa). Seu ataque então é exatamente a quantidade de
 * energia do aliado devorado multiplicado por dois. Ou seja, se devora um aliado
 * que, no momento que foi comido, estava com 80 pontos de energia, seu ataque
 * terá 160 pontos de energia. Devoradoras só não conseguem comer Empaladores,
 * quando elas tentam, elas morrem e geram quatro servos. Se não houver ninguém
 * para a Devoradora devorar (última Guerreiro da sua fila) seu ataque é de zero.
 */
