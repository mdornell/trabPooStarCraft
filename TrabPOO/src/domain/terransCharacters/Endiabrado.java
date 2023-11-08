package domain.terransCharacters;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Terrans;
import domain.nature.Natureza;

// Declaração da classe Endiabrado que é uma subclasse de Terrans
public class Endiabrado extends Terrans {

    // Construtor da classe Endiabrado que chama o construtor da classe Terrans com os parâmetros fornecidos
    public Endiabrado(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Terrans
    }
    
    // Método implementado para atacar outros guerreiros
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        int dano = 15; // Quantidade de dano a ser causada no ataque principal
        int danoSecundario1 = dano - 5; // Quantidade de dano a ser causada nos ataques secundários
        int danoSecundario2 = dano - 10;

        // Chama o método gerarDano para causar dano a guerreiros no lado2
        this.gerarDano(lado2, 0, dano);
        this.gerarDano(lado2, 1, danoSecundario1);
        this.gerarDano(lado2, 2, danoSecundario2);
    }

    // Método privado para causar dano a um guerreiro em uma fila, com base em seu índice na fila
    private void gerarDano(LinkedList<Guerreiro> fila, int indice, int dano) {
        int ind = fila.size();
        if (ind > indice) {
            fila.get(indice).sofrerDano(dano); // Causa dano ao guerreiro na posição indicada pelo índice
        }
    }

    // Sobrescrita do método toString para retornar uma representação em string do Endiabrado
    @Override
    public String toString() {
        return "Endiabrado";
    }
}


/*
 * Endiabrado: unidade mecânica que dispara um feixe de fogo que afeta os três
 * primeiros inimigos da fila adversária. Seu ataque afeta o primeio inimigo da fila
 * adversária em 15 pontos, o segundo da fila em 10 pontos e o terceiro da fila em 5
 * pontos.
 */