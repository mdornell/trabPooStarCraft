package domain.terransCharacters;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Terrans;
import domain.nature.Natureza;
import domain.nature.Organic;

// Declaração da classe Ambunave que é uma subclasse de Terrans
public class Ambunave extends Terrans {

    // Construtor da classe Ambunave que chama o construtor da classe Terrans com os parâmetros fornecidos
    public Ambunave(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Terrans
    }

    // Método implementado para atacar outros guerreiros
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        int remedio = 50; // Quantidade de "remédio" a ser aplicado

        if (order) {
            // Se a ordem for verdadeira, percorre a lista de guerreiros no lado1
            for (Guerreiro individuo : lado1) {
                // Verifica se o tipo do guerreiro é Organic
                if (individuo.getType() instanceof Organic) {
                    individuo.regenerar(remedio); // Aplica regeneração ao guerreiro
                }
            }
        } else {
            // Se a ordem for falsa, percorre a lista de guerreiros no lado2
            for (Guerreiro individuo : lado2) {
                // Verifica se o tipo do guerreiro é Organic
                if (individuo.getType() instanceof Organic) {
                    individuo.regenerar(remedio); // Aplica regeneração ao guerreiro
                }
            }
        }
    }

    // Sobrescrita do método toString para retornar uma representação em string da Ambunave
    @Override
    public String toString() {
        return "Ambunave";
    }
}


/*
 * Ambunave: não possui ataque, ou seja, não consegue ferir unidades adversárias.
 * Na sua vez de atacar passa pela fila aliada recuperando até 50 pontos de energia
 * das unidades não mecânicas (Soldado, Fanaticus e Tormento).
 */