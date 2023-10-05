package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

import characters.terransCharacters.*;
import characters.protrossCharacter.*;
import characters.zergsCharacters.*;
import characters.abstracts.Guerreiro;
import characters.nagasCharacters.*;



public class FileManipulation {
    
    public void lerDados1(Guerreiro champion, LinkedList<Guerreiro> ladoTerransProtoss){
        try{
            FileInputStream arquivo = new FileInputStream("arquivos/LadoTerransProtoss.txt");
            try(Scanner scan = new Scanner(arquivo)){
                while(scan.hasNext()){
                    int tipo = scan.nextInt();
                    String nome = scan.next();
                    int idade = scan.nextInt();
                    double peso = scan.nextDouble();

                    if(tipo == 1){
                        champion = new Soldado(nome,idade,peso);
                    }else if(tipo == 2){
                        champion = new Endiabrado(nome,idade,peso);
                    }else if(tipo == 3){
                        champion = new Ambunave(nome,idade,peso);
                    }else if(tipo == 4){
                        champion = new CruzadorDeBatalha(nome,idade,peso);
                    }else if(tipo == 5){
                        champion = new Fanaticus(nome,idade,peso);
                    }else if(tipo == 6){
                        champion = new Tormento(nome,idade,peso);
                    }else if(tipo == 7){
                        champion = new Colosso(nome,idade,peso);
                    }else if(tipo == 8){
                        champion = new Transpotadora(nome,idade,peso);
                    }else{
                        break;
                    }
                    ladoTerransProtoss.add(champion);
                }
            }
        }catch(FileNotFoundException erro){
            System.out.println("Erro na leitura de Arquivo");
        }
    }

    public void lerDados2(Guerreiro champion, LinkedList<Guerreiro> ladoZergsNagas){
        try{
            FileInputStream arquivo = new FileInputStream("arquivos/LadoZergsNagas.txt");
            try(Scanner scan = new Scanner(arquivo)){
                while(scan.hasNext()){
                    int tipo = scan.nextInt();
                    String nome = scan.next();
                    int idade = scan.nextInt();
                    double peso = scan.nextDouble();

                    if(tipo == 1){
                        champion = new Zergnideo(nome,idade,peso);
                    }else if(tipo == 2){
                        champion = new TatuBomba(nome,idade,peso);
                    }else if(tipo == 3){
                        champion = new Infestador(nome,idade,peso);
                    }else if(tipo == 4){
                        champion = new LordDasCastas(nome,idade,peso);
                    }else if(tipo == 5){
                        champion = new Servo(nome,idade,peso);
                    }else if(tipo == 6){
                        champion = new Devoradora(nome,idade,peso);
                    }else if(tipo == 7){
                        champion = new Empalador(nome,idade,peso);
                    }else{
                        break;
                    }
                    ladoZergsNagas.add(champion);
                }
            }
        }catch(FileNotFoundException erro){
            System.out.println("Erro na leitura de Arquivo");
        }
    }

}
