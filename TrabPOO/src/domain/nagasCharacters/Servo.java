// package domain.nagasCharacters;

// import java.util.LinkedList;

// import domain.abstracts.Guerreiro;
// import domain.abstracts.Nagas;
// import domain.nature.Natureza;
// import domain.nature.Organic;

// public class Servo extends Nagas {

//     public Servo(String nome, int idade, double peso, Natureza type) {
//         super(nome, idade, peso, type);
//     }


//     @Override
//     public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order){
//         invenenar(lado1.get(0), lado2);
//     }

//     public void invenenar(Guerreiro individuo,LinkedList<Guerreiro> LadoTp){
//         if(individuo.getType() instanceof Organic){
//             Organic natureza = (Organic) individuo.getType();
//             natureza.envenenar();
//         }
//     }

//     @Override
//     public String toString() {
//         return "Servo";
//     }
    
// }

package domain.nagasCharacters;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import domain.abstracts.Nagas;
import domain.nature.Natureza;
import domain.nature.Organic;

// Declaração da classe Servo que é uma subclasse de Nagas
public class Servo extends Nagas {

    // Construtor da classe Servo que chama o construtor da classe Nagas com os parâmetros fornecidos
    public Servo(String nome, int idade, double peso, Natureza type) {
        super(nome, idade, peso, type); // Chama o construtor da classe Nagas
    }

    // Método implementado para atacar outro guerreiro
    @Override
    public void atacar(Guerreiro champion, LinkedList<Guerreiro> lado1, LinkedList<Guerreiro> lado2, boolean order) {
        invenenar(lado1.get(0), lado2); // Chama o método invenenar com base no campeão do lado1 e o lado2
    }

    // Método personalizado para envenenar um guerreiro orgânico
    public void invenenar(Guerreiro individuo, LinkedList<Guerreiro> LadoTp) {
        if (individuo.getType() instanceof Organic) {
            // Verifica se o tipo do guerreiro é orgânico (subtipo de Natureza)
            Organic natureza = (Organic) individuo.getType(); // Converte o tipo para Organic
            natureza.envenenar(); // Chama o método envenenar do tipo orgânico
        }
    }

    // Sobrescrita do método toString para retornar uma representação em string do Servo
    @Override
    public String toString() {
        return "Servo";
    }
}


/*
 * . Servo: unidade básica dos Naga. Não possuem ataque mas colocam um “broto de
 * veneno” em seus adversários. Esse “broto de veneno” retira 1 ponto de energia
 * toda vez que é ativado. Os “brotos de veneno” não afetam unidades mecânicas
 * (Endiabrado, Ambunave, Cruzador de Batalha, Colosso e Transportadora). A
 * ativação de “brotos de veneno” ocorre toda vez que o adversário ataca. Não há
 * limite para a quantidade de “brotos de veneno”
 */
