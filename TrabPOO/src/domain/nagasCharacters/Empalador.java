package domain.nagasCharacters;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Nagas;
import domain.nature.Natureza;

// Declaração da classe Empalador que é uma subclasse de Nagas
public class Empalador extends Nagas {

    // Construtor da classe Empalador que chama o construtor da classe Nagas com os parâmetros fornecidos
    public Empalador(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Nagas
        this.setEnergia(400); // Define o nível de energia inicial para 400
    }

    // Método implementado para atacar outro guerreiro
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        int dano = 50;
        lado1.get(0).sofrerDano(dano); // Causa dano ao campeão do lado1
        if (getEnergia() <= 100) {
            regenerarse(lado2); // Regenera-se se a energia estiver abaixo de 100
        }
    }

    // Método privado para regenerar o Empalador
    private void regenerarse(LinkedList<Guerreiro> lista) {
        if (lista.size() > 1) {
            lista.remove(1); // Remove um guerreiro da lista (presumivelmente para se regenerar)
            this.setEnergia(400); // Define o nível de energia de volta para 400
        }
    }

    // Sobrescrita do método toString para retornar uma representação em string do Empalador
    @Override
    public String toString() {
        return "Empalador";
    }
}

