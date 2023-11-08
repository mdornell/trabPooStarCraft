package domain.abstracts;

import domain.nature.Natureza;

// Declaração da classe abstrata Zergs, que estende a classe Guerreiro
public abstract class Zergs extends Guerreiro {

    // Construtor da classe Zergs que chama o construtor da classe Guerreiro com os parâmetros fornecidos
    public Zergs(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Guerreiro
    }
}

