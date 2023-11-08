package domain.nagasCharacters;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Nagas;
import domain.nature.Natureza;

// Declaração da classe Devoradora que é uma subclasse de Nagas
public class Devoradora extends Nagas {

    // Construtor da classe Devoradora que chama o construtor da classe Nagas com os parâmetros fornecidos
    public Devoradora(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Nagas
    }

    // Método implementado para atacar outro guerreiro
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        int dano;
        if (lado2.size() > 1) {
            Guerreiro alimento = lado2.get(1);
            if (alimento instanceof Empalador) {
                lado2.remove(champion);
                criaServos(lado2);
            } else {
                dano = alimento.getEnergia() * 2;
                lado2.remove(alimento);
                lado1.get(0).sofrerDano(dano);
            }
        } else {
            return;
        }
    }

    // Método para criar servos e adicioná-los a uma fila
    public void criaServos(LinkedList<Guerreiro> fila) {
        for (int i = 0; i < 4; i++) {
            fila.add(new Servo(getNome(), getIdade(), getPeso(), getType()));
        }
    }

    // Sobrescrita do método toString para retornar uma representação em string da Devoradora
    @Override
    public String toString() {
        return "Devoradora";
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
