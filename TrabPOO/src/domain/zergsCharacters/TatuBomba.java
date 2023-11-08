// package domain.zergsCharacters;

// import java.util.LinkedList;

// import domain.abstracts.Guerreiro;
// import domain.abstracts.Zergs;
// import domain.nature.Natureza;

// public class TatuBomba extends Zergs{

//     public TatuBomba(String nome, int idade, double peso, Natureza type) {
//         super(nome, idade, peso, type);
//     }


//     @Override
//     public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
//         int dano = 100;
//         lado1.get(0).sofrerDano(dano);

//         lado2.remove(0);
//     }

//     @Override
//     public String toString() {
//         return "Tatu Bomba";
//     }
    
// }

package domain.zergsCharacters;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Zergs;
import domain.nature.Natureza;

// Declaração da classe TatuBomba que é uma subclasse de Zergs
public class TatuBomba extends Zergs {

    // Construtor da classe TatuBomba que chama o construtor da classe Zergs com os parâmetros fornecidos
    public TatuBomba(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Zergs
    }

    // Método implementado para atacar outro guerreiro
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        int dano = 100;
        lado1.get(0).sofrerDano(dano); // Causa um grande dano ao guerreiro no lado1

        lado2.remove(0); // Remove o primeiro guerreiro no lado2 após o ataque
    }

    // Sobrescrita do método toString para retornar uma representação em string do TatuBomba
    @Override
    public String toString() {
        return "Tatu Bomba";
    }
}


/*
 * Tatu-bomba: unidade suicida dos Zerg. Quando ataca morre, mas retira 100
 * pontos de energia do adversário atacado 
 */
