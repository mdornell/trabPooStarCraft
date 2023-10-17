package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

import characters.abstracts.Guerreiro;
import characters.terransCharacters.*;
import characters.nagasCharacters.*;
import characters.nature.*;
import characters.zergsCharacters.*;
import characters.protrossCharacter.*;




public class FileManipulation {
    
    public void lerDados1(Guerreiro champion, LinkedList<Guerreiro> lado1){
        try{
            FileInputStream arquivo = new FileInputStream("arquivos/LadoTerransProtoss.txt");
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
            FileInputStream arquivo = new FileInputStream("arquivos/LadoZergsNagas.txt");
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
