// package domain.terransCharacters;

// import java.util.LinkedList;

// import domain.abstracts.Guerreiro;
// import domain.abstracts.Terrans;
// import domain.nature.Natureza;

// public class CruzadorDeBatalha extends Terrans{

//     private int ataqueFinal = 0;

//     public CruzadorDeBatalha(String nome, int idade, double peso, Natureza type) {
//         super(nome, idade, peso, type);
//         this.setEnergia(1000);
//     }

//     @Override
//     public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
//         int dano = 50;
//         if(ataqueFinal == 3){
//             int life = lado2.get(0).getEnergia();
//             lado2.get(0).sofrerDano(life);;
//             this.ataqueFinal = 0;
//         }else{
//             lado2.get(0).sofrerDano(dano);
//             this.ataqueFinal += 1;
//         }
//     }   

//     @Override
//     public String toString() {
//         return "Cruzador de Batalha";
//     }
// }

package domain.terransCharacters;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Terrans;
import domain.nature.Natureza;

// Declaração da classe CruzadorDeBatalha que é uma subclasse de Terrans
public class CruzadorDeBatalha extends Terrans {

    private int ataqueFinal = 0; // Variável para rastrear o número de ataques finais

    // Construtor da classe CruzadorDeBatalha que chama o construtor da classe Terrans com os parâmetros fornecidos
    public CruzadorDeBatalha(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Terrans
        this.setEnergia(1000); // Define o nível de energia inicial como 1000
    }

    // Método implementado para atacar outros guerreiros
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        int dano = 50; // Quantidade de dano a ser causada

        if (ataqueFinal == 3) {
            // Se o ataqueFinal for igual a 3, realiza o ataque final
            int life = lado2.get(0).getEnergia(); // Obtém a energia do guerreiro no lado2
            lado2.get(0).sofrerDano(life); // Causa dano igual à energia atual, o que deve derrotar o guerreiro
            this.ataqueFinal = 0; // Reinicializa o contador de ataques finais
        } else {
            lado2.get(0).sofrerDano(dano); // Causa dano ao primeiro guerreiro no lado2
            this.ataqueFinal += 1; // Incrementa o contador de ataques finais
        }
    }

    // Sobrescrita do método toString para retornar uma representação em string do CruzadorDeBatalha
    @Override
    public String toString() {
        return "Cruzador de Batalha";
    }
}


/*
 * Cruzador de Batalha: unidade Terrana mais poderosa e “nasce” com 1000 pontos
 * de energia (é a única unidade Terrana que não “nasce” com 100 pontos de
 * energia). Possui um feixe de energia concentrada que automaticamente elimina o
 * adversário, independente se sua energia. Como precisa concentrar energia utiliza
 * esse feixe depois de fazer dois ataques comuns (que retiram 50 pontos de
 * energia). Após um ataque de feixe precisa fazer novamente dois ataques comuns
 * para fazer um novo ataque de feixe.
 */