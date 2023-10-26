package dao;

import domain.nagasCharacters.Empalador;
import domain.nature.Machanic;
import domain.terransCharacters.CruzadorDeBatalha;
import domain.nature.Organic;
import domain.zergsCharacters.Zergnideo;
import domain.zergsCharacters.Infestador;
import domain.nagasCharacters.Servo;
import domain.protrossCharacter.Tormento;
import domain.zergsCharacters.TatuBomba;
import domain.nagasCharacters.Devoradora;
import domain.zergsCharacters.LordDasCastas;
import domain.protrossCharacter.Transpotadora;
import domain.protrossCharacter.Fanaticus;
import domain.terransCharacters.Endiabrado;
import domain.terransCharacters.Ambunave;
import domain.terransCharacters.Soldado;
import domain.protrossCharacter.Colosso;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

import domain.abstracts.Guerreiro;

public class FileManipulation {
    
    public void lerDados1(Guerreiro champion, LinkedList<Guerreiro> lado1){
        try{
            FileInputStream arquivo = new FileInputStream("files\\LadoTerransProtoss1.txt");
            try(Scanner scan = new Scanner(arquivo)){
                while(scan.hasNext()){
                    int tipo = scan.nextInt();
                    String nome = scan.next();
                    int idade = scan.nextInt();
                    double peso = scan.nextDouble();

                    if(tipo == 1){
                        champion = new Soldado(nome,idade,peso,new Organic());
                    }else if(tipo == 2){
                        champion = new Endiabrado(nome,idade,peso,new Machanic());
                    }else if(tipo == 3){
                        champion = new Ambunave(nome,idade,peso,new Machanic());
                    }else if(tipo == 4){
                        champion = new CruzadorDeBatalha(nome,idade,peso,new Machanic());
                    }else if(tipo == 5){
                        champion = new Fanaticus(nome,idade,peso,new Organic());
                    }else if(tipo == 6){
                        champion = new Tormento(nome,idade,peso,new Organic());
                    }else if(tipo == 7){
                        champion = new Colosso(nome,idade,peso,new Machanic());
                    }else if(tipo == 8){
                        champion = new Transpotadora(nome,idade,peso,new Machanic());
                    }else{
                        break;
                    }
                    lado1.add(champion);
                }
            }
        }catch(FileNotFoundException erro){
            System.out.println("Erro na leitura de Arquivo");
        }
    }

    public void lerDados2(Guerreiro champion, LinkedList<Guerreiro> lado2){
        try{
            FileInputStream arquivo = new FileInputStream("files\\LadoZergsNagas1.txt");
            try(Scanner scan = new Scanner(arquivo)){
                while(scan.hasNext()){
                    int tipo = scan.nextInt();
                    String nome = scan.next();
                    int idade = scan.nextInt();
                    double peso = scan.nextDouble();

                    if(tipo == 1){
                        champion = new Zergnideo(nome,idade,peso,new Organic());
                    }else if(tipo == 2){
                        champion = new TatuBomba(nome,idade,peso,new Organic());
                    }else if(tipo == 3){
                        champion = new Infestador(nome,idade,peso,new Organic());
                    }else if(tipo == 4){
                        champion = new LordDasCastas(nome,idade,peso,new Organic());
                    }else if(tipo == 5){
                        champion = new Servo(nome,idade,peso,new Organic());
                    }else if(tipo == 6){
                        champion = new Devoradora(nome,idade,peso,new Organic());
                    }else if(tipo == 7){
                        champion = new Empalador(nome,idade,peso,new Organic());
                    }else{
                        break;
                    }
                    lado2.add(champion);
                }
            }
        }catch(FileNotFoundException erro){
            System.out.println("Erro na leitura de Arquivo");
        }
    }

}
