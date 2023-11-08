package control;

import java.util.LinkedList;

import domain.abstracts.Guerreiro;
import dao.FileManipulation;

public class Main {
    public static void main(String[] args) {
        Guerreiro champion = null; // Inicializa a variável Guerreiro champion como nulo.
        FileManipulation fileMain = new FileManipulation();

        LinkedList<Guerreiro> LadoTerransProttoss = new LinkedList<Guerreiro>(); // Cria uma lista para o lado Terrans e Protoss.
        LinkedList<Guerreiro> LadoZergsNagas = new LinkedList<Guerreiro>(); // Cria uma lista para o lado Zergs e Nagas.

        fileMain.lerDados1(champion, LadoTerransProttoss); // Lê os dados do primeiro grupo de guerreiros e armazena na lista LadoTerransProttoss.
        fileMain.lerDados2(champion, LadoZergsNagas);  // Lê os dados do segundo grupo de guerreiros e armazena na lista LadoZergsNagas.

        Battlefield batalha = new Battlefield(); // Cria uma instância da classe Battlefield para simular a batalha.
        batalha.battle(LadoTerransProttoss, LadoZergsNagas); // Inicia a simulação da batalha entre os dois grupos de guerreiros.
    }
    
    public static void imprimirDados(LinkedList<Guerreiro> Lado){
        for (Guerreiro champion : Lado) {
            System.out.println("Tipo: " + champion.toString() ); // Exibe o tipo do guerreiro.
            System.out.println("Nome: " + champion.getNome()); // Exibe o nome do guerreiro.
            System.out.println("Idade: " + champion.getIdade()); // Exibe a idade do guerreiro.
            System.out.println("Peso :" + champion.getPeso()); // Exibe o peso do guerreiro.
            System.out.println("Energia : " + champion.getEnergia()); // Exibe a energia do guerreiro.
            System.out.println("=======================================");
        }  
    }
}

