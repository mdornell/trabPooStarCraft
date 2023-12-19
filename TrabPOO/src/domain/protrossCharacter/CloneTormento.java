package domain.protrossCharacter;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Protoss;
import domain.nature.Natureza;

// Declaração da classe CloneTormento que é uma subclasse de Protoss
public class CloneTormento extends Protoss {

    // Construtor da classe CloneTormento que chama o construtor da classe Protoss com os parâmetros fornecidos
    public CloneTormento(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Protoss
        this.setEnergia(50); // Define o nível de energia inicial como 50
    }

    // Método implementado para atacar outro guerreiro, mas neste caso, não faz nada (retorna imediatamente)
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        return; // Não realiza nenhuma ação de ataque
    }

    // Sobrescrita do método toString para retornar uma representação em string do CloneTormento
    @Override
    public String toString() {
        return "Clone_Tormento";
    }
}
