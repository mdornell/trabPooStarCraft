package domain.zergsCharacters;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Zergs;
import domain.nature.Natureza;

// Declaração da classe Zergnideo que é uma subclasse de Zergs
public class Zergnideo extends Zergs {

    // Construtor da classe Zergnideo que chama o construtor da classe Zergs com os parâmetros fornecidos
    public Zergnideo(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Zergs
        this.setEnergia(50); // Inicializa a energia com 50
    }

    // Método implementado para atacar outro guerreiro
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        int dano = 5;
        lado1.get(0).sofrerDano(dano); // Causa um pequeno dano (`dano = 5`) ao guerreiro no `lado1`
    }

    // Sobrescrita do método toString para retornar uma representação em string do Zergnideo
    @Override
    public String toString() {
        return "Zergnideo";
    }
}


/*
 * Zergnideo: unidade básica dos Zerg. Seu ataque retira apenas 5 pontos de
 * energia. Nasce com apenas 50 pontos de energia.
 */