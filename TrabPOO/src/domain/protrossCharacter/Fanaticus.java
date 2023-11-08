// package domain.protrossCharacter;

// import java.util.LinkedList;

// import domain.abstracts.Guerreiro;
// import domain.abstracts.Protoss;
// import domain.nature.Natureza;

// public class Fanaticus extends Protoss{

    
//     public Fanaticus(String nome, int idade, double peso, Natureza type) {
//         super(nome, idade, peso, type);
//     }
    
//     @Override
//     public void setEnergia(int energia) {
//         if(energia > 200){
//             super.setEnergia(200);
//         }else{
//             super.setEnergia(energia);
//         }
//     }

//     @Override
//     public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){        
//         int dano = 20;
//         lado2.get(0).sofrerDano(dano);

//         if(getEnergia() < (getEnenergiaMaxima()/2)){
//             recuperaçãoGelada(champion);
//         }
//     }

//     @Override
//     public String toString() {
//         return "Fanaticus";
//     }

// }

package domain.protrossCharacter;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Protoss;
import domain.nature.Natureza;

// Declaração da classe Fanaticus que é uma subclasse de Protoss
public class Fanaticus extends Protoss {

    // Construtor da classe Fanaticus que chama o construtor da classe Protoss com os parâmetros fornecidos
    public Fanaticus(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Protoss
    }

    // Sobrescrita do método setEnergia para limitar o valor de energia a 200 no máximo
    @Override
    public void setEnergia(int energia) {
        if (energia > 200) {
            super.setEnergia(200); // Define a energia como 200 se for maior que 200
        } else {
            super.setEnergia(energia); // Caso contrário, define a energia com o valor fornecido
        }
    }

    // Sobrescrita do método atacar para causar dano ao guerreiro do lado2
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        int dano = 20;
        lado2.get(0).sofrerDano(dano); // Causa dano ao primeiro guerreiro no lado2

        // Verifica se a energia do Fanaticus está abaixo da metade da energia máxima e ativa a recuperação gelada
        if (getEnergia() < (getEnergiaMaxima() / 2)) {
            recuperaçãoGelada(champion);
        }
    }

    // Sobrescrita do método toString para retornar uma representação em string do Fanaticus
    @Override
    public String toString() {
        return "Fanaticus";
    }
}


/*
 *  Fanaticus: unidade básica dos Protons. Seu ataque retira 30 pontos de energia.
 *  Apesar de começarem com 100 pontos de energia podem chegar a 200 pontos de
 * energia (seu limite) se curados por Ambunaves.
 */