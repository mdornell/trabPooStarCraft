package domain.zergsCharacters;

import java.util.LinkedList;
import java.util.Random;

import domain.abstracts.Guerreiro;
import domain.abstracts.Zergs;
import domain.nature.Natureza;
import domain.nature.Organic;

// Declaração da classe LordDasCastas que é uma subclasse de Zergs
public class LordDasCastas extends Zergs {

    // Variável para gerar números aleatórios
    private Random random;

    // Construtor da classe LordDasCastas que chama o construtor da classe Zergs com os parâmetros fornecidos
    public LordDasCastas(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Zergs
        this.setEnergia(200); // Inicializa a energia com 200
        this.random = new Random(); // Inicializa a variável random para gerar números aleatórios
    }

    // Método implementado para realizar um ataque especial
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        int type = this.random.nextInt(2); // Gera um número aleatório entre 0 e 1

        // Cria Zergs com base no tipo gerado aleatoriamente
        createZerg(type, lado2);
    }

    // Método privado para criar Zergs com base no tipo e adicioná-los à lista de guerreiros
    private void createZerg(int type, LinkedList<Guerreiro> lista) {
        if (type == 0) {
            // Cria 3 Zergnideos e os adiciona à lista
            for (int i = 0; i < 3; i++) {
                Guerreiro novoZerg = new Zergnideo(getNome(), 0, 0, new Organic());
                lista.add(1, novoZerg);
            }
        } else if (type == 1) {
            // Cria 2 TatuBombas e os adiciona à lista
            for (int i = 0; i < 2; i++) {
                Guerreiro novoZerg = new TatuBomba(getNome(), 0, 0, new Organic());
                lista.add(1, novoZerg);
            }
        } else {
            // Cria um Infestador e o adiciona à lista
            Guerreiro novoZerg = new Infestador(getNome(), 0, 0, new Organic());
            lista.add(1, novoZerg);
        }
    }

    // Sobrescrita do método toString para retornar uma representação em string do LordDasCastas
    @Override
    public String toString() {
        return "Lord_das_Castas";
    }
}


/*
 * . Lord das Castas: possui energia inicial de 200 e não possui ataque direto. Quando
 * ataca produz, aleatoriamente e com a mesma chance de seleção; ou três
 * Zergnideos, ou dois Tatus-bomba ou um Infestador. Os Zerg criados pelo Lord
 * das Castas recebem seu nome e o peso e altura ficam com valor 0 (zero).
 */
