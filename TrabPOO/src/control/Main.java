package control;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import file.FileManipulation;

public class Main {
    public static void main(String[] args) {
        Guerreiro champion = null;
        FileManipulation fileMain = new FileManipulation();

        LinkedList<Guerreiro> LadoTerransProttoss = new LinkedList<Guerreiro>();
        LinkedList<Guerreiro> LadoZergsNagas = new LinkedList<Guerreiro>();

        fileMain.lerDados1(champion, LadoTerransProttoss);
        fileMain.lerDados2(champion, LadoZergsNagas); 

        BattlefieldMarco batalha = new BattlefieldMarco();
        batalha.battle(LadoTerransProttoss, LadoZergsNagas);
        
        
        // System.out.println("Lado: Terrans e Protoss");
        // imprimirDados(LadoTerransProttoss);
        // System.out.println("\n\nLado: Zergs e Nagas");
        // imprimirDados(LadoZergsNagas);
    }
    
    public static void imprimirDados(LinkedList<Guerreiro>Lado){
        for (Guerreiro champion : Lado) {
            System.out.println("Tipo: " + champion.toString() );
            System.out.println("Nome: " + champion.getNome());
            System.out.println("Idade: " + champion.getIdade());
            System.out.println("Peso :" + champion.getPeso());
            System.out.println("Energia : " + champion.getEnergia());
            System.out.println("=======================================");
        }  
    }
}
