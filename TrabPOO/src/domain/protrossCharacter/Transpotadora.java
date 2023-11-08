// package domain.protrossCharacter;

// import java.util.LinkedList;

// import domain.abstracts.Guerreiro;
// import domain.abstracts.Protoss;
// import domain.nature.Natureza;

// public class Transpotadora extends Protoss {

//     private int intecepitadores;

//     public Transpotadora(String nome, int idade, double peso, Natureza type) {
//         super(nome, idade, peso, type);
//         this.setEnergia(500);
//         this.intecepitadores = 0;
//     }

//     @Override
//     public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
//         int dano = 25;
//         if(intecepitadores < 8){
//             intecepitadores++;
//         }
//         lado2.get(0).sofrerDano(dano * intecepitadores);
        
//         if(getEnergia() < (getEnenergiaMaxima()/2)){
//             recuperaçãoGelada(champion);
//         }
//     }
    
//     @Override
//     public String toString() {
//         return "Transportadora";
//     }

// }

package domain.protrossCharacter;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Protoss;
import domain.nature.Natureza;

// Declaração da classe Transpotadora que é uma subclasse de Protoss
public class Transpotadora extends Protoss {

    private int intecepitadores; // Variável para rastrear o número de interceptadores

    // Construtor da classe Transpotadora que chama o construtor da classe Protoss com os parâmetros fornecidos
    public Transpotadora(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Protoss
        this.setEnergia(500); // Define o nível de energia inicial como 500
        this.intecepitadores = 0; // Inicializa o número de interceptadores como 0
    }

    // Método implementado para atacar outros guerreiros
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        int dano = 25;
        if (intecepitadores < 8) {
            intecepitadores++; // Incrementa o número de interceptadores se for menor que 8
        }
        lado2.get(0).sofrerDano(dano * intecepitadores); // Causa dano ao primeiro guerreiro no lado2 multiplicado pelo número de interceptadores

        // Verifica se a energia da Transpotadora está abaixo da metade da energia máxima e ativa a recuperação gelada
        if (getEnergia() < (getEnergiaMaxima() / 2)) {
            recuperaçãoGelada(champion);
        }
    }
    
    // Sobrescrita do método toString para retornar uma representação em string da Transpotadora
    @Override
    public String toString() {
        return "Transportadora";
    }
}



/*
 * Transportadora: Produz interceptadores que possuem ataque de 25 pontos de
 * energia. A cada vez que a Transportadora ataca cria um novo interceptador, ou
 * seja, no primeiro ataque possui um interceptador, no segundo dois
 * interceptadores, no terceiro três e assim sucessivamente até o limite de oito
 * interceptadores. As Transportadoras começam com 500 pontos de energia.
 * Quando a Transportadora é eliminada seus interceptadores também o são. Os
 * interceptadores não são atacados a Transportadora que é.
 */
