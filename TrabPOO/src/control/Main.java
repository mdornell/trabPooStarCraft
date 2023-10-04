package control;

import java.util.LinkedList;

import characters.abstracts.Guerreiro;
import file.FileManipulation;

public class Main {
    public static void main(String[] args) {
        Guerreiro campion = null;
        FileManipulation fileMain = new FileManipulation();

        LinkedList<Guerreiro> LadoTerransProttoss = new LinkedList<Guerreiro>();
        LinkedList<Guerreiro> LadoZergsNagas = new LinkedList<Guerreiro>();

        fileMain.lerDados1(campion, LadoTerransProttoss);
        fileMain.lerDados2(campion, LadoZergsNagas); 
        
        System.out.println("Lado: Terrans e Protoss");
        imprimirDados(LadoTerransProttoss);
        System.out.println("\n\nLado: Zergs e Nagas");
        imprimirDados(LadoZergsNagas);
    }
    
    public static void imprimirDados(LinkedList<Guerreiro>Lado){
        for (Guerreiro campion : Lado) {
            // System.out.println("Tipo: " + );
            campion.regenerat(415);
            System.out.println("Nome: " + campion.getNome());
            System.out.println("Idade: " + campion.getIdade());
            System.out.println("Peso :" + campion.getPeso());
            System.out.println("Energia : " + campion.getEnergia());
            System.out.println("=======================================");
        }  
    }
}
