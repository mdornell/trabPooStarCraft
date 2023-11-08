// package domain.abstracts;

// import domain.nature.Natureza;

// public abstract class Protoss extends Guerreiro{

//     public Protoss(String nome, int idade, double peso, Natureza type) {
//         super(nome, idade, peso, type);
//     }

//     protected void recuperaçãoGelada(Guerreiro protoss){
//         int regereracao = (int) ((protoss.getEnergia())*0.05);
//         protoss.regenerat(regereracao);
//     }
// }

package domain.abstracts;

import domain.nature.Natureza;

// Declaração da classe abstrata Protoss, que estende a classe Guerreiro
public abstract class Protoss extends Guerreiro {

    // Construtor da classe Protoss que chama o construtor da classe Guerreiro com os parâmetros fornecidos
    public Protoss(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Guerreiro
    }

    // Método personalizado "recuperaçãoGelada" para recuperar a energia do Guerreiro Protoss
    protected void recuperaçãoGelada(Guerreiro protoss) {
        // Calcula a quantidade de energia a ser regenerada como 5% da energia atual do Protoss
        int regeneracao = (int) ((protoss.getEnergia()) * 0.05);
        // Chama o método "regenerat" para aumentar a energia do Protoss
        protoss.regenerar(regeneracao);
    }
}


/*
 * Protons possuem a “recuperação gelada”. Toda vez que atacam e estão com menos
 * de 50% da energia inicial recuperam 5% da sua energia.
 */
