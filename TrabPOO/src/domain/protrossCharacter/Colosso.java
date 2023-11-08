package domain.protrossCharacter;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Protoss;
import domain.nature.Natureza;

// Declaração da classe Colosso que é uma subclasse de Protoss
public class Colosso extends Protoss {

    // Construtor da classe Colosso que chama o construtor da classe Protoss com os parâmetros fornecidos
    public Colosso(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Protoss
    }

    // Método implementado para atacar outros guerreiros
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        int dano = 20;
        // Causa dano a todos os guerreiros do lado2
        for (Guerreiro individuo : lado2) {
            individuo.sofrerDano(dano);
        }

        int sizeList = lado2.size();
        // Verifica se algum guerreiro no lado2 tem energia negativa e remove-os da lista
        for (int i = 0; i < sizeList; i++) {
            if (lado2.get(i).getEnergia() < 0) {
                lado2.remove(i);
                sizeList = lado2.size();
                i = 0;
            }
        }

        // Verifica se a energia do Colosso está abaixo de metade da energia máxima e ativa a recuperação gelada
        if (getEnergia() < (getEnergiaMaxima() / 2)) {
            recuperaçãoGelada(champion);
        }
    }

    // Sobrescrita do método toString para retornar uma representação em string do Colosso
    @Override
    public String toString() {
        return "Colosso";
    }
}

/*
 * Colosso: Seu ataque retira 20 pontos de energia de todos os inimigos da fila
 * adversária. É importante notar que todo inimigo que morrer deve sair da fila
 * imediatamente.
 */
