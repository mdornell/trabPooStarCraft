package characters.nagasCharacters;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import characters.abstracts.Nagas;
import characters.nature.Natureza;

public class Devoradora extends Nagas{

    public Devoradora(String nome, int idade, double peso, Natureza type) {
        super(nome, idade,peso, type);
    }
    
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2){
        champion.atacar(this, lado1, lado2);
    } 
    
    public void verificaSeMorreu(Guerreiro guerreiro, LinkedList<Guerreiro> fila){
        
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
