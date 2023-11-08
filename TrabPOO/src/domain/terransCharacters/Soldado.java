// package domain.terransCharacters;

// import java.util.LinkedList;

// import domain.abstracts.Guerreiro;
// import domain.abstracts.Terrans;
// import domain.nature.Natureza;

// public class Soldado extends Terrans {

//     public Soldado(String nome, int idade, double peso, Natureza type) {
//         super(nome, idade, peso, type);
//     }

//     @Override
//     public void setEnergia(int energia) {
//         if(energia > 100){
//             super.setEnergia(100);
//         }else{
//             super.setEnergia(energia);
//         }
//     }

//     // @Override
//     public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
//         int dano = 20;
//         lado2.get(0).sofrerDano(dano);
//     }
    
//     @Override
//     public String toString() {
//         return "Soldado";
//     }
    
// }

package domain.terransCharacters;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Terrans;
import domain.nature.Natureza;

// Declaração da classe Soldado que é uma subclasse de Terrans
public class Soldado extends Terrans {

    // Construtor da classe Soldado que chama o construtor da classe Terrans com os parâmetros fornecidos
    public Soldado(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Terrans
    }

    // Sobrescrita do método setEnergia para limitar o valor de energia entre 0 e 100
    @Override
    public void setEnergia(int energia) {
        if (energia > 100) {
            super.setEnergia(100); // Define a energia como 100 se for maior do que 100
        } else {
            super.setEnergia(energia); // Caso contrário, define a energia com o valor fornecido
        }
    }

    // @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        int dano = 20; // Quantidade de dano a ser causada

        // Causa dano ao primeiro guerreiro no lado2
        lado2.get(0).sofrerDano(dano);
    }

    // Sobrescrita do método toString para retornar uma representação em string do Soldado
    @Override
    public String toString() {
        return "Soldado";
    }
}


/*
 * Soldado: unidade básica dos Terranos. Seu ataque retira 20 pontos de energia.
 */
