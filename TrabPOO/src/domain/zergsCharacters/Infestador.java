package domain.zergsCharacters;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Zergs;
import domain.nature.Natureza;
import domain.nature.Organic;

// Declaração da classe Infestador que é uma subclasse de Zergs
public class Infestador extends Zergs {

    // Construtor da classe Infestador que chama o construtor da classe Zergs com os parâmetros fornecidos
    public Infestador(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Zergs
    }

    // Método implementado para atacar outros guerreiros
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        if (order) {
            Guerreiro controlado = lado1.get(0);
            controlado.atacar(controlado, lado2, lado1, false);
        } else {
            createZerg(lado2);
        }
    }

    // Método privado para criar um novo Zerg e adicioná-lo à lista de guerreiros
    private void createZerg(LinkedList<Guerreiro> lista) {
        Guerreiro novoZerg = new Zergnideo(getNome(), getIdade(), getPeso(), new Organic());
        lista.add(1, novoZerg); // Adiciona o novo Zerg à lista de guerreiros no índice 1
    }

    // Sobrescrita do método toString para retornar uma representação em string do Infestador
    @Override
    public String toString() {
        return "Infestador";
    }
}


/*
 * Infestador: não possui ataque. Se for o primeiro a atacar, controla o adversário e
 * o faz atacar seus aliados (na sua própria fila), nesse caso o Infestador não sofre
 * ataque (no caso especifico da Ambunave ser o adversário, isso irá fazer com que
 * essa unidade recupere a energia de Zergs e Nagas - todas as unidades pois todas
 * são organicas, ou seja, não mecânicas). Se for o segundo a atacar, gera um
 * Zergnideo com seu nome (nome do Infestador), peso e idade, na sequencia vai
 * para o final da fila.
 */

