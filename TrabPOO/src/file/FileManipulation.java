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
    
    public void lerDados1(Guerreiro campion, LinkedList<Guerreiro> ladoTerransProtoss){
        try{
            FileInputStream arquivo = new FileInputStream("arquivos/LadoTerransProtoss.txt");
            try(Scanner scan = new Scanner(arquivo)){
                while(scan.hasNext()){
                    int tipo = scan.nextInt();
                    String nome = scan.next();
                    int idade = scan.nextInt();
                    double peso = scan.nextDouble();

                    if(tipo == 1){
                        campion = new Soldado(nome,idade,peso);
                    }else if(tipo == 2){
                        campion = new Endiabrado(nome,idade,peso);
                    }else if(tipo == 3){
                        campion = new Ambunave(nome,idade,peso);
                    }else if(tipo == 4){
                        campion = new CruzadorDeBatalha(nome,idade,peso);
                    }else if(tipo == 5){
                        campion = new Fanaticus(nome,idade,peso);
                    }else if(tipo == 6){
                        campion = new Tormento(nome,idade,peso);
                    }else if(tipo == 7){
                        campion = new Colosso(nome,idade,peso);
                    }else if(tipo == 8){
                        campion = new Transpotadora(nome,idade,peso);
                    }else{
                        break;
                    }
                    ladoTerransProtoss.add(campion);
                }
            }
        }catch(FileNotFoundException erro){
            System.out.println("Erro na leitura de Arquivo");
        }
    }

    public void lerDados2(Guerreiro campion, LinkedList<Guerreiro> ladoZergsNagas){
        try{
            FileInputStream arquivo = new FileInputStream("arquivos/LadoZergsNagas.txt");
            try(Scanner scan = new Scanner(arquivo)){
                while(scan.hasNext()){
                    int tipo = scan.nextInt();
                    String nome = scan.next();
                    int idade = scan.nextInt();
                    double peso = scan.nextDouble();

                    if(tipo == 1){
                        campion = new Zergnideo(nome,idade,peso);
                    }else if(tipo == 2){
                        campion = new TatuBomba(nome,idade,peso);
                    }else if(tipo == 3){
                        campion = new Infestador(nome,idade,peso);
                    }else if(tipo == 4){
                        campion = new LordDasCastas(nome,idade,peso);
                    }else if(tipo == 5){
                        campion = new Servo(nome,idade,peso);
                    }else if(tipo == 6){
                        campion = new Devoradora(nome,idade,peso);
                    }else if(tipo == 7){
                        campion = new Empalador(nome,idade,peso);
                    }else{
                        break;
                    }
                    ladoZergsNagas.add(campion);
                }
            }
        }catch(FileNotFoundException erro){
            System.out.println("Erro na leitura de Arquivo");
        }
    }

}
