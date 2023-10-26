package domain.abstracts;

import domain.nature.Natureza;

public abstract class Terrans extends Guerreiro{

    public Terrans(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type);
    }   
}

/*
 * Terranos não estrapolam seu limite de energia, ou seja, se uma Ambunave recupera
 * a energia de um Soldado, mas esse está com 90 pontos de energia, por exemplo,
 * ele não vai para 140 pontos de energia, vai para apenas 100 (que é o máximo). A
 * unica unidade Terrana com mais de 100 pontos de energia é o Cruzador.
 */
