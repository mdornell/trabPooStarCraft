// package domain.protrossCharacter;

// import java.util.LinkedList;

// import domain.abstracts.Guerreiro;
// import domain.abstracts.Protoss;
// import domain.nature.Machanic;
// import domain.nature.Natureza;

// public class Tormento extends Protoss{

//     public Tormento(String nome, int idade, double peso, Natureza type) {
//         super(nome, idade, peso, type);
//     }

//     @Override
//     public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){

//         Guerreiro atacante = lado1.get(0);
//         int dano = 20;
//         lado2.get(0).sofrerDano(dano);

//         if(getEnergia() < (getEnenergiaMaxima()/2)){
//             recuperaçãoGelada(champion);
//         }

//         if(order){
//             creatingClone(atacante,lado1);
//         }
//     }

//     private void creatingClone(Guerreiro champion,LinkedList<Guerreiro> lista){
//         lista.remove(champion);
//         lista.addLast(champion);

//         Guerreiro clone = new CloneTormento(getNome(), getIdade(), getPeso(),new Machanic());
//         lista.addFirst(clone);
//     }

//     @Override
//     public String toString() {
//         return "Tormento";
//     }
// }

package domain.protrossCharacter;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Protoss;
import domain.nature.Machanic;
import domain.nature.Natureza;

// Declaração da classe Tormento que é uma subclasse de Protoss
public class Tormento extends Protoss {

    // Construtor da classe Tormento que chama o construtor da classe Protoss com os parâmetros fornecidos
    public Tormento(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Protoss
    }

    // Método implementado para atacar outros guerreiros
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        Guerreiro atacante = lado1.get(0); // Obtém o guerreiro atacante
        int dano = 20;
        lado2.get(0).sofrerDano(dano); // Causa dano ao primeiro guerreiro no lado2

        // Verifica se a energia do Tormento está abaixo da metade da energia máxima e ativa a recuperação gelada
        if (getEnergia() < (getEnergiaMaxima() / 2)) {
            recuperaçãoGelada(champion);
        }

        if (order) {
            creatingClone(atacante, lado1); // Cria um clone do guerreiro atacante
        }
    }

    // Método privado para criar um clone do guerreiro atacante
    private void creatingClone(Guerreiro champion, LinkedList<Guerreiro> lista) {
        lista.remove(champion); // Remove o guerreiro atacante da lista
        lista.addLast(champion); // Adiciona o guerreiro atacante de volta ao final da lista

        // Cria um clone do guerreiro atacante com tipo Machanic e adiciona-o ao início da lista
        Guerreiro clone = new CloneTormento(getNome(), getIdade(), getPeso(), new Machanic());
        lista.addFirst(clone);
    }

    // Sobrescrita do método toString para retornar uma representação em string do Tormento
    @Override
    public String toString() {
        return "Tormento";
    }
}

/*
 * Tormento: Seu ataque retira 30 pontos de energia. Se atacar primeiro, promove
 * seu ataque, gera um Clone Tormento (cujo ataque não promove dano) no inicio
 * da fila e vai para o final da fila, assim quem recebe o ataque é o Clone Tormento
 * e não o Tormento. O Clone Tormento possui energia inicial de 50 (não 100 como
 * a maioria dos Guerreiros). Se for o segundo a atacar, o Tormento apenas ataca e
 * vai para o final da fila.
 */