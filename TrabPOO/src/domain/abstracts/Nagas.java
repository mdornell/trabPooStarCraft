package domain.abstracts;

import domain.nature.Natureza;

// Declaração da classe abstrata Nagas, que estende a classe Guerreiro
public abstract class Nagas extends Guerreiro {

    // Construtor da classe Nagas que chama o construtor da classe Guerreiro com os parâmetros fornecidos
    public Nagas(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Guerreiro
    }
}
